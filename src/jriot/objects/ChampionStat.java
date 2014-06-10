package jriot.objects;

public class ChampionStat {

    private int count;
    private int id;
    private String name;
    private int value;

    @Override
    public String toString() {
        return "ChampionStat [count=" + count + ", id=" + id + ", name=" + name
                + ", value=" + value + "]";
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
