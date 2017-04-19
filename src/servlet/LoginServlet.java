package servlet;

import javabean.User;
import javabean.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by challengezwb on 4/6/17.
 */
public class LoginServlet extends javax.servlet.http.HttpServlet {
    private static final long serialVersionUID = 1L;

    public LoginServlet() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String emailAddress = request.getParameter("EmailAddress");
        String passWord = request.getParameter("PassWord");
        HttpSession session = request.getSession();
        UserDao ud = new UserDao();
        User user = ud.testUser(emailAddress, passWord);
        session.setAttribute("user", user);
        if(user != null){
            session.setAttribute("msg", "UserName" + user.getUserName() + "Welcome");
            //request.getRequestDispatcher("/NBA.jsp").forward(request, response);  // 返回主界面
            request.getRequestDispatcher("/index.jsp").forward(request, response);  // 返回主界面

        }else{
            session.setAttribute("msg", "Incorrect EmailAddress or Password");
            request.getRequestDispatcher("/Login.jsp").forward(request, response);  // 返回错误界面
        }
    }
}
