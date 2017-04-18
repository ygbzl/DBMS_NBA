package javabean;
/**
 * Created by zhupd on 4/6/2017.
 */
public class User {
    public String username;
    public String password;
    public String email;

    public User() {

    }
    public User(String userName, String passWord, String emailAddress){
        this.username = userName;
        this.password = passWord;
        this.email = emailAddress;
    }

    public String getUserName() {
        return this.username;
    }
}
