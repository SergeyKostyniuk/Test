package ua.sergey.test.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ua.sergey.test.model.StackoverflowWebsite;

import java.util.List;

@Repository
public interface StackoverflowWebsiteRepositopy extends MongoRepository <StackoverflowWebsite, String> {
//    @Autowired
//    private MongoTemplate mongoTemplate;
//
//    public List<StackoverflowWebsite> findALL() {
//        return mongoTemplate.findAll(StackoverflowWebsite.class);
//    }
}
