package J18_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class RespoonseData<T> {
    private String message;
    private T data;

}
