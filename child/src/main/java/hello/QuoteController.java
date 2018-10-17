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
    @RequestMapping("/quote")
    @GetMapping
    public Quote doQuote() {
      Quote quote = new Quote();
      hello.Value value = new hello.Value();

      value.setId(11L);
      value.setQuote("I have two hours today to build an app from scratch. @springboot to the rescue!");

      quote.setType("success");
      quote.setValue(value);

      return quote;
    }
}
