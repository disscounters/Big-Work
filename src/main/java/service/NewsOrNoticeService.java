package service;

        import entity.News;
        import entity.Notice;

        import java.util.List;

public interface NewsOrNoticeService {
    public void addNews(String newTitle, String newContext);
    public void addNotice(String noticeTitle, String noticeContext);
    public News getNew(String newTitle);
    public Notice getNotice(String noticeTitle);
    public void deleteNew(String newTitle);
    public void deleteNotice(String noticeTitle);
    public List<News> getNews();
    public List<Notice> getNotices();
}
