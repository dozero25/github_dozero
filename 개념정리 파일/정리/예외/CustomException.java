package 정리.예외;

import lombok.Getter;

import java.util.Map;

public class CustomException extends RuntimeException{
    // RuntimeException이랑 동일

    @Getter
    private Map<String, String> errorMap;

    public CustomException(String message, Map<String, String> errorMap){
        super(message);
        this.errorMap = errorMap;
    }
}
