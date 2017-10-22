package cn.xjtu.servlet;

import cn.xjtu.entity.Contact;
import cn.xjtu.service.ContactService;
import cn.xjtu.service.impl.ContactServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "QueryContactServlet",urlPatterns = {"/QueryContactServlet"})
public class QueryContactServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.接收id
        String id = request.getParameter("id");

        //2.调用service根据id查询联系人的方法
        ContactService service = new ContactServiceImpl();
        Contact contact = service.findById(id);

        //3.把查询的结果保存到request域中
        request.setAttribute("contact", contact);
        //4.跳转到修改联系人的页面
        request.getRequestDispatcher("/updateContact.jsp").forward(request,response);
    }
}
