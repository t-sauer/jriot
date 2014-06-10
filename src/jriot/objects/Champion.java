package jriot.objects;

import java.util.ArrayList;

public class Champion {

    private boolean active;
    private boolean botEnabled;
    private boolean botMmEnabled;
    private boolean freeToPlay;
    private boolean rankedPlayEnabled;
    private ArrayList<String> allytips;
    private ArrayList<String> enemytips;
    private ArrayList<String> tags;
    private ArrayList<Recommended> recommended;
    private ArrayList<Skin> skins;
    private ArrayList<ChampionSpell> spells;
    private String blurb;
    private String key;
    private String lore;
    private String name;
    private String partype;
    private String title;
    private long id;
    private Image image;
    private Info info;
    private Passive passive;
    private Stats stats;

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean getBotEnabled() {
        return botEnabled;
    }

    public void setBotEnabled(boolean botEnabled) {
        this.botEnabled = botEnabled;
    }

    public boolean getBotMmEnabled() {
        return botMmEnabled;
    }

    public void setBotMmEnabled(boolean botMmEnabled) {
        this.botMmEnabled = botMmEnabled;
    }

    public boolean getFreeToPlay() {
        return freeToPlay;
    }

    public void setFreeToPlay(boolean freeToPlay) {
        this.freeToPlay = freeToPlay;
    }

    public boolean getRankedPlayEnabled() {
        return rankedPlayEnabled;
    }

    public void setRankedPlayEnabled(boolean rankedPlayEnabled) {
        this.rankedPlayEnabled = rankedPlayEnabled;
    }

    public ArrayList<String> getAllytips() {
        return allytips;
    }

    public void set(ArrayList<String> allytips) {
        this.allytips = allytips;
    }

    public ArrayList<String> getEnemytips() {
        return enemytips;
    }

    public void setEnemytips(ArrayList<String> enemytips) {
        this.enemytips = enemytips;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public ArrayList<Recommended> getRecommended() {
        return recommended;
    }

    public void setRecommended(ArrayList<Recommended> recommended) {
        this.recommended = recommended;
    }

    public ArrayList<Skin> getSkins() {
        return skins;
    }

    public void setSkins(ArrayList<Skin> skins) {
        this.skins = skins;
    }

    public ArrayList<ChampionSpell> getSpells() {
        return spells;
    }

    public void setSpells(ArrayList<ChampionSpell> spells) {
        this.spells = spells;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPartype() {
        return partype;
    }

    public void setPartype(String partype) {
        this.partype = partype;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Passive getPassive() {
        return passive;
    }

    public void setPassive(Passive passive) {
        this.passive = passive;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
}
