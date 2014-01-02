import jriot.main.JRiot;
import jriot.objects.AggregatedStats;
import jriot.objects.ChampionStats;
import jriot.objects.RankedStats;
import jriot.objects.Summoner;

public class SoloQueueStatsExample {
	
	
	public static void main(String args[]) {
		
		
		// Initialize jriot
		JRiot lol = new JRiot();
		
		lol.setApiKey("YOUR_API_KEY");
		lol.setRegion("euw");
		
		
		// Get Summonerinformation
		Summoner summoner = lol.getSummoner("Coizu");
		
		// Get RankedStats
		RankedStats rankedStats = lol.getRankedStats(summoner.getId(), 3);
		
		
		// Go through RankedStats for every champion
		for(ChampionStats championStats : rankedStats.getChampions()) {
			
			// Print championname
			System.out.println(championStats.getName());
			
			// Get AggregatedStats for a champion
			AggregatedStats aggregatedStats = championStats.getStats();
			
			// Print some AggregatedStats
			System.out.println("Champions Killed: " + aggregatedStats.getTotalChampionKills());
			System.out.println("Games Played: " + aggregatedStats.getTotalSessionsPlayed());
			
			System.out.println("-------------------------");
		}
		
	}
}
