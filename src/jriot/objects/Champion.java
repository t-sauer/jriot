package jriot.objects;

public class Champion {

    private boolean active;
    private boolean botEnabled;
    private boolean botMmEnabled;
    private boolean freeToPlay;
    private long id;
    private boolean rankedPlayEnabled;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isBotEnabled() {
        return botEnabled;
    }

    public void setBotEnabled(boolean botEnabled) {
        this.botEnabled = botEnabled;
    }

    public boolean isBotMmEnabled() {
        return botMmEnabled;
    }

    public void setBotMmEnabled(boolean botMmEnabled) {
        this.botMmEnabled = botMmEnabled;
    }

    public boolean isFreeToPlay() {
        return freeToPlay;
    }

    public void setFreeToPlay(boolean freeToPlay) {
        this.freeToPlay = freeToPlay;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isRankedPlayEnabled() {
        return rankedPlayEnabled;
    }

    public void setRankedPlayEnabled(boolean rankedPlayEnabled) {
        this.rankedPlayEnabled = rankedPlayEnabled;
    }

    @Override
    public String toString() {
        return "Champion{" + "active=" + active + ", botEnabled=" + botEnabled + ", botMmEnabled=" + botMmEnabled + ", freeToPlay=" + freeToPlay + ", id=" + id + ", rankedPlayEnabled=" + rankedPlayEnabled + '}';
    }

}
