package controller;

import service.NewsOrNoticeService;
import service.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/news")
public class NewServlet extends HttpServlet {
    private NewsOrNoticeService newsService= ServiceFactory.getNewsOrNoticeService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

         req.setAttribute("newff", newsService.getNew(req.getParameter("nid")));
         req.getRequestDispatcher("/WEB-INF/jsp/new.jsp")
                 .forward(req, resp);
    }
}
