import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @PostMapping("/messages")
    public ResponseMessage processMessage(@RequestBody RequestMessage request) {
        // Обработка входящего сообщения
        // Создание и заполнение объекта ответного сообщения
        ResponseMessage response = new ResponseMessage();
        response.setUid(request.getUid());
        response.setOperationUid(request.getOperationUid());
        response.setSystemTime(request.getSystemTime());

        // Установка кода, ошибки и сообщения в ответное сообщение в соответствии с логикой вашего сервиса
        response.setCode("failed");
        response.setErrorCode("ValidationException");
        response.setErrorMessage("Ошибка валидации");

        return response;
    }
}