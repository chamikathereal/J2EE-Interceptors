package lk.jiat.web.interceptor.servlet;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.jiat.web.interceptor.ejb.UserSessionBean;

import java.io.IOException;

@WebServlet("/test")
public class Test extends HttpServlet {

    @EJB
    UserSessionBean userSessionBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            String action = userSessionBean.doAction("Amal", 22);
            System.out.println("UserSessionBean - doAction ic.proceed: " + action);
        } catch (Exception e) {

        }
        response.getWriter().write("Hello World");

    }
}
