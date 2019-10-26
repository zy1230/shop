package servlet;

import db.Way;
import object.Fruit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "DetailServlet",urlPatterns = "/detail")
public class DetailServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        Fruit fruit = Way.selectF(name);
        response.setContentType("text/html;charset=utf-8");
        if(fruit!=null){
            request.setAttribute("fruit",fruit);
            request.getRequestDispatcher(request.getContextPath()+"/WEB-INF/view/detail.jsp").forward(request,response);
        }else{
            response.getWriter().write("服务器可能又出问题了");

        }
    }
}
