package jriot.objects;

import java.util.Map;

public class RuneList {

    private BasicData basic;
    private Map<String, Rune> data;
    private String type;
    private String version;

    public BasicData getBasic() {
        return basic;
    }

    public void setBasic(BasicData basic) {
        this.basic = basic;
    }

    public Map<String, Rune> getData() {
        return data;
    }

    public void setData(Map<String, Rune> data) {
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
