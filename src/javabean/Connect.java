package javabean;
import java.sql.*;

/**
 * Created by zhupd on 4/5/2017.
 */
public class Connect {

    final String className = "oracle.jdbc.driver.OracleDriver";
    final String url = "jdbc:oracle:thin:@oracle.cise.ufl.edu:1521:orcl";
    final String user = "xma";
    final String password = "344178852Uf";

    Connection con;
    Statement stmt;
    public void startConnect() throws Exception {
        Class.forName(className);
        con = DriverManager.getConnection(url, user, password);
        stmt=con.createStatement();
    }

    public void endConnect() throws Exception{
        con.close();
    }





   /* public String[] getLogInfo(){
        String[] res = new String[2];
        try{
//step1 load the driver class
            Class.forName(className);

//step2 create  the connection object
            Connection con=DriverManager.getConnection(
                    url,user,password);

//step3 create the statement object
            Statement stmt=con.createStatement();

//step4 execute query
            ResultSet rs=stmt.executeQuery("select * from match_player_stats");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));

//step5 close the connection object
            con.close();

        }catch(Exception e){ System.out.println(e);}

        return
    }*/
}
