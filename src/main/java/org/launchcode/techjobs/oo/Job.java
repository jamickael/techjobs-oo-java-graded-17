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
    public Job(int id) {
        this.id = id;
    }

    //constructor to initialize everything else and calls the first constructor to initialize id field
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this(nextId); //nextId might need to be changed.. this was a guess
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

//    @Override
//    public String toString() {
//        return "Job{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", employer=" + employer +
//                ", location=" + location +
//                ", positionType=" + positionType +
//                ", coreCompetency=" + coreCompetency +
//                '}';
//    }
}
