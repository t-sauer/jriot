package jriot.main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import jriot.objects.ChampionList;
import jriot.objects.League;
import jriot.objects.LeagueItem;
import jriot.objects.MasteryPages;
import jriot.objects.PlayerStatsSummaryList;
import jriot.objects.RankedStats;
import jriot.objects.RecentGames;
import jriot.objects.RunePages;
import jriot.objects.Summoner;
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
        String response = caller.request(this.baseUrl + region + "/v1.3/game/by-summoner/" + summonerId + "/recent" + "?api_key=" + apiKey);
        RecentGames recentGames = gson.fromJson(response, RecentGames.class);
        return recentGames;

    }

    /**
     * Retrieve all Summoners currently in Challenger RANKED_SOLO_5x5
     *
     * @return Returns a League object which wraps all 200 leagueItems for
     * challenger solo
     * @throws JRiotException
     */
    public League getChallengerSolo5x5() throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String response = caller.request(this.baseUrl + region + "/v2.3/league/challenger" + "?type=RANKED_SOLO_5x5&api_key=" + apiKey);
        League challenger = gson.fromJson(response, League.class);
        return challenger;
    }

    /**
     * Retrieve all Teams currently in Challenger RANKED_TEAM_5x5
     *
     * @return Returns a League object which wraps all leagueItems for
     * challenger team_5vs5.
     * @throws JRiotException
     */
    public League getChallengerTeam5x5() throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String response = caller.request(this.baseUrl + region + "/v2.3/league/challenger" + "?type=RANKED_TEAM_5x5&api_key=" + apiKey);
        League challenger = gson.fromJson(response, League.class);
        return challenger;
    }

    /**
     * Retrieve all Teams currently in Challenger RANKED_TEAM_3x3
     *
     * @return Returns a League object which wraps all leagueItems for
     * challenger team_3vs3.
     * @throws JRiotException
     */
    public League getChallengerTeam3x3() throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String response = caller.request(this.baseUrl + region + "/v2.3/league/challenger" + "?type=RANKED_TEAM_3x3&api_key=" + apiKey);
        League challenger = gson.fromJson(response, League.class);
        return challenger;
    }

    /**
     * Get the current league entry data for a summoner including all of the
     * summoner's teams.
     *
     * @param summonerId Id of a summoner
     * @return Returns a list containing all league entries
     * @throws JRiotException
     */
    public List<LeagueItem> getLeagueEntry(long summonerId) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String response = caller.request(this.baseUrl + region + "/v2.3/league/by-summoner/" + summonerId + "/entry" + "?api_key=" + apiKey);
        List<LeagueItem> leagueEntry = gson.fromJson(response, new TypeToken<List<LeagueItem>>() {
        }.getType());
        return leagueEntry;
    }

    /**
     * Get all leagues of a given summoner.
     *
     * @param summonerId Id of a summoner.
     * @return Returns a List containing all leagues of a summoner.
     * @throws jriot.main.JRiotException
     */
    public List<League> getLeagues(long summonerId) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String response = caller.request(this.baseUrl + region + "/v2.3/league/by-summoner/" + summonerId + "?api_key=" + apiKey);
        List<League> leagues = gson.fromJson(response, new TypeToken<List<League>>() {
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
     * @return MasteryPages mapped by summoner ID
     * @throws jriot.main.JRiotException
     */
    public MasteryPages getMasteryPages(long summonerId) throws JRiotException {
        ArrayList<Long> id = new ArrayList<Long>();
        id.add(summonerId);
        Map<String, MasteryPages> masteryPages = getMasteryPages(id);
        return masteryPages.get(Long.toString(summonerId));
    }

    /**
     * Get all Mastery Pages of a given List of summoners.
     *
     * @param summonerIds Ids of summoners.
     * @return MasteryPages mapped by summoner ID
     * @throws jriot.main.JRiotException
     */
    public Map<String, MasteryPages> getMasteryPages(List<Long> summonerIds) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String ids = "";
        for (long i : summonerIds) {
            ids = ids + i + ",";
        }
        String response = caller.request(this.baseUrl + region + "/v1.3/summoner/" + ids + "/masteries?api_key=" + apiKey);
        Map<String, MasteryPages> masteryPages = gson.fromJson(response, new TypeToken<Map<String, MasteryPages>>() {
        }.getType());
        return masteryPages;
    }

    /**
     * Get all Rune Pages of a given summoner.
     *
     * @param summonerId Id of a summoner.
     * @return RunePages mapped by summoner ID
     * @throws jriot.main.JRiotException
     */
    public RunePages getRunePages(long summonerId) throws JRiotException {
        ArrayList<Long> id = new ArrayList<Long>();
        id.add(summonerId);
        Map<String, RunePages> runePages = getRunePages(id);
        return runePages.get(Long.toString(summonerId));
    }

    /**
     * Get all Rune Pages of a given List of summoners.
     *
     * @param summonerIds Ids of summoners.
     * @return RunePages mapped by summoner ID
     * @throws jriot.main.JRiotException
     */
    public Map<String, RunePages> getRunePages(List<Long> summonerIds) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String ids = "";
        for (long i : summonerIds) {
            ids = ids + i + ",";
        }
        String response = caller.request(this.baseUrl + region + "/v1.3/summoner/" + ids + "/runes?api_key=" + apiKey);
        Map<String, RunePages> masteryPages = gson.fromJson(response, new TypeToken<Map<String, RunePages>>() {
        }.getType());
        return masteryPages;
    }

    /**
     * Get information about a given summoner.
     *
     * @param summonerId Id of a summoner.
     * @return Summoner object, containing information.
     * @throws jriot.main.JRiotException
     */
    public Summoner getSummoner(long summonerId) throws JRiotException {
        ArrayList<Long> id = new ArrayList<Long>();
        id.add(summonerId);
        Map<String, Summoner> summoner = getSummonersById(id);
        return summoner.get(Long.toString(summonerId));
    }

    /**
     * Get information about a given List of summoners.
     *
     * @param summonerIds Id of a summoner.
     * @return Summoner object, containing information.
     * @throws jriot.main.JRiotException
     */
    public Map<String, Summoner> getSummonersById(List<Long> summonerIds) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String ids = "";
        for (long i : summonerIds) {
            ids = ids + i + ",";
        }
        Gson gson = new GsonBuilder().setDateFormat("MM/dd/yyy HH:mm").create();
        String response = caller.request(this.baseUrl + region + "/v1.3/summoner/" + ids + "?api_key=" + apiKey);
        Map<String, Summoner> summoner = gson.fromJson(response, new TypeToken<Map<String, Summoner>>() {
        }.getType());
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
        ArrayList<String> name = new ArrayList<String>();
        name.add(summonerName);
        Map<String, Summoner> summoner = getSummonersByName(name);
        return summoner.get(summonerName.toLowerCase());
    }

    /**
     * Get information about a given List of summoners.
     *
     * @param summonerNames List of summoner names.
     * @return Summoner object, containing information.
     * @throws jriot.main.JRiotException
     */
    public Map<String, Summoner> getSummonersByName(List<String> summonerNames) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String names = "";
        for (String i : summonerNames) {
            names = names + i + ",";
        }
        Gson gson = new GsonBuilder().setDateFormat("MM/dd/yyy HH:mm").create();
        String response = caller.request(this.baseUrl + region + "/v1.3/summoner/by-name/" + names + "?api_key=" + apiKey);
        Map<String, Summoner> summoner = gson.fromJson(response, new TypeToken<Map<String, Summoner>>() {
        }.getType());
        return summoner;
    }

    /**
     * Get the summoner names for a list of IDs
     *
     * @param summonerIds List of summonerIds.
     * @return Summoner names mapped by ID summoners.
     * @throws jriot.main.JRiotException
     */
    public Map<String, String> getSummonerNames(List<Long> summonerIds) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String ids = "";
        for (long i : summonerIds) {
            ids = ids + i + ",";
        }
        String response = caller.request(this.baseUrl + region + "/v1.3/summoner/" + ids + "/name?api_key=" + apiKey);
        Map<String, String> summonerNameMap = gson.fromJson(response, new TypeToken<Map<String, String>>() {
        }.getType());
        return summonerNameMap;
    }

    /**
     * Get the summoner name for a given ID
     *
     * @param summonerId ID of a summoner.
     * @return Summoner names
     * @throws jriot.main.JRiotException
     */
    public String getSummonerName(long summonerId) throws JRiotException {
        ArrayList<Long> id = new ArrayList<Long>();
        id.add(summonerId);
        Map<String, String> summonerName = getSummonerNames(id);
        return summonerName.get(Long.toString(summonerId));
    }

    /**
     * Get all teams of a given summoner.
     *
     * @param summonerId Id of a summoner.
     * @return A list containing Team objects.
     * @throws jriot.main.JRiotException
     */
    public List<Team> getTeams(long summonerId) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String response = caller.request(this.baseUrl + region + "/v2.2/team/by-summoner/" + summonerId + "?api_key=" + apiKey);
        List<Team> team = gson.fromJson(response, new TypeToken<List<Team>>() {
        }.getType());
        return team;
    }

}
