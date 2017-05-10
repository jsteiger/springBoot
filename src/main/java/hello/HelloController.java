package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    private static Logger log = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/")
    public String index() {
        log.info("Made It Here");
        return "Greetings from Spring Boot!";
    }

}