// SecondController.java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
    private static final Logger logger = LoggerFactory.getLogger(SecondController.class);

    @PostMapping("/process")
    public void processRequest(@RequestBody String request) {
        logger.info("Received request in the second service: {}", request);

        // Логика обработки запроса во втором сервисе
    }
}

// Application.java
import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}