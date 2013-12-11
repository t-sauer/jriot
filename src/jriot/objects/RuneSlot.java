package jriot.objects;

public class RuneSlot {
	
	private Rune rune;
	private int runeSlotId;
	public Rune getRune() {
		return rune;
	}
	public void setRune(Rune rune) {
		this.rune = rune;
	}
	public int getRuneSlotId() {
		return runeSlotId;
	}
	public void setRuneSlotId(int runeSlotId) {
		this.runeSlotId = runeSlotId;
	}
	@Override
	public String toString() {
		return "RuneSlot [rune=" + rune + ", runeSlotId=" + runeSlotId + "]";
	}
	
	

}
