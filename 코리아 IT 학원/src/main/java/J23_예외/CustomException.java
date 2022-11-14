package J23_예외;

import lombok.Getter;

import java.util.Map;

public class CustomException extends RuntimeException{
    // RuntimeException이랑 동일하다.

    @Getter
    private Map<String, String> errorMap;

    public CustomException(String message, Map<String, String> errorMap) {
        super(message);
        this.errorMap = errorMap;
    }
}
