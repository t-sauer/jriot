package jriot.objects;

public class TeamId {

    private String fullId;

    public String getFullId() {
        return fullId;
    }

    public void setFullId(String fullId) {
        this.fullId = fullId;
    }

    @Override
    public String toString() {
        return "TeamId [fullId=" + fullId + "]";
    }

}
