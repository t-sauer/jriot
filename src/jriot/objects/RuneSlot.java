package jriot.objects;

public class RuneSlot {

    private int runeId;
    private int runeSlotId;

    public int getRuneId() {
        return runeId;
    }

    public void setRuneId(int runeId) {
        this.runeId = runeId;
    }

    public int getRuneSlotId() {
        return runeSlotId;
    }

    public void setRuneSlotId(int runeSlotId) {
        this.runeSlotId = runeSlotId;
    }

    @Override
    public String toString() {
        return "RuneSlot{" + "runeId=" + runeId + ", runeSlotId=" + runeSlotId + '}';
    }

}
