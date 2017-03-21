package Dan_Data;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by elm on 3/21/17.
 */
@RestController
public class DanController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
