package jriot.objects;

import java.util.ArrayList;

public class SummonerSpell {

    private ArrayList<Double> cooldown;
    private ArrayList<Integer> cost;
    private ArrayList<Object> effect;
    private ArrayList<String> effectBurn;
    private ArrayList<String> modes;
    private ArrayList<SpellVars> vars;
    private String coolDownBurn;
    private String costBurn;
    private String costType;
    private String description;
    private String key;
    private String name;
    private String rangeBurn;
    private String resource;
    private String sanitizedDescription;
    private String sanitizedTooltip;
    private String tooltip;
    private int id;
    private Image image;
    private LevelTip leveltip;
    private int maxrank;
    private Object range;
    private int summonerLevel;

    public ArrayList<Double> getCooldown() {
        return cooldown;
    }

    public void setCooldown(ArrayList<Double> cooldown) {
        this.cooldown = cooldown;
    }

    public ArrayList<Integer> getCost() {
        return cost;
    }

    public void setCost(ArrayList<Integer> cost) {
        this.cost = cost;
    }

    public ArrayList<Object> getEffect() {
        return effect;
    }

    public void setEffect(ArrayList<Object> effect) {
        this.effect = effect;
    }

    public ArrayList<String> getEffectBurn() {
        return effectBurn;
    }

    public void setEffectBurn(ArrayList<String> effectBurn) {
        this.effectBurn = effectBurn;
    }

    public ArrayList<String> getModes() {
        return modes;
    }

    public void setModes(ArrayList<String> modes) {
        this.modes = modes;
    }

    public ArrayList<SpellVars> getVars() {
        return vars;
    }

    public void setVars(ArrayList<SpellVars> vars) {
        this.vars = vars;
    }

    public String getCoolDownBurn() {
        return coolDownBurn;
    }

    public void setCoolDownBurn(String coolDownBurn) {
        this.coolDownBurn = coolDownBurn;
    }

    public String getCostBurn() {
        return costBurn;
    }

    public void setCostBurn(String costBurn) {
        this.costBurn = costBurn;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRangeBurn() {
        return rangeBurn;
    }

    public void setRangeBurn(String rangeBurn) {
        this.rangeBurn = rangeBurn;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public void setSanitizedDescription(String sanitizedDescription) {
        this.sanitizedDescription = sanitizedDescription;
    }

    public String getSanitizedTooltip() {
        return sanitizedTooltip;
    }

    public void setSanitizedTooltip(String sanitizedTooltip) {
        this.sanitizedTooltip = sanitizedTooltip;
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
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

    public LevelTip getLeveltip() {
        return leveltip;
    }

    public void setLeveltip(LevelTip leveltip) {
        this.leveltip = leveltip;
    }

    public int getMaxrank() {
        return maxrank;
    }

    public void setMaxrank(int maxrank) {
        this.maxrank = maxrank;
    }

    public Object getRange() {
        return range;
    }

    public void setRange(Object range) {
        this.range = range;
    }

    public int getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(int summonerLevel) {
        this.summonerLevel = summonerLevel;
    }
}
