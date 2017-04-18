package javabean;

/**
 * Created by zhupd on 4/18/2017.
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Query q = new Query();
        String[] s = q.QPlayer_Score();
        System.out.println(s[0] +"\n"+ s[1] +"\n"+ s[2]);
    }

}
