package javabean;
import javabean.UserDao;
import java.sql.ResultSet;
/**
 * Created by zhupd on 4/6/2017.
 */
public class AdminDao extends UserDao {
    public int id;
    public String password;
    public String name;

    public AdminDao(int id, String password, String name) {
        this.id=id;
        this.password=password;
        this.name=name;
    }

    public Admin testUser(int id, String password) throws Exception {
        this.startConnect();
        Admin admin=null;
        ResultSet rs = stmt.executeQuery("select * from administrator where id=" + "\'" + id + "\'");
        //ResultSet rs = this.stmt.executeQuery("SELECT * FROM P_USER ");
        if (rs.next()) {
            if (rs.getString(2).equals(password)) {
                admin= new Admin(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
        }
        this.endConnect();
        return admin;
    }
}
