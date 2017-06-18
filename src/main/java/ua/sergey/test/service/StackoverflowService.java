package ua.sergey.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.sergey.test.model.StackoverflowWebsite;
import ua.sergey.test.persistence.StackoverflowWebsiteRepositopy;

import java.util.ArrayList;
import java.util.List;

@Service
public class StackoverflowService {
    @Autowired
    private StackoverflowWebsiteRepositopy repositopy;

    private static List<StackoverflowWebsite> items = new ArrayList<>();

    public List<StackoverflowWebsite> findAll() {
        return repositopy.findAll();
    }
}
