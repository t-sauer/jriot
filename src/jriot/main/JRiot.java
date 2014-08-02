package jriot.main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;

import java.util.List;
import java.util.Map;
import jriot.objects.*;

public class JRiot {

    private String apiKey;
    private String region = "na";

    public static final String RANKED_SOLO_5x5 = "RANKED_SOLO_5x5";
    public static final String RANKED_TEAM_5x5 = "RANKED_TEAM_5x5";
    public static final String RANKED_TEAM_3x3 = "RANKED_TEAM_3x3";

    Gson gson = new Gson();

    public JRiot(String key, String region) {
        this.apiKey = key;
        this.region = region;
    }

    public JRiot() {
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
     * Retrieve all champions.
     *
     * @return List of all champions.
     * @throws JRiotException
     */
    public ChampionList getChampions() throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String response = caller.request(generateBaseUrl() + "/v1.2/champion" + "?api_key=" + apiKey);
        ChampionList championList = gson.fromJson(response, ChampionList.class);
        return championList;
    }

    /**
     * Retrieve all free champions.
     *
     * @return List of all free champions.
     * @throws JRiotException
     */
    public ChampionList getFreeChampions() throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String response = caller.request(generateBaseUrl() + "/v1.2/champion" + "?freeToPlay=true&api_key=" + apiKey);
        ChampionList championList = gson.fromJson(response, ChampionList.class);
        return championList;
    }

    /**
     * Retrieve champion by ID.
     *
     * @param id champion to return
     * @return Info about champion
     * @throws JRiotException
     */
    public Champion getChampion(int id) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String response = caller.request(generateBaseUrl() + "/v1.2/champion/" + id + "?freeToPlay=true&api_key=" + apiKey);
        Champion champion = gson.fromJson(response, Champion.class);
        return champion;
    }

    /**
     * Get recent games by summoner ID.
     *
     * @param summonerId Id of a summoner.
     * @return RecentGames objects which contains the last played games.
     * @throws JRiotException
     */
    public RecentGames getRecentGames(long summonerId) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String response = caller.request(generateBaseUrl() + "/v1.3/game/by-summoner/" + summonerId + "/recent" + "?api_key=" + apiKey);
        RecentGames recentGames = gson.fromJson(response, RecentGames.class);
        return recentGames;
    }

    /**
     * Get Challenger tier leagues
     *
     * @param queue
     * @return Returns a League object for challenger solo
     * @throws JRiotException
     */
    public League getChallenger(String queue) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String response = caller.request(generateBaseUrl() + "/v2.4/league/challenger" + "?type=" + queue + "&api_key=" + apiKey);
        League challenger = gson.fromJson(response, League.class);
        return challenger;
    }

    /**
     * Get league entries by summoner ID for a given summoner ID.
     *
     * @param summonerId Ids of summoners
     * @return Returns a list containing all league entries
     * @throws JRiotException
     */
    public List<League> getLeagueEntries(long summonerId) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        ArrayList<Long> id = new ArrayList<>();
        id.add(summonerId);
        Map<String, List<League>> leagueEntries = getLeagueEntries(id);
        return leagueEntries.get(Long.toString(summonerId));
    }

    /**
     * Get league entries mapped by summoner ID for a given list of summoner
     * IDs.
     *
     * @param summonerIds Ids of summoners
     * @return Returns a Lists containing all league entries mapped by summoner;
     * @throws JRiotException
     */
    public Map<String, List<League>> getLeagueEntries(List<Long> summonerIds) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String ids = "";
        for (long i : summonerIds) {
            ids = ids + i + ",";
        }
        String response = caller.request(generateBaseUrl() + "/v2.4/league/by-summoner/" + ids + "/entry" + "?api_key=" + apiKey);
        Map<String, List<League>> leagueEntries = gson.fromJson(response, new TypeToken<Map<String, List<League>>>() {
        }.getType());
        return leagueEntries;
    }

    /**
     * Get league entries by team ID for a given team ID.
     *
     * @param teamId Ids of summoners
     * @return Returns a list containing all league entries
     * @throws JRiotException
     */
    public List<League> getLeagueEntriesByTeam(String teamId) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        ArrayList<String> id = new ArrayList<>();
        id.add(teamId);
        Map<String, List<League>> leagueEntries = getLeagueEntriesByTeam(id);
        return leagueEntries.get(teamId);
    }

    /**
     * Get league entries mapped by team ID for a given list of team IDs.
     *
     * @param teamIds Ids of teams
     * @return Returns a Lists containing all league entries mapped by summoner;
     * @throws JRiotException
     */
    public Map<String, List<League>> getLeagueEntriesByTeam(List<String> teamIds) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String ids = "";
        for (String i : teamIds) {
            ids = ids + i + ",";
        }
        String response = caller.request(generateBaseUrl() + "/v2.4/league/by-team/" + ids + "/entry" + "?api_key=" + apiKey);
        Map<String, List<League>> leagueEntries = gson.fromJson(response, new TypeToken<Map<String, List<League>>>() {
        }.getType());
        return leagueEntries;
    }

    /**
     * Get leagues mapped by summoner ID for a given list of summoner IDs.
     *
     * @param summonerIds Ids of summoners
     * @return Returns a Lists containing all leagues mapped by summoner;
     * @throws jriot.main.JRiotException
     */
    public Map<String, List<League>> getLeagues(List<Long> summonerIds) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String ids = "";
        for (long i : summonerIds) {
            ids = ids + i + ",";
        }
        String response = caller.request(generateBaseUrl() + "/v2.4/league/by-summoner/" + ids + "?api_key=" + apiKey);
        Map<String, List<League>> leagues = gson.fromJson(response, new TypeToken<Map<String, List<League>>>() {
        }.getType());
        return leagues;
    }

    /**
     * Get leagues for a given summoner ID..
     *
     * @param summonerId Id of summoner
     * @return Returns a List containing all leagues of a summoner.
     * @throws jriot.main.JRiotException
     */
    public List<League> getLeagues(long summonerId) throws JRiotException {
        ArrayList<Long> id = new ArrayList<>();
        id.add(summonerId);
        Map<String, List<League>> leagues = getLeagues(id);
        return leagues.get(Long.toString(summonerId));
    }

    /**
     * Get leagues mapped by team ID for a given list of team IDs.
     *
     * @param teamIds Ids of team
     * @return Returns a Lists containing all leagues mapped by team;
     * @throws jriot.main.JRiotException
     */
    public Map<String, List<League>> getLeaguesByTeams(List<String> teamIds) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String ids = "";
        for (String i : teamIds) {
            ids = ids + i + ",";
        }
        String response = caller.request(generateBaseUrl() + "/v2.4/league/by-team/" + ids + "?api_key=" + apiKey);
        Map<String, List<League>> leagues = gson.fromJson(response, new TypeToken<Map<String, List<League>>>() {
        }.getType());
        return leagues;
    }

    /**
     * Get leagues for a given team ID..
     *
     * @param teamId Id of team
     * @return Returns a List containing all leagues of a team.
     * @throws jriot.main.JRiotException
     */
    public List<League> getLeaguesByTeam(String teamId) throws JRiotException {
        ArrayList<String> id = new ArrayList<>();
        id.add(teamId);
        Map<String, List<League>> leagues = getLeaguesByTeams(id);
        return leagues.get(teamId);
    }

    /**
     * Get all player stats of a given summoner and a given season.
     *
     * @param summonerId Id of a summoner.
     * @param season Specifies the season you want the stats about (currently 3
     * or 4)
     * @return PlayerStatsSummaryList that contains the stats
     * @throws JRiotException
     */
    public PlayerStatsSummaryList getPlayerStatsSummaryList(long summonerId, int season) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String response = caller.request(generateBaseUrl() + "/v1.3/stats/by-summoner/" + summonerId + "/summary" + "?season=SEASON" + season + "&api_key=" + apiKey);
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
     * @throws JRiotException
     */
    public RankedStats getRankedStats(long summonerId, int season) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String response = caller.request(generateBaseUrl() + "/v1.3/stats/by-summoner/" + summonerId + "/ranked" + "?season=SEASON" + season + "&api_key=" + apiKey);
        RankedStats rankedStats = gson.fromJson(response, RankedStats.class);
        return rankedStats;
    }

    /**
     * Get all Mastery Pages of a given summoner.
     *
     * @param summonerId Id of a summoner.
     * @return MasteryPages mapped by summoner ID
     * @throws JRiotException
     */
    public MasteryPages getMasteryPages(long summonerId) throws JRiotException {
        ArrayList<Long> id = new ArrayList<>();
        id.add(summonerId);
        Map<String, MasteryPages> masteryPages = getMasteryPages(id);
        return masteryPages.get(Long.toString(summonerId));
    }

    /**
     * Get all Mastery Pages of a given List of summoners.
     *
     * @param summonerIds Ids of summoners.
     * @return MasteryPages mapped by summoner ID
     * @throws JRiotException
     */
    public Map<String, MasteryPages> getMasteryPages(List<Long> summonerIds) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String ids = "";
        for (long i : summonerIds) {
            ids = ids + i + ",";
        }
        String response = caller.request(generateBaseUrl() + "/v1.4/summoner/" + ids + "/masteries?api_key=" + apiKey);
        Map<String, MasteryPages> masteryPages = gson.fromJson(response, new TypeToken<Map<String, MasteryPages>>() {
        }.getType());
        return masteryPages;
    }

    /**
     * Get all Rune Pages of a given summoner.
     *
     * @param summonerId Id of a summoner.
     * @return RunePages mapped by summoner ID
     * @throws JRiotException
     */
    public RunePages getRunePages(long summonerId) throws JRiotException {
        ArrayList<Long> id = new ArrayList<>();
        id.add(summonerId);
        Map<String, RunePages> runePages = getRunePages(id);
        return runePages.get(Long.toString(summonerId));
    }

    /**
     * Get all Rune Pages of a given List of summoners.
     *
     * @param summonerIds Ids of summoners.
     * @return RunePages mapped by summoner ID
     * @throws JRiotException
     */
    public Map<String, RunePages> getRunePages(List<Long> summonerIds) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String ids = "";
        for (long i : summonerIds) {
            ids = ids + i + ",";
        }
        String response = caller.request(generateBaseUrl() + "/v1.4/summoner/" + ids + "/runes?api_key=" + apiKey);
        Map<String, RunePages> masteryPages = gson.fromJson(response, new TypeToken<Map<String, RunePages>>() {
        }.getType());
        return masteryPages;
    }

    /**
     * Get information about a given summoner.
     *
     * @param summonerId Id of a summoner.
     * @return Summoner object, containing information.
     * @throws JRiotException
     */
    public Summoner getSummoner(long summonerId) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        ArrayList<Long> id = new ArrayList<>();
        id.add(summonerId);
        Map<String, Summoner> summoner = getSummonersById(id);
        return summoner.get(Long.toString(summonerId));
    }

    /**
     * Get information about a given List of summoners.
     *
     * @param summonerIds Id of a summoner.
     * @return Summoner object, containing information.
     * @throws JRiotException
     */
    public Map<String, Summoner> getSummonersById(List<Long> summonerIds) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String ids = "";
        for (long i : summonerIds) {
            ids = ids + i + ",";
        }
        Gson gson = new GsonBuilder().setDateFormat("MM/dd/yyy HH:mm").create();
        String response = caller.request(generateBaseUrl() + "/v1.4/summoner/" + ids + "?api_key=" + apiKey);
        Map<String, Summoner> summoner = gson.fromJson(response, new TypeToken<Map<String, Summoner>>() {
        }.getType());
        return summoner;
    }

    /**
     * Get information about a given summoner.
     *
     * @param summonerName Name of a summoner.
     * @return Summoner object, containing information.
     * @throws JRiotException
     */
    public Summoner getSummoner(String summonerName) throws JRiotException {
        ArrayList<String> name = new ArrayList<>();
        name.add(summonerName);
        Map<String, Summoner> summoner = getSummonersByName(name);
        return summoner.get(summonerName.toLowerCase());
    }

    /**
     * Get information about a given List of summoners.
     *
     * @param summonerNames List of summoner names.
     * @return Summoner object, containing information.
     * @throws JRiotException
     */
    public Map<String, Summoner> getSummonersByName(List<String> summonerNames) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String names = "";
        for (String i : summonerNames) {
            names = names + i + ",";
        }
        Gson gson = new GsonBuilder().setDateFormat("MM/dd/yyy HH:mm").create();
        String response = caller.request(generateBaseUrl() + "/v1.4/summoner/by-name/" + names + "?api_key=" + apiKey);
        Map<String, Summoner> summoner = gson.fromJson(response, new TypeToken<Map<String, Summoner>>() {
        }.getType());
        return summoner;
    }

    /**
     * Get the summoner names for a list of IDs
     *
     * @param summonerIds List of summonerIds.
     * @return Summoner names mapped by ID summoners.
     * @throws JRiotException
     */
    public Map<String, String> getSummonerNames(List<Long> summonerIds) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String ids = "";
        for (long i : summonerIds) {
            ids = ids + i + ",";
        }
        String response = caller.request(generateBaseUrl() + "/v1.4/summoner/" + ids + "/name?api_key=" + apiKey);
        Map<String, String> summonerNameMap = gson.fromJson(response, new TypeToken<Map<String, String>>() {
        }.getType());
        return summonerNameMap;
    }

    /**
     * Get the summoner name for a given ID
     *
     * @param summonerId ID of a summoner.
     * @return Summoner names
     * @throws JRiotException
     */
    public String getSummonerName(long summonerId) throws JRiotException {
        ArrayList<Long> id = new ArrayList<>();
        id.add(summonerId);
        Map<String, String> summonerName = getSummonerNames(id);
        return summonerName.get(Long.toString(summonerId));
    }

    public List<Team> getTeams(long summonerId) throws JRiotException {
        ArrayList<Long> ids = new ArrayList<>();
        ids.add(summonerId);

        Map<String, List<Team>> teams = getTeamsBySummoner(ids);
        return teams.get(Long.toString(summonerId));
    }

    /**
     * Get all teams of a given summoner.
     *
     * @param summonerIds Id of a summoner.
     * @return A list containing Team objects.
     * @throws JRiotException
     */
    public Map<String, List<Team>> getTeamsBySummoner(List<Long> summonerIds) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        String ids = "";
        for (long i : summonerIds) {
            ids = ids + i + ",";
        }
        String response = caller.request(generateBaseUrl() + "/v2.3/team/by-summoner/" + ids + "?api_key=" + apiKey);
        Map<String, List<Team>> teams = gson.fromJson(response, new TypeToken<Map<String, List<Team>>>() {
        }.getType());
        return teams;
    }

    /**
     * Get teams mapped by team ID for a given list of team IDs.
     *
     * @param teamIds
     * @return
     * @throws JRiotException
     */
    public Map<String, Team> getTeams(List<String> teamIds) throws JRiotException {
        ApiCaller caller = new ApiCaller();
        StringBuilder builder = new StringBuilder();
        for (String s : teamIds) {
            builder.append(s);
            builder.append(",");
        }
        String response = caller.request(generateBaseUrl() + "/v2.3/team/" + builder.toString() + "?api_key=" + apiKey);
        
        Map<String, Team> teams = gson.fromJson(response, new TypeToken<Map<String, Team>>() {
        }.getType());
        return teams;
    }

    private String generateBaseUrl() {
        return  "https://" + region + ".api.pvp.net/api/lol/" + region;
    }

}
