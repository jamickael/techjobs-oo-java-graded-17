package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency {

    private int id;
    private static int nextId = 1;
    private String value;

    public CoreCompetency() {
        this.id = nextId;
        nextId++;
    }

    public CoreCompetency(String value) {
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    //getters
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    //setters
    public void setValue(String value) {
        this.value = value;
    }
}
