package controller;

import service.NewsOrNoticeService;
import service.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/first")
public class FirstPageServlet extends HttpServlet {
    private NewsOrNoticeService newService= ServiceFactory.getNewsOrNoticeService();
    private NewsOrNoticeService noticeService= ServiceFactory.getNewsOrNoticeService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("new", newService.getNews());
        req.setAttribute("notice", noticeService.getNotices());
        req.getRequestDispatcher("/WEB-INF/jsp/firstpage.jsp")
                .forward(req, resp);
    }
}
