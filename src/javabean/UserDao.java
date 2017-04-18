package javabean;
import java.io.IOException;
import java.sql.ResultSet;

/**
 * Created by zhupd on 4/6/2017.
 */
public class UserDao extends Connect {
    public String username;
    public String password;
    public String email;

    public UserDao() {

    }


    public UserDao(String userName, String passWord, String emailAddress) {
        this.username = userName;
        this.password = passWord;
        this.email = emailAddress;
    }

    public void resigtrate(User user) throws Exception{
        this.username=user.username;
        this.password=user.password;
        this.email=user.email;

        this.startConnect();
        //System.out.println(("insert into p_user values (\'" + username + "\',\'" + password + "\',\'" + email + "\');"));
        stmt.executeUpdate("insert into p_user values (\'" + username + "\',\'" + password + "\',\'" + email + "\')");
        //stmt.executeUpdate("insert into p_user values ('wdo','1231223','asdf@fdsa')");
        this.endConnect();
    }


    public User testUser(String email, String password){
        try {
            User user=null;
            this.startConnect();
            ResultSet rs = stmt.executeQuery("select * from p_user where email=" + "\'" + email + "\'");
            //ResultSet rs = this.stmt.executeQuery("SELECT * FROM P_USER ");
            if (rs.next()) {
                if (rs.getString(2).equals(password)) {
                    user= new User(rs.getString(1), rs.getString(2), rs.getString(3));
                }
            }
            this.endConnect();
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }

/*
    public static void main(String[] args) throws Exception {

        UserDao ud = new UserDao();
        ud.resigtrate(new User("wo", "123123", "asdf@fddsa"));
    }*/
/*    public static void main(String[] args) throws Exception {
        UserDao d = new UserDao();
        User p = d.testUser("jaja@ufl.edu", "123456");
        if (p != null) {
            System.out.println(p.email);
        }
    }*/

}
