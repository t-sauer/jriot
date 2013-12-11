package jriot.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import jriot.objects.*;


public class JRiot {
	
	private String apiKey;
	
	private String response;
	
	private String ApiURL;
	
	private String baseURL1 = "http://prod.api.pvp.net/api/lol/na/v1.1/";
	private String baseURL2 = "http://prod.api.pvp.net/api/na/v2.1/";
	
	
	Gson gson = new Gson();
	
	private  void doRequest() {
		
		try {
			String requestURL = ApiURL;
			
			URL url = new URL(requestURL);
			
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			
			connection.setDoOutput(true);
			connection.setRequestMethod("GET");
			connection.setInstanceFollowRedirects(false); 
			

			InputStream is = connection.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			String line;
			StringBuffer response = new StringBuffer(); 
			
			while((line = rd.readLine()) != null) {
				response.append(line);
				response.append('\r');
			}
			
			this.response = response.toString();
			
			
			connection.disconnect();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void setApiKey(String key) {
		this.apiKey = key;
	}
	
	public void setRegion(String region) {
		
		this.baseURL1 = "http://prod.api.pvp.net/api/lol/" + region + "/v1.1/";
		baseURL2 = "http://prod.api.pvp.net/api/" + region + "/v2.1/";
		
	}
	
	public ChampionList getChampions() {
		this.ApiURL = this.baseURL1 + "v1.1/champion"+"?api_key="+apiKey;
		doRequest();
		
		ChampionList championList = gson.fromJson(response, ChampionList.class);
		
		return championList;
	}
	
	public ChampionList getFreeChampions() {
		this.ApiURL = this.baseURL1 + "champion"+"?freeToPlay=true&api_key="+apiKey;
		doRequest();
		
		ChampionList championList = gson.fromJson(response, ChampionList.class);
		
		return championList;
	}
	
	public RecentGames getRecentGames(int summonerId) {
		
		this.ApiURL = this.baseURL1 + "game/by-summoner/"+summonerId+"/recent"+"?api_key="+apiKey;
		doRequest();
		
		RecentGames recentGames = gson.fromJson(response, RecentGames.class);
		
		return recentGames;
		
	}
	
	public Map<String, League> getLeagues(int summonerId) {		
		
		this.ApiURL = this.baseURL2 + "league/by-summoner/"+summonerId+"?api_key="+apiKey;
		doRequest();
		Map<String, League> leagues =  gson.fromJson(response, new TypeToken<Map<String, League>>(){}.getType());
		
		return leagues;
		
	}
	
	public PlayerStatsSummaryList getPlayerStatsSummaryList(int summonerId, int season) {
		this.ApiURL = this.baseURL1 + "stats/by-summoner/"+summonerId+"/summary"+"?season=SEASON"+season+"&api_key="+apiKey;
		doRequest();
		
		PlayerStatsSummaryList playerStatsSummaryList = gson.fromJson(response, PlayerStatsSummaryList.class);
		
		return playerStatsSummaryList;
	}
	
	public RankedStats getRankedStats(int summonerId, int season) {
		this.ApiURL = this.baseURL1 + "stats/by-summoner/"+summonerId+"/ranked"+"?season=SEASON"+season+"&api_key="+apiKey;
		doRequest();
		
		RankedStats rankedStats = gson.fromJson(response, RankedStats.class);
		
		return rankedStats;
	}
	
	public MasteryPages getMasteryPages(int summonerId) {
		this.ApiURL = this.baseURL1 + "summoner/"+summonerId+"/masteries?api_key="+apiKey;
		doRequest();
		
		MasteryPages masteryPages = gson.fromJson(response, MasteryPages.class);
		
		return masteryPages;
	}
	
	public RunePages getRunePages(int summonerId) {
		this.ApiURL = this.baseURL1 + "summoner/"+summonerId+"/runes?api_key="+apiKey;
		doRequest();
		
		RunePages runePages = gson.fromJson(response, RunePages.class);
		
		return runePages;
	}
	
	public Summoner getSummoner(int summonerId) {
		
		Gson gson = new GsonBuilder().setDateFormat("MM/dd/yyy HH:mm").create();
		this.ApiURL = this.baseURL1 + "summoner/"+summonerId+"?api_key="+apiKey;
		doRequest();
		
		Summoner summoner = gson.fromJson(response, Summoner.class);
		
		return summoner;
	}
	
	public Summoner getSummoner(String summonerName) {
		
		Gson gson = new GsonBuilder().setDateFormat("MM/dd/yyy HH:mm").create();
		this.ApiURL = this.baseURL1 + "summoner/by-name/"+summonerName+"?api_key="+apiKey;
		doRequest();
		
		Summoner summoner = gson.fromJson(response, Summoner.class);
		
		return summoner;
	}
	
	public SummonerNameList getSummoners(List<Integer> summonerIds) {
		
		String ids = "";
		for(int i : summonerIds) {
			ids = ids + i + ",";
		}
		this.ApiURL = this.baseURL1 + "summoner/"+ids+"/name?api_key="+apiKey;
		doRequest();
		
		SummonerNameList summonerNameList = gson.fromJson(response, SummonerNameList.class);
		
		return summonerNameList;
	}
	
	public List<Team> getTeams(int summonerId) {

		this.ApiURL = this.baseURL2 + "team/by-summoner/"+summonerId+"?api_key="+apiKey;
		doRequest();
		
		List<Team> team = gson.fromJson(response, List.class);
		
		return team;
	}
	

}
