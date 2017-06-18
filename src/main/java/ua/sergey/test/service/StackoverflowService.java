package ua.sergey.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.sergey.test.model.StackoverflowWebsite;
import ua.sergey.test.persistence.StackoverflowWebsiteRepositopy;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class StackoverflowService {
    @Autowired
    private StackoverflowWebsiteRepositopy repositopy;

    private static List<StackoverflowWebsite> items = new ArrayList<>();
//    static {
//        items.add(new StackoverflowWebsite("stackoverflow", "http://stackoverflow.com",
//                "http://www.iconsdb.com/icons/download/orange/stackoverflow-6-64.ico",
//                "Stack Overflow", "for programmers"));
//        items.add(new StackoverflowWebsite("superuser", "http://superuser.com",
//                "http://www.iconsdb.com/icons/download/color/CFFF30/linkedin-3-64.ico",
//                "Super User", "for power user"));
//        items.add(new StackoverflowWebsite("ru.starckoverflow", "http://ru.stackoverflow.com",
//                "http://cdn.sstatic.net/Sites/ru/img/favicon.ico",
//                "Stack Overflow не русском", "для програмистов"));
//
//    }
//
//   @PostConstruct
//    public void init() {
//        repositopy.save(items);
//    }
    public List<StackoverflowWebsite> findAll() {
        return repositopy.findAll();
    }
}
