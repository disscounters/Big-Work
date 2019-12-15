package service.impl;

import entity.News;
import entity.Notice;
import service.NewsOrNoticeService;
import service.util.DataSourceUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class NewsOrNoticeImpl implements NewsOrNoticeService {
    private static Logger logger=Logger.getLogger(NewsOrNoticeImpl.class.getName());

    public void addNews(String newTitle,String newContext) {

        String sql = "INSERT INTO new(title,context) VALUES(?,?)";
        try (Connection conn = DataSourceUtil.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, newTitle);
            st.setString(2, newContext);
            st.executeUpdate();
        } catch (SQLException e) {
            logger.warning(e.getMessage());
        }
    }

    public void addNotice(String noticeTitle,String noticeContext){
        String sql = "INSERT INTO notice(title,context) VALUES(?,?)";
        try (Connection conn = DataSourceUtil.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, noticeTitle);
            st.setString(2, noticeContext);
            st.executeUpdate();
        } catch (SQLException e) {
            logger.warning(e.getMessage());
        }
    }

    public  News getNew(String title){
        News newff=null;
    String sql = "SELECT * FROM new WHERE title=?";
    try(Connection conn = DataSourceUtil.getConnection();
        PreparedStatement st = conn.prepareStatement(sql)) {
        st.setString(1, title);
        try(ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                newff= new News(rs.getInt("id"),rs.getString("title"), rs.getString("context"), rs.getTimestamp("insert_time"));
            }
        }
    } catch (SQLException e) {
        logger.warning(e.getMessage());
    }
    return newff;
}

   public Notice getNotice(String title){
        Notice _notice=null;
       String sql = "SELECT * FROM notice WHERE title=?";
       try(Connection conn = DataSourceUtil.getConnection();
           PreparedStatement st = conn.prepareStatement(sql)) {
           st.setString(1, title);
           try(ResultSet rs = st.executeQuery()) {
               while (rs.next()) {
                   _notice = new Notice(rs.getInt("id"),rs.getString("title"), rs.getString("context"), rs.getTimestamp("create_time"));
               }
           }
       } catch (SQLException e) {
           logger.warning(e.getMessage());
       }
       return _notice;
   }

   public List<News> getNews(){
        List<News> news = new ArrayList<>();
        String sql = "SELECT * FROM new";
        try(Connection conn = DataSourceUtil.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                News newnew = new News(rs.getInt("id"),rs.getString("title"),rs.getString("context"), rs.getTimestamp("insert_time"));
                news.add(newnew);
            }
        } catch (SQLException e) {
            logger.warning(e.getMessage());
        }
        return news;
    }

    public List<Notice> getNotices(){
        List<Notice> notices = new ArrayList<>();
        String sql = "SELECT * FROM notice";
        try(Connection conn = DataSourceUtil.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                Notice notice = new Notice(rs.getInt("id"),rs.getString("title"),rs.getString("context"), rs.getTimestamp("create_time"));
                notices.add(notice);
            }
        } catch (SQLException e) {
            logger.warning(e.getMessage());
        }
        return notices;
    }


    public void deleteNew(String newTitle) {
      /* String sql="DELETE FROM new WHERE title=?";
        try(Connection conn = DataSourceUtil.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
           ) {
           st.setString(1, newTitle);
           st.executeQuery();
        } catch (SQLException e) {
            logger.warning(e.getMessage());
        }*/
    }


    public void deleteNotice(String noticeTitle) {

    }
}
