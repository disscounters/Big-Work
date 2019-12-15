package service;

import service.impl.NewsOrNoticeImpl;

public class ServiceFactory {
    private static final NewsOrNoticeService newsOrNoticeService = create();

    private static NewsOrNoticeService  create() {
        return new NewsOrNoticeImpl();
    }
    public static NewsOrNoticeService  getNewsOrNoticeService() {
        return newsOrNoticeService;
    }
}
