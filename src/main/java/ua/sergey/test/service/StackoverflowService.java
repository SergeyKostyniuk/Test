package ua.sergey.test.service;

import org.springframework.stereotype.Service;
import ua.sergey.test.model.StackoverflowWebsite;

import java.util.ArrayList;
import java.util.List;

@Service
public class StackoverflowService {
    private static List<StackoverflowWebsite> items = new ArrayList<>();
    static {
        items.add(new StackoverflowWebsite("stackoverflow", "http://stackoverflow.com", "http://www.iconsdb.com/icons/download/orange/stackoverflow-6-64.ico", "Stack Overflow", "for programmers"));
        items.add(new StackoverflowWebsite("superuser", "http://superuser.com", "http://www.iconsdb.com/icons/download/color/CFFF30/linkedin-3-64.ico", "Super User", "for power user"));
    }

    public List<StackoverflowWebsite> findAll() {
        return items;
    }
}
