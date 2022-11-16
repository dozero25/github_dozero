package J20_JSON;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;


@AllArgsConstructor
@Data

class User{
    private String username;
    private String password;
    private String email;
    private String name;
}

public class JSON2 {

    public static void main(String[] args) {
        // Gson으로 변환 할 수 있는 객체의 종류
        // JsonObject, Object, Map => toJson을 해서 객체로 변환할 수 있다.

        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        // 대신 GsonBuilder는 속성값을 설정할 수 있다.
        Gson gson = new Gson(); // 위 아래 모두 같은 방법이다.

        String userJson = null;
        String studetJson = null;
        String productJson = null;

        //Object(객체) -> JSON
        User user = new User("junil", "1234", "skjil1218@gmail.com", "김준일");
        System.out.println(gsonBuilder.toJson(user)); // Gson은 텍스트이다.
        userJson = gson.toJson(user);

        System.out.println();

        //JsonObject -> JSON
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("studentCode", "20220001");
        jsonObject.addProperty("studentName", "김준이");
        jsonObject.addProperty("studentYear", "2");
        System.out.println(gsonBuilder.toJson(jsonObject));
        studetJson = gsonBuilder.toJson(jsonObject);

        System.out.println();

        //Map -> JSON
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("productCode", "P-20220001");
        map.put("productName", "삼성 노트북");
        System.out.println(gsonBuilder.toJson(map));
        productJson = gsonBuilder.toJson(map);

        // json -> Map
        Map<String, Object> jsonData = convertJsonToMap(userJson);
        System.out.println(jsonData.get("name")); // map 형식으로 변환했기 때문에 사용 가능

        jsonData = convertJsonToMap(studetJson);
        System.out.println(jsonData);

        jsonData = convertJsonToMap(productJson);
        System.out.println(jsonData);

        System.out.println();

        // Json -> Object
        JsonObject jsonObj = convertJsonToJsonObject(userJson);
        System.out.println(jsonData);

        jsonObj = convertJsonToJsonObject(studetJson);
        System.out.println(jsonObj);

        jsonObj = convertJsonToJsonObject(productJson);
        System.out.println(jsonObj);

        System.out.println();

        // Json -> user
        User userObj = convertJsonToUser(userJson);
        System.out.println(userObj);
    }
    public static Map convertJsonToMap(String json){ // JSON의 형식을 보고 Map형식으로 변환한다.
        Gson gson = new Gson();
        return gson.fromJson(json, Map.class); // 앞에는 json 뒤에는 변환하고 싶은 class

    }
    public static JsonObject convertJsonToJsonObject(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, JsonObject.class);
    }
    public static User convertJsonToUser(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, User.class);
    }
}
