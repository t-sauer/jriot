import java.util.List;
import java.util.Map;

import jriot.main.JRiot;
import jriot.objects.League;
import jriot.objects.LeagueItem;
import jriot.objects.Summoner;


public class LeagueExample {
	
	public static void main(String args[]) {
		
		
		// Initialize jriot
		JRiot lol = new JRiot();
		
		lol.setApiKey("YOUR_API_KEY");
		lol.setRegion("euw");
		
		
		// Get Summoner information
		Summoner summoner = lol.getSummoner("Coizu");
		
		// Get all leagues
		Map<String, League> leagues = lol.getLeagues(summoner.getId());
		
		
		// Iterate through all leagues
		for(Map.Entry<String, League> entry : leagues.entrySet()) {
			
			// Get the League out of the Map
			League league = entry.getValue();
			
			
			// Check if Soloqueue 
			// (could also be done with the key of the map)
			if(league.getQueue().equals("RANKED_SOLO_5x5")) {
				
				System.out.println("Soloqueue:");
				
				// Print some stuff about the League
				System.out.println("Name: " + league.getName());
				System.out.println("Tier: " + league.getTier());
					
				// Get all divisions of the league
				List<LeagueItem> leagueItems = league.getEntries();
				
				// Go through all divisions
				for(LeagueItem leagueItem : leagueItems) {
					
					// Check if the summoner we are looking for is in the division
					if(Long.parseLong(leagueItem.getPlayerOrTeamId()) == summoner.getId()) {
						
						// Print some stuff about the division
						System.out.println("Division: " + leagueItem.getRank());
						System.out.println("Wins: " + leagueItem.getWins());
					}
					
				}
				
			}
			
			
		}
		
	}
	

}
