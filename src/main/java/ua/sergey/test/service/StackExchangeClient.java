package ua.sergey.test.service;

import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ua.sergey.test.model.SiteDTO;
import ua.sergey.test.model.SitesDTO;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Component
public class StackExchangeClient

    private RestTemplate restTemplate = new RestTemplate();

    public List<SiteDTO> getSites() {
        String url = "https://api.stackexchange.com/2.2/sites?page=1&pagesize=9999&filter=!8IeYYZbP7kF8WkCg(i*zE";

        try {
            SitesDTO response = restTemplate.getForObject(new URI(url), SitesDTO.class );
            return response.getItems();

        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }
}
