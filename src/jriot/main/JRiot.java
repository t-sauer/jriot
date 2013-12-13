package jriot.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import jriot.objects.*;


public class JRiot {
	
	private String apiKey;
	private String region;
	
	private String baseURL1 = "https://prod.api.pvp.net/api/lol/na/v1.1/";
	private String baseURL2 = "https://prod.api.pvp.net/api/na/v2.1/";
	
	
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
		
		this.baseURL1 = "https://prod.api.pvp.net/api/lol/" + region + "/v1.1/";
		this.baseURL2 = "https://prod.api.pvp.net/api/" + region + "/v2.1/";
		
		this.region = region;
		
	}
	
	/**
	 * Retrieve all current champions.
	 * 
	 * @return List of all Champions.
	 */
	public ChampionList getChampions() {
		ApiCaller caller = new ApiCaller();
		String response = caller.request(this.baseURL1 + "champion"+"?api_key="+apiKey);
		ChampionList championList = gson.fromJson(response, ChampionList.class);
		
		return championList;
	}
	
	/**
	 * Retrieve all free champions.
	 * 
	 * @return List of all free Champions.
	 */
	public ChampionList getFreeChampions() {
		ApiCaller caller = new ApiCaller();
		String response = caller.request(this.baseURL1 + "champion"+"?freeToPlay=true&api_key="+apiKey);
		ChampionList championList = gson.fromJson(response, ChampionList.class);
		
		return championList;
	}
	
	/**
	 * Get recently played games by a given summoner.
	 * 
	 * @param summonerId Id of a summoner.
	 * @return RecentGames objects which contains the last played games.
	 */
	public RecentGames getRecentGames(long summonerId) {
		ApiCaller caller = new ApiCaller();
		String response = caller.request(this.baseURL1 + "game/by-summoner/"+summonerId+"/recent"+"?api_key="+apiKey);
		RecentGames recentGames = gson.fromJson(response, RecentGames.class);
		
		return recentGames;
		
	}
	
	/**
	 * Get all leagues of a given summoner.
	 * 
	 * @param summonerId Id of a summoner.
	 * @return Returns a map of either the summonerId (in case of solo queue) 
	 * 			or the teamId with the corresponding league.
	 */
	public Map<String, League> getLeagues(long summonerId) {
		ApiCaller caller = new ApiCaller();
		String response = caller.request(this.baseURL2 + "league/by-summoner/"+summonerId+"?api_key="+apiKey);
		Map<String, League> leagues =  gson.fromJson(response, new TypeToken<Map<String, League>>(){}.getType());
		
		return leagues;
		
	}
	
	/**
	 * Get all player stats of a given summoner and a given season. 
	 * 
	 * @param summonerId Id of a summoner.
	 * @param season Specifies the season you want the stats about (currently 3 or 4)
	 * @return PlayerStatsSummaryList that contains the stats
	 */
	public PlayerStatsSummaryList getPlayerStatsSummaryList(long summonerId, int season) {
		ApiCaller caller = new ApiCaller();
		String response = caller.request(this.baseURL1 + "stats/by-summoner/"+summonerId+"/summary"+"?season=SEASON"+season+"&api_key="+apiKey);
		PlayerStatsSummaryList playerStatsSummaryList = gson.fromJson(response, PlayerStatsSummaryList.class);
		
		return playerStatsSummaryList;
	}
	
	/**
	 * Get all ranked stats of a given summoner and a given season. 
	 * 
	 * @param summonerId Id of a summoner.
	 * @param season Specifies the season you want the stats about (currently 3 or 4)
	 * @return Ranked that contains the stats.
	 */
	public RankedStats getRankedStats(long summonerId, int season) {
		ApiCaller caller = new ApiCaller();
		String response = caller.request(this.baseURL1 + "stats/by-summoner/"+summonerId+"/ranked"+"?season=SEASON"+season+"&api_key="+apiKey);
		RankedStats rankedStats = gson.fromJson(response, RankedStats.class);
		
		return rankedStats;
	}
	
	/**
	 * Get all Mastery Pages of a given summoner.
	 * 
	 * @param summonerId Id of a summoner.
	 * @return MasteryPages object that contains a list of all Mastery Pages
	 */
	public MasteryPages getMasteryPages(long summonerId) {
		ApiCaller caller = new ApiCaller();
		String response = caller.request(this.baseURL1 + "summoner/"+summonerId+"/masteries?api_key="+apiKey);
		MasteryPages masteryPages = gson.fromJson(response, MasteryPages.class);
		
		return masteryPages;
	}
	
	/**
	 * Get all Rune Pages of a given summoner.
	 * 
	 * @param summonerId Id of a summoner.
	 * @return RunePages object that contains a list of all Rune Pages
	 */
	public RunePages getRunePages(long summonerId) {
		ApiCaller caller = new ApiCaller();
		String response = caller.request(this.baseURL1 + "summoner/"+summonerId+"/runes?api_key="+apiKey);
		RunePages runePages = gson.fromJson(response, RunePages.class);
		
		return runePages;
	}
	
	/**
	 * Get information about a given summoner.
	 * 
	 * @param summonerId Id of a summoner.
	 * @return Summoner object, containing information.
	 */
	public Summoner getSummoner(long summonerId) {
		ApiCaller caller = new ApiCaller();
		Gson gson = new GsonBuilder().setDateFormat("MM/dd/yyy HH:mm").create();
		String response = caller.request(this.baseURL1 + "summoner/"+summonerId+"?api_key="+apiKey);
		Summoner summoner = gson.fromJson(response, Summoner.class);
		
		return summoner;
	}
	
	/**
	 * Get information about a given summoner.
	 * 
	 * @param summonerId Name of a summoner.
	 * @return Summoner object, containing information.
	 */
	public Summoner getSummoner(String summonerName) {
		ApiCaller caller = new ApiCaller();
		Gson gson = new GsonBuilder().setDateFormat("MM/dd/yyy HH:mm").create();
		String response = caller.request(this.baseURL1 + "summoner/by-name/"+summonerName+"?api_key="+apiKey);
		Summoner summoner = gson.fromJson(response, Summoner.class);
		
		return summoner;
	}
	
	/**
	 * Get information about more than one summoner at the same time.
	 * 
	 * @param summonerIds List of summonerIds.
	 * @return SummonerNameList containing the information about the given summoners.
	 */
	public SummonerNameList getSummoners(List<Long> summonerIds) {
		ApiCaller caller = new ApiCaller();
		String ids = "";
		for(long i : summonerIds) {
			ids = ids + i + ",";
		}
		String response = caller.request(this.baseURL1 + "summoner/"+ids+"/name?api_key="+apiKey);
		SummonerNameList summonerNameList = gson.fromJson(response, SummonerNameList.class);
		
		return summonerNameList;
	}
	
	/**
	 * Get all teams of a given summoner.
	 * 
	 * @param summonerId Id of a summoner.
	 * @return A list containing Team objects.
	 */
	public List<Team> getTeams(long summonerId) {
		ApiCaller caller = new ApiCaller();
		String response = caller.request(this.baseURL2 + "team/by-summoner/"+summonerId+"?api_key="+apiKey);
		List<Team> team = gson.fromJson(response, List.class);
		
		return team;
	}

}
