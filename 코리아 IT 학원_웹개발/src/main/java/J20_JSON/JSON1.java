package J20_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON1 {
    public static void main(String[] args) {
        // Map이랑 값이 다르다.
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("username", "ehdud");
        jsonObject.addProperty("password", "1234");
        jsonObject.addProperty("email", "ehdud05264@naver.com");
        jsonObject.addProperty("name", "윤도영");
        jsonObject.addProperty("age", 25);

        System.out.println(jsonObject);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(jsonObject);
        System.out.println(json);

    }
}
