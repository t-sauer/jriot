package jriot.objects;

import java.util.ArrayList;

public class TeamStatSummary {

    private TeamId teamId;
    private ArrayList<TeamStatDetail> teamStatDetails;

    public TeamId getTeamId() {
        return teamId;
    }

    public void setTeamId(TeamId teamId) {
        this.teamId = teamId;
    }

    public ArrayList<TeamStatDetail> getTeamStatDetails() {
        return teamStatDetails;
    }

    public void setTeamStatDetails(ArrayList<TeamStatDetail> teamStatDetails) {
        this.teamStatDetails = teamStatDetails;
    }

    @Override
    public String toString() {
        return "TeamStatSummary [teamId=" + teamId + ", teamStatDetails="
                + teamStatDetails + "]";
    }

}
