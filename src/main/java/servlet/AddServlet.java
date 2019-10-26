package servlet;

import object.Fruit;
import object.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "AddServlet",urlPatterns = "/addShop")
public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        HttpSession session = request.getSession(false);
        String name = request.getParameter("name");
        if (session!=null) {
            User user = (User) session.getAttribute("user");
            if(user!=null){
                List<String> list = (List<String>) session.getAttribute("list");
                if (list==null) {
                    list = new ArrayList<String>();
                    session.setAttribute("list", list);
                    list.add(name);
                    request.getRequestDispatcher(request.getContextPath()+"/WEB-INF/view/shop.jsp?name="+name+"")
                            .forward(request,response);
                }else{
                    list.add(name);
                    request.getRequestDispatcher(request.getContextPath()+"/WEB-INF/view/shop.jsp?name="+name+"")
                            .forward(request,response);
                }
            }
            } else {
                response.getWriter().write("你还没有登录");
            }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
