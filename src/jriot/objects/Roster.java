package jriot.objects;

import java.util.ArrayList;

public class Roster {

    private ArrayList<TeamMemberInfo> memberList;
    private long ownerId;

    public ArrayList<TeamMemberInfo> getMemberList() {
        return memberList;
    }

    public void setMemberList(ArrayList<TeamMemberInfo> memberList) {
        this.memberList = memberList;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public String toString() {
        return "Roster [memberList=" + memberList + ", ownerId=" + ownerId
                + "]";
    }

}
