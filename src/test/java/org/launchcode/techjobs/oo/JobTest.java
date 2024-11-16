package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job firstJob = new Job();
        Job secondJob = new Job();
        assertNotEquals(firstJob, secondJob);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob.getName() instanceof String);
        assertEquals("Product tester", testJob.getName());

        assertTrue(testJob.getEmployer() instanceof Employer);
        assertEquals("ACME", testJob.getEmployer().getValue());

        assertTrue(testJob.getLocation() instanceof Location);
        assertEquals("Desert", testJob.getLocation().getValue());

        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertEquals("Quality control", testJob.getPositionType().getValue());

        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", testJob.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job firstJob = new Job("Senior Service Specialist II", new Employer("Edward Jones"), new Location("Saint Louis"), new PositionType("Call Center"), new CoreCompetency("Mental Fortitude"));
        Job secondJob = new Job("Senior Service Specialist II", new Employer("Edward Jones"), new Location("Saint Louis"), new PositionType("Call Center"), new CoreCompetency("Mental Fortitude"));
        assertFalse(firstJob.equals(secondJob));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob = new Job("Senior Service Specialist II", new Employer("Edward Jones"), new Location("Saint Louis"), new PositionType("Call Center"), new CoreCompetency("Mental Fortitude"));
        String jobOutput = testJob.toString();
        assertTrue(jobOutput.startsWith(System.lineSeparator()) && jobOutput.endsWith(System.lineSeparator()));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob = new Job("Senior Service Specialist II", new Employer("Edward Jones"), new Location("Saint Louis"), new PositionType("Call Center"), new CoreCompetency("Mental Fortitude"));
        String jobOutput = testJob.toString();
        String newLine = System.lineSeparator();
        String expectedOutput = newLine +
                "ID: " + testJob.getId() + newLine +
                "Name: Senior Service Specialist II" + newLine +
                "Employer: Edward Jones" + newLine +
                "Location: Saint Louis" + newLine +
                "Position Type: Call Center" + newLine +
                "Core Competency: Mental Fortitude" + newLine;
        assertEquals(expectedOutput, jobOutput);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job testJob = new Job("Senior Service Specialist II", new Employer("Edward Jones"), new Location(""), new PositionType("Call Center"), new CoreCompetency("Mental Fortitude"));
        String jobOutput = testJob.toString();
        String newLine = System.lineSeparator();
        String expectedOutput = newLine +
                "ID: " + testJob.getId() + newLine +
                "Name: Senior Service Specialist II" + newLine +
                "Employer: Edward Jones" + newLine +
                "Location: Data not available" + newLine +
                "Position Type: Call Center" + newLine +
                "Core Competency: Mental Fortitude" + newLine;
        assertEquals(expectedOutput, jobOutput);
    }

}
