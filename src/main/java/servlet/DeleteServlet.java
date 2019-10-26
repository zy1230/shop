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
import java.util.List;

@WebServlet(name = "DeleteServlet",urlPatterns = "/delete")
public class DeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name =  request.getParameter("name");
        response.setContentType("text/html;charset=utf-8");
        HttpSession session = request.getSession(false);
        if (session!= null) {
                List<String> list = (List<String>) session.getAttribute("list");
                if (list != null) {
                    list.remove(name);
                    request.getRequestDispatcher(request.getContextPath() + "/WEB-INF/view/shop.jsp").forward(request,response);
                }
                else{
                    response.getWriter().write("没有商品!!!!!!");
                }
        }else {
            response.getWriter().write("登入失败!!!");
        }

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         this.doPost(request,response);
    }
}
