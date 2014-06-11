package jriot.objects;

import java.util.Map;

public class SummonerSpellList {

    private Map<String, SummonerSpell> data;
    private String type;
    private String version;

    public Map<String, SummonerSpell> getData() {
        return data;
    }

    public void setData(Map<String, SummonerSpell> data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
