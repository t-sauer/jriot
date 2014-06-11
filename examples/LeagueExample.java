
import java.util.List;

import jriot.main.JRiot;
import jriot.main.JRiotException;
import jriot.objects.League;
import jriot.objects.LeagueEntry;
import jriot.objects.Summoner;

public class LeagueExample {

    public static void main(String args[]) {

        // Initialize jriot
        JRiot lol = new JRiot();

        lol.setApiKey("YOUR_API_KEY");
        lol.setRegion("euw");

        try {
            // Get Summoner information
            Summoner summoner = lol.getSummoner("Coizu");
            // Get all leagues
            List<League> leagues = lol.getLeagues(summoner.getId());
            // Iterate through all leagues
            for (League league : leagues) {

                // Check if Soloqueue
                // (could also be done with the key of the map)
                if (league.getQueue().equals("RANKED_SOLO_5x5")) {

                    System.out.println("Soloqueue:");

                    // Print some stuff about the League
                    System.out.println("Name: " + league.getName());
                    System.out.println("Tier: " + league.getTier());

                    // Get all divisions of the league
                    List<LeagueEntry> leagueItems = league.getEntries();

                    // Go through all divisions
                    for (LeagueEntry leagueItem : leagueItems) {

                        // Check if the summoner we are looking for is in the division
                        if (Long.parseLong(leagueItem.getPlayerOrTeamId()) == summoner.getId()) {

                            // Print some stuff about the division
                            System.out.println("Division: " + leagueItem.getDivision());
                            System.out.println("Wins: " + leagueItem.getWins());
                        }

                    }

                }

            }
        } catch (JRiotException e) {
            System.out.println(e.getErrorMessage());
        }

    }

}
