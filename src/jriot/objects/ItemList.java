package jriot.objects;

import java.util.Map;
import java.util.ArrayList;

public class ItemList {

    private BasicData basic;
    private Map<String, Item> data;
    private ArrayList<Group> groups;
    private ArrayList<ItemTree> tree;
    private String type;
    private String version;

    public BasicData getBasic() {
        return basic;
    }

    public void setBasic(BasicData basic) {
        this.basic = basic;
    }

    public Map<String, Item> getData() {
        return data;
    }

    public void setData(Map<String, Item> data) {
        this.data = data;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public ArrayList<ItemTree> getTree() {
        return tree;
    }

    public void setTree(ArrayList<ItemTree> tree) {
        this.tree = tree;
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
