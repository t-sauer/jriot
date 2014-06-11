package jriot.objects;

import java.util.HashSet;

public class MasteryPages {

    private HashSet<MasteryPage> pages;
    private long summonerId;

    public HashSet<MasteryPage> getPages() {
        return pages;
    }

    public void setPages(HashSet<MasteryPage> pages) {
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
        return "MasteryPages [pages=" + pages + ", summonerId=" + summonerId
                + "]";
    }

}
