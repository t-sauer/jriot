package jriot.objects;

import java.util.ArrayList;

public class MasteryTree {

    private ArrayList<MasteryTreeList> Defense;
    private ArrayList<MasteryTreeList> Offense;
    private ArrayList<MasteryTreeList> Utility;

    public ArrayList<MasteryTreeList> getDefense() {
        return Defense;
    }

    public void setDefense(ArrayList<MasteryTreeList> Defense) {
        this.Defense = Defense;
    }

    public ArrayList<MasteryTreeList> getOffense() {
        return Offense;
    }

    public void setOffense(ArrayList<MasteryTreeList> Offense) {
        this.Offense = Offense;
    }

    public ArrayList<MasteryTreeList> getUtility() {
        return Utility;
    }

    public void setUtility(ArrayList<MasteryTreeList> Utility) {
        this.Utility = Utility;
    }
}
