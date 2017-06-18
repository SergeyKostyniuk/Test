package ua.sergey.test.service;

import com.google.common.collect.ImmutableList;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.sergey.test.model.SiteDTO;
import ua.sergey.test.model.StackoverflowWebsite;
import ua.sergey.test.persistence.StackoverflowWebsiteRepositopy;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

@Service
public class StackoverflowService {
    @Autowired
    private StackoverflowWebsiteRepositopy repositopy;

    @Autowired
    private StackExchangeClient stackExchangeClient;

    public List<StackoverflowWebsite> findAll() {
        return stackExchangeClient.getSites().stream()
                .map(this::tostackoverflowWebsite)
                .filter(this::ignoreMeta)
                .collect(collectingAndThen(toList(), ImmutableList::copyOf));


    }

    private boolean ignoreMeta(@NonNull StackoverflowWebsite stackoverflowWebsite) {
               return !stackoverflowWebsite.getId().startsWith("meta.");
           }


    private  StackoverflowWebsite tostackoverflowWebsite(@NonNull SiteDTO input) {
        return new StackoverflowWebsite(
                input.getSite_url().substring(" http://".length(), input.getSite_url().length()- ".com".length() ),
                input.getSite_url(),
                input.getFavicon_url(),
                input.getName(),
                input.getAudience());
    }
 //   private static List<StackoverflowWebsite> items = new ArrayList<>();

//    public List<StackoverflowWebsite> findAll() {
//        return repositopy.findAll();
//    }
}
