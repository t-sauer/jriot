package jriot.main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import jriot.objects.ChampionList;
import jriot.objects.League;
import jriot.objects.MasteryPages;
import jriot.objects.PlayerStatsSummaryList;
import jriot.objects.RankedStats;
import jriot.objects.RecentGames;
import jriot.objects.RunePages;
import jriot.objects.Summoner;
import jriot.objects.SummonerNameList;
import jriot.objects.Team;

public class JRiot {

    private String apiKey;
    private String region = "na";

    private String baseUrl = "https://prod.api.pvp.net/api/lol/";

    Gson gson = new Gson();

    public JRiot(String key, String region) {
        super();

        this.setApiKey(key);
        this.setRegion(region);
    }

    public JRiot() {
        super();
    }

    /**
     * Sets the API key you want to use.
     *
     * @param key Your API key.
     */
    public void setApiKey(String key) {
        this.apiKey = key;
    }

    /**
     * Sets the region where to get the data from.
     *
     * @param region the region (EUNE, EUW, NA, BR, TR).
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Retrieve all current champions.
     *
     * @return List of all Champions.
     * @throws jriot.main.JRiotException
     */
    public ChampionList getChampions() throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String response = caller.request(this.baseUrl + region + "/v1.1/champion" + "?api_key=" + apiKey);
        ChampionList championList = gson.fromJson(response, ChampionList.class);
        return championList;
    }

    /**
     * Retrieve all free champions.
     *
     * @return List of all free Champions.
     * @throws jriot.main.JRiotException
     */
    public ChampionList getFreeChampions() throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String response = caller.request(this.baseUrl + region + "/v1.1/champion" + "?freeToPlay=true&api_key=" + apiKey);
        ChampionList championList = gson.fromJson(response, ChampionList.class);

        return championList;
    }

    /**
     * Get recently played games by a given summoner.
     *
     * @param summonerId Id of a summoner.
     * @return RecentGames objects which contains the last played games.
     * @throws jriot.main.JRiotException
     */
    public RecentGames getRecentGames(long summonerId) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String response = caller.request(this.baseUrl + region + "/v1.2/game/by-summoner/" + summonerId + "/recent" + "?api_key=" + apiKey);
        RecentGames recentGames = gson.fromJson(response, RecentGames.class);

        return recentGames;

    }

    /**
     * Get all leagues of a given summoner.
     *
     * @param summonerId Id of a summoner.
     * @return Returns a map of either the summonerId (in case of solo queue) or
     * the teamId with the corresponding league.
     * @throws jriot.main.JRiotException
     */
    public Map<String, League> getLeagues(long summonerId) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String response = caller.request(this.baseUrl + region + "/v2.2/league/by-summoner/" + summonerId + "?api_key=" + apiKey);
        Map<String, League> leagues = gson.fromJson(response, new TypeToken<Map<String, League>>() {
        }.getType());

        return leagues;

    }

    /**
     * Get all player stats of a given summoner and a given season.
     *
     * @param summonerId Id of a summoner.
     * @param season Specifies the season you want the stats about (currently 3
     * or 4)
     * @return PlayerStatsSummaryList that contains the stats
     * @throws jriot.main.JRiotException
     */
    public PlayerStatsSummaryList getPlayerStatsSummaryList(long summonerId, int season) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String response = caller.request(this.baseUrl + region + "/v1.2/stats/by-summoner/" + summonerId + "/summary" + "?season=SEASON" + season + "&api_key=" + apiKey);
        PlayerStatsSummaryList playerStatsSummaryList = gson.fromJson(response, PlayerStatsSummaryList.class);

        return playerStatsSummaryList;
    }

    /**
     * Get all ranked stats of a given summoner and a given season.
     *
     * @param summonerId Id of a summoner.
     * @param season Specifies the season you want the stats about (currently 3
     * or 4)
     * @return Ranked that contains the stats.
     * @throws jriot.main.JRiotException
     */
    public RankedStats getRankedStats(long summonerId, int season) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String response = caller.request(this.baseUrl + region + "/v1.2/stats/by-summoner/" + summonerId + "/ranked" + "?season=SEASON" + season + "&api_key=" + apiKey);
        RankedStats rankedStats = gson.fromJson(response, RankedStats.class);

        return rankedStats;
    }

    /**
     * Get all Mastery Pages of a given summoner.
     *
     * @param summonerId Id of a summoner.
     * @return MasteryPages object that contains a list of all Mastery Pages
     * @throws jriot.main.JRiotException
     */
    public MasteryPages getMasteryPages(long summonerId) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String response = caller.request(this.baseUrl + region + "/v1.2/summoner/" + summonerId + "/masteries?api_key=" + apiKey);
        MasteryPages masteryPages = gson.fromJson(response, MasteryPages.class);

        return masteryPages;
    }

    /**
     * Get all Rune Pages of a given summoner.
     *
     * @param summonerId Id of a summoner.
     * @return RunePages object that contains a list of all Rune Pages
     * @throws jriot.main.JRiotException
     */
    public RunePages getRunePages(long summonerId) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String response = caller.request(this.baseUrl + region + "/v1.2/summoner/" + summonerId + "/runes?api_key=" + apiKey);
        RunePages runePages = gson.fromJson(response, RunePages.class);

        return runePages;
    }

    /**
     * Get information about a given summoner.
     *
     * @param summonerId Id of a summoner.
     * @return Summoner object, containing information.
     * @throws jriot.main.JRiotException
     */
    public Summoner getSummoner(long summonerId) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        Gson gson = new GsonBuilder().setDateFormat("MM/dd/yyy HH:mm").create();
        String response = caller.request(this.baseUrl + region + "/v1.2/summoner/" + summonerId + "?api_key=" + apiKey);
        Summoner summoner = gson.fromJson(response, Summoner.class);

        return summoner;
    }

    /**
     * Get information about a given summoner.
     *
     * @param summonerName Name of a summoner.
     * @return Summoner object, containing information.
     * @throws jriot.main.JRiotException
     */
    public Summoner getSummoner(String summonerName) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        Gson gson = new GsonBuilder().setDateFormat("MM/dd/yyy HH:mm").create();
        String response = caller.request(this.baseUrl + region + "/v1.2/summoner/by-name/" + summonerName + "?api_key=" + apiKey);
        Summoner summoner = gson.fromJson(response, Summoner.class);
        return summoner;
    }

    /**
     * Get information about more than one summoner at the same time.
     *
     * @param summonerIds List of summonerIds.
     * @return SummonerNameList containing the information about the given
     * summoners.
     * @throws jriot.main.JRiotException
     */
    public SummonerNameList getSummoners(List<Long> summonerIds) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String ids = "";
        for (long i : summonerIds) {
            ids = ids + i + ",";
        }
        String response = caller.request(this.baseUrl + region + "/v1.2/summoner/" + ids + "/name?api_key=" + apiKey);
        SummonerNameList summonerNameList = gson.fromJson(response, SummonerNameList.class);

        return summonerNameList;
    }

    /**
     * Get all teams of a given summoner.
     *
     * @param summonerId Id of a summoner.
     * @return A list containing Team objects.
     * @throws jriot.main.JRiotException
     */
    public ArrayList<Team> getTeams(long summonerId) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String response = caller.request(this.baseUrl + region + "/v2.2/team/by-summoner/" + summonerId + "?api_key=" + apiKey);

        ArrayList<Team> team = gson.fromJson(response, new TypeToken<ArrayList<Team>>() {
        }.getType());

        return team;
    }

}
