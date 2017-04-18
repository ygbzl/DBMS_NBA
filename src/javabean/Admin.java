package javabean;
/**
 * Created by zhupd on 4/6/2017.
 */
public class Admin extends User {
    public int id;
    public String password;
    public String name;

    public Admin(int id, String password, String name) {
        this.id=id;
        this.password=password;
        this.name=name;
    }
}
