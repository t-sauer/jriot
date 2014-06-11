package jriot.objects;

import java.util.ArrayList;

public class MasteryPage {

    private boolean current;
    private long id;
    private ArrayList<Mastery> masteries;
    private String name;

    public boolean isCurrent() {
        return current;
    }

    public void setCurrent(boolean current) {
        this.current = current;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Mastery> getMasteries() {
        return masteries;
    }

    public void setMasteries(ArrayList<Mastery> masteries) {
        this.masteries = masteries;
    }

    @Override
    public String toString() {
        return "MasteryPage{" + "current=" + current + ", id=" + id + ", masteries=" + masteries + ", name=" + name + '}';
    }

}
