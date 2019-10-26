package servlet;

import db.Way;
import object.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password  = request.getParameter("password");
        if(name.equals("") || password.equals("")){
            response.sendRedirect(request.getContextPath()+"zc.jsp?name="+name+"");
        }
        else{
            User user= Way.select(name,password);
            if(user!=null){
                HttpSession session = request.getSession(false);
                session.setAttribute("user",user);
                request.getRequestDispatcher(request.getContextPath()+"/WEB-INF/view/zs.jsp?name="+user.getName()+"").forward(request,response);
            }else{
                HttpSession session = request.getSession(false);
                session.setAttribute("user",user);
                response.sendRedirect(request.getContextPath()+"zc.jsp?name="+name+"");
            }
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }


}
