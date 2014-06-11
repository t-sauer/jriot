package jriot.objects;

import java.util.Map;
import java.util.ArrayList;

public class Rune {

    private String colloq;
    private boolean consumeOnFull;
    private boolean consumed;
    private int depth;
    private ArrayList<String> from;
    private Gold gold;
    private String group;
    private boolean hideFromAll;
    private Image image;
    private boolean inStore;
    private ArrayList<String> into;
    private Map<String, Boolean> maps;
    private String plaintext;
    private String RequiredChampion;
    private MetaData rune;
    private String sanitizedDescription;
    private int specialRecipe;
    private int stacks;
    private BasicDataStats stats;
    private ArrayList<String> tags;
    private String description;
    private int id;
    private String name;
    private int tier;

    public String getColloq() {
        return colloq;
    }

    public void setColloq(String colloq) {
        this.colloq = colloq;
    }

    public boolean getConsumeOnFull() {
        return consumeOnFull;
    }

    public void setConsumeOnFull(boolean consumeOnFull) {
        this.consumeOnFull = consumeOnFull;
    }

    public boolean getConsumed() {
        return consumed;
    }

    public void setConsumed(boolean consumed) {
        this.consumed = consumed;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getFrom() {
        return from;
    }

    public void setFrom(ArrayList<String> from) {
        this.from = from;
    }

    public Gold getGold() {
        return gold;
    }

    public void setGold(Gold gold) {
        this.gold = gold;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public boolean getHideFromAll() {
        return hideFromAll;
    }

    public void setHideFromAll(boolean hideFromAll) {
        this.hideFromAll = hideFromAll;
    }

    public int getId() {
        return id;
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

    public boolean getInStore() {
        return inStore;
    }

    public void setInStore(boolean inStore) {
        this.inStore = inStore;
    }

    public ArrayList<String> getInto() {
        return into;
    }

    public void setInto(ArrayList<String> into) {
        this.into = into;
    }

    public Map<String, Boolean> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Boolean> maps) {
        this.maps = maps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaintext() {
        return plaintext;
    }

    public void setPlaintext(String plaintext) {
        this.plaintext = plaintext;
    }

    public String getRequiredChampion() {
        return RequiredChampion;
    }

    public void setRequiredChampion(String RequiredChampion) {
        this.RequiredChampion = RequiredChampion;
    }

    public MetaData getRune() {
        return rune;
    }

    public void setRune(MetaData rune) {
        this.rune = rune;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public void setSanitizedDescription(String sanitizedDescription) {
        this.sanitizedDescription = sanitizedDescription;
    }

    public int getSpecialRecipe() {
        return specialRecipe;
    }

    public void setSpecialRecipe(int specialRecipe) {
        this.specialRecipe = specialRecipe;
    }

    public int getStacks() {
        return stacks;
    }

    public void setStacks(int stacks) {
        this.stacks = stacks;
    }

    public BasicDataStats getStats() {
        return stats;
    }

    public void setStats(BasicDataStats stats) {
        this.stats = stats;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    @Override
    public String toString() {
        return "Rune [description=" + description + ", id=" + id + ", name="
                + name + ", tier=" + tier + "]";
    }

}
