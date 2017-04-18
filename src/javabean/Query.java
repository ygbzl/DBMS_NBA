package javabean;

import java.sql.ResultSet;

/**
 * Created by zhupd on 4/18/2017.
 */
public class Query extends Connect{


    public String[] QPlayer_Score() throws Exception {
        this.startConnect();
        ResultSet rs = stmt.executeQuery("select PLAYER_NAME, P/2, TEAM_ABBREVIATION from (\n" +
                "select sum(MATCH_PLAYER_STATS.PTS) as p, player_id , player_name, TEAM_ABBREVIATION from MATCH_STATS, MATCH_PLAYER_STATS where \n" +
                "MATCH_PLAYER_STATS.GAME_ID = MATCH_STATS.GAME_ID_A and\n" +
                "GAME_DATE_EST = '2006-04-18T00:00:00'\n" +
                "group by  player_id, player_name, TEAM_ABBREVIATION\n" +
                "order by sum(MATCH_PLAYER_STATS.PTS) desc)\n" +
                "where p is not null and rownum <= 5");
        String[] res = new String[3];


        return res;

    }

}
