package jriot.objects;

import java.util.ArrayList;

public class SummonerNameList {

    private ArrayList<SummonerName> summoners;

    public ArrayList<SummonerName> getSummoners() {
        return summoners;
    }

    public void setSummoners(ArrayList<SummonerName> summoners) {
        this.summoners = summoners;
    }

    @Override
    public String toString() {
        return "SummonerNameList [summoners=" + summoners + "]";
    }

}
