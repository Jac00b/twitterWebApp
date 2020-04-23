package pl.sda.servlets;

import pl.sda.DiscussionService;
import pl.sda.model.Discussion;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/addConfirm")
public class AddTweetConfirmServlet extends HttpServlet {

    DiscussionService discussionService = new DiscussionService();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String login = (String) session.getAttribute("user");
        String title = req.getParameter("title");
        String text = req.getParameter("text");

        discussionService.createTwiit(login, title, text);

        req.getRequestDispatcher("WEB-INF/addConfirm.jsp").forward(req, resp);
    }

}
