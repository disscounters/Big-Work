package controller;


import service.NewsOrNoticeService;
import service.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addnotice")
public class AddNoticeServlet extends HttpServlet {
    private NewsOrNoticeService noticeService= ServiceFactory.getNewsOrNoticeService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/jsp/addnotice.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String noticeTitle=req.getParameter("noticetitle");
       String noticeContext=req.getParameter("noticecontext");
       noticeService.addNotice(noticeTitle,noticeContext );
       req.getRequestDispatcher("/WEB-INF/jsp/addnotice.jsp")
            .forward(req,resp);
    }
}
