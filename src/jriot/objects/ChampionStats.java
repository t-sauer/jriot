package jriot.objects;

public class ChampionStats {

    private int id;
    private AggregatedStats stats;

    @Override
    public String toString() {
        return "ChampionStats [id=" + id + ", stats="
                + stats + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AggregatedStats getStats() {
        return stats;
    }

    public void setStats(AggregatedStats stats) {
        this.stats = stats;
    }

}
