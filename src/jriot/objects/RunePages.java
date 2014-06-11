package jriot.objects;

import java.util.ArrayList;

public class RunePages {

    private ArrayList<RunePage> pages;
    private long summonerId;

    public ArrayList<RunePage> getPages() {
        return pages;
    }

    public void setPages(ArrayList<RunePage> pages) {
        this.pages = pages;
    }

    public long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(long summonerId) {
        this.summonerId = summonerId;
    }

    @Override
    public String toString() {
        return "RunePages [pages=" + pages + ", summonerId=" + summonerId + "]";
    }

}
