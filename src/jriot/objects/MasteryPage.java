package jriot.objects;

import java.util.ArrayList;

public class MasteryPage {

    private boolean current;
    private long id;
    private ArrayList<Mastery> talents;
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

    public ArrayList<Mastery> getTalents() {
        return talents;
    }

    public void setTalents(ArrayList<Mastery> talents) {
        this.talents = talents;
    }

    @Override
    public String toString() {
        return "MasteryPage{" + "current=" + current + ", id=" + id + ", talents=" + talents + ", name=" + name + '}';
    }

}
