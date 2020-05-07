package be.intecbrussel.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet("/Random")
public class RandomNumberServlets extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter writer = resp.getWriter();
        writer.println("<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>random number page</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>" + "random number = " +
                getRandomNumber() + "</h1>\n" +
                "</body>\n" +
                "</html>"
        );
        writer.close();
    }

    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
