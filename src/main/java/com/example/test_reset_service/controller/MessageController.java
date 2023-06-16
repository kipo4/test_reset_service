// MyController.java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private static final Logger logger = LoggerFactory.getLogger(MyController.class);

    private final MyModifyService modifyService;
    private final SecondService secondService;

    @Autowired
    public MyController(MyModifyService modifyService, SecondService secondService) {
        this.modifyService = modifyService;
        this.secondService = secondService;
    }

    @PostMapping("/process")
    public ResponseEntity<String> processRequest(@RequestBody String request) {
        logger.info("Received request: {}", request);

        modifyService.modify(request);
        String modifiedRequest = modifyService.getModifiedRequest();

        secondService.process(modifiedRequest);

        return ResponseEntity.ok("Request processed successfully.");
    }
}

// MyModifyService.java
public interface MyModifyService {
    void modify(String request);
    String getModifiedRequest();
}

// ModifyServiceImplementation.java
public class ModifyServiceImplementation implements MyModifyService {
    private String modifiedRequest;

    @Override
    public void modify(String request) {
        // Логика модификации запроса
        modifiedRequest = // Модифицированный запрос
    }

    @Override
    public String getModifiedRequest() {
        return modifiedRequest;
    }
}

// SecondService.java
public interface SecondService {
    void process(String request);
}

// SecondServiceImplementation.java
public class SecondServiceImplementation implements SecondService {
    @Override
    public void process(String request) {
        // Логика обработки запроса вторым сервисом
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