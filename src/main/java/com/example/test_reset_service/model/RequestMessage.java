import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestMessage {
    private String uid;
    private String operationUid;
    private String systemName;
    private String systemTime;
    private String source;
    private int communicationId;
    private int templateId;
    private int productCode;
    private int smsCode;

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