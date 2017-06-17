package ua.sergey.test.service;

import org.springframework.stereotype.Service;
import ua.sergey.test.model.StackoverflowWebsite;

import java.util.ArrayList;
import java.util.List;

@Service
public class StackoverflowService {
    private static List<StackoverflowWebsite> items = new ArrayList<>();
    static 

    public List<StackoverflowWebsite> findAll() {
        return items;
    }
}
