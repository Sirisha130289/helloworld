package be.intecbrussel.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/shout")
public class ShoutingServlets extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>shout</title>\n" +
                "</head>\n" +
                "<body>" +
                "<form method='post' action=\"\">\n" +
                "  <label for=\"fname\">What is your name?</label><br>\n" +
                "  <input type=\"text\" name=\"shoutname\"  ><br>\n" +

                "  <input type=\"submit\" value=\"Submit\">\n" +
                "</form> " +
                "</body>\n" +
                "</html>"
        );
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter writer = resp.getWriter();
        writer.println("<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>shout</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>" + "You know what , I want to shout " +
                req.getParameter("shoutname")
                + "</h1>\n" +
                "</body>\n" +
                "</html>"
        );
        writer.close();
    }
}
