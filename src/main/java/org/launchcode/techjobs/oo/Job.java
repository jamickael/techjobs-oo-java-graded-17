package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. **The second constructor should also call the first in order to initialize
    //  the 'id' field.**

    //constructor to initialize a unique id
    public Job() {
        id = nextId;
        nextId++;
    }

    //constructor to initialize everything else and calls the first constructor to initialize id field
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    //equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    //getters
    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public int getId() {
        return id;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    //toString will exist down here.

    @Override
    public String toString() {
        String newLine = System.lineSeparator();

        if (name == null && employer == null && location == null && positionType == null && coreCompetency == null) {
            return "OOPS! This job does not seem to exist.";
        }

        return newLine +
                "ID: " + id + newLine +
                "Name: " + (!name.toString().isEmpty() ? name : "Data not available") + newLine +
                "Employer: " + (!employer.toString().isEmpty() ? employer : "Data not available") + newLine +
                "Location: " + (!location.toString().isEmpty() ? location : "Data not available") + newLine +
                "Position Type: " + (!positionType.toString().isEmpty() ? positionType : "Data not available") + newLine +
                "Core Competency: " + (!coreCompetency.toString().isEmpty() ? coreCompetency : "Data not available") +
                newLine;
    }
}
