import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseMessage {
    private String uid;
    private String operationUid;
    private String systemTime;
    private String code;
    private String errorCode;
    private String errorMessage;

    // Геттеры и сеттеры для полей

    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

}