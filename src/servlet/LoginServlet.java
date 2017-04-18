package servlet;

import javabean.User;
import javabean.UserDao;

import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by challengezwb on 4/6/17.
 */
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String passWord = request.getParameter("PassWord");
        String emailAddress = request.getParameter("EmailAddress");
        HttpSession session = request.getSession();
        UserDao ud = new UserDao();
        User user = new User();
        try {
            user = ud.testUser(emailAddress, passWord);

        } catch (Exception e) {
        }

        if(user != null){
            session.setAttribute("msg", "UserName" + user.getUserName() + "Welcome");
            request.getRequestDispatcher("/Login.jsp").forward(request, response);  // 返回主界面
        }else{
            session.setAttribute("msg", "Incorrect EmailAddress or Password");
            request.getRequestDispatcher("/index.jsp").forward(request, response);  // 返回错误界面
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
