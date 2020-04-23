package pl.sda.servlets;


import pl.sda.UserService;
import pl.sda.exceptions.IncorrectLoginOrPasswordException;
import pl.sda.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    UserService userService = new UserService();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login = req.getParameter("login");
        String password = req.getParameter("password");

        boolean IfExists = userService.IfUserExist(login, password);

        if (IfExists){
            HttpSession session = req.getSession();
            session.setAttribute("user", login);
            resp.sendRedirect(req.getContextPath()+"/discussion");
        } else {
            RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/login-error.jsp");
            dispatcher.forward(req, resp);
        }



    }



}
