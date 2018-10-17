package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;

@RestController
public class QuoteController {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${service.location}")
    private String serviceLocation;

    @RequestMapping("/quote")
    @GetMapping
    public Quote doQuote() {
      Quote quote = restTemplate.getForObject(serviceLocation, Quote.class);
      quote.getValue().setQuote( quote.getValue().getQuote() + " - attaching some value.");
        return quote;
    }
}
