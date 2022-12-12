package 정리.제이쓴_Json;

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

public class Json2 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        // 위 아래 모두 같은 방법
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        String userJson = null;
        String studentJson = null;
        String productJson = null;

        //object -> Json
        User user = new User("ehdud", "1234", "ehdud05264@naver.com", "윤도영");
        System.out.println(gsonBuilder.toJson(user));
        userJson = gson.toJson(user);

        System.out.println();

        //JsonObject -> Json
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("studentCode", "20220001");
        jsonObject.addProperty("studentName", "윤도영");
        jsonObject.addProperty("studentYear", "4");
        System.out.println(gsonBuilder.toJson(jsonObject));

        studentJson = gsonBuilder.toJson(jsonObject);

        System.out.println();

        //Map -> Json
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("productCode", "T-20220001");
        map.put("productName", "삼성 노트북");
        System.out.println(gsonBuilder.toJson(map));
        productJson = gson.toJson(map);

        System.out.println();

        //Json -> Map
        Map<String, Object> jsonData = convertJsonToMap(productJson);
        System.out.println(jsonData.get("productCode")); // map 형식으로 변환

        //Json -> Object
        JsonObject jsonObj = convertJsonToJsonObject(studentJson);
        System.out.println(jsonObj);

        // Json -> user
        User userObj = convertJsonToUser(userJson);
        System.out.println(userObj);


    }

    public static Map convertJsonToMap(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, Map.class);
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
