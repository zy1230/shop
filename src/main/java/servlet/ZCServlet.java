package servlet;

import db.Way;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "ZCServlet",urlPatterns = "/zc")
public class ZCServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password  = request.getParameter("password");
        if(name.equals("") || password.equals("")){
           request.getRequestDispatcher(request.getContextPath()+"/zc.jsp?wrong=1").forward(request,response);
        }
        else{
            int  a = Way.insert(name,password);
            response.setContentType("text/html;charset=utf-8");
            if(a>0){
                response.sendRedirect("../login.jsp?name="+name+"");
            }else{
                response.getWriter().write("服务器可能出问题了，待会再来吧");
            }
        }

    }
}
