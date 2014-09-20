package jriot.objects;

public class ParticipantIdentity {
    private int participantId;
    private Player player;

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public class Player {
        private String matchHistoryUri;
        private int profileIcon;
        private String summonerName;

        public int getProfileIcon() {
            return profileIcon;
        }

        public void setProfileIcon(int profileIcon) {
            this.profileIcon = profileIcon;
        }

        public String getMatchHistoryUri() {
            return matchHistoryUri;
        }

        public void setMatchHistoryUri(String matchHistoryUri) {
            this.matchHistoryUri = matchHistoryUri;
        }

        public String getSummonerName() {
            return summonerName;
        }

        public void setSummonerName(String summonerName) {
            this.summonerName = summonerName;
        }
    }
}
