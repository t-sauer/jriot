package jriot.objects;

public class MiniSeries {

    private int losses;
    private String progress;
    private int target;
    private int wins;

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    @Override
    public String toString() {
        return "MiniSeries{" + "losses=" + losses + ", progress=" + progress + ", target=" + target + ", wins=" + wins + '}';
    }

}
