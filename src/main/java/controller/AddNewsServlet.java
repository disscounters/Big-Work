package controller;


import service.NewsOrNoticeService;
import service.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addnews")
public class AddNewsServlet extends HttpServlet {
    private NewsOrNoticeService newsService= ServiceFactory.getNewsOrNoticeService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/jsp/addnews.jsp")
                    .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String newTitle=req.getParameter("newtitle");
       String newContext=req.getParameter("newcontext");
       newsService.addNews(newTitle, newContext);
       req.getRequestDispatcher("/WEB-INF/jsp/addnews.jsp")
            .forward(req, resp);

    }
}
