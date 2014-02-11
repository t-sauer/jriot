
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import jriot.main.*;
import jriot.objects.*;

public class jriotExample {

    public static void main(String args[]) {

        JRiot lol = new JRiot();

        // Set your API Key
        lol.setApiKey("YOUR_API_KEY_HERE");
        // Set the region
        lol.setRegion("euw");
        try {
            // Get all champions
            ChampionList champions = lol.getChampions();
            // Get all free champions
            ChampionList freeChampions = lol.getFreeChampions();

            // Get a summoner
            Summoner summoner = lol.getSummoner("Coizu");
            summoner = lol.getSummoner(summoner.getId());

            // Get a list of summoners at once
            List<Long> summonerIds = new ArrayList<Long>();
            summonerIds.add(summoner.getId());

            SummonerNameList summoners = lol.getSummoners(summonerIds);

            // Get leagues of a summoner
            Map<String, League> leagues = lol.getLeagues(summoner.getId());

            // Get mastery pages of a summoner
            MasteryPages masteryPages = lol.getMasteryPages(summoner.getId());

            // Get rune pages of a summoner
            RunePages runePages = lol.getRunePages(summoner.getId());

            // Get summoner stats
            PlayerStatsSummaryList playerStats = lol.getPlayerStatsSummaryList(summoner.getId(), 3);

            // Get ranked stats of a summoner
            RankedStats rankedStats = lol.getRankedStats(summoner.getId(), 3);

            // Get recent games of a summoner
            RecentGames recentGames = lol.getRecentGames(summoner.getId());

            // Get a list of teams of a summoner
            List<Team> teams = lol.getTeams(summoner.getId());
        } catch (JRiotException e) {
            System.out.println(e.getErrorMessage());
        }

    }

}
