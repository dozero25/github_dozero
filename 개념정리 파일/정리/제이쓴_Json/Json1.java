package 정리.제이쓴_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

/*
        JSON 특징
        : 서버와 클라이언트 간의 교류에서 일반적으로 많이 사용
        : 자바스크립트 객체표기법과 아주 유사
        : 자바 스크립트를 이용하여 JSON 형식의 문서를 쉽게 자바스크립트 객체로 변환 가능
        : 특정 언어에 종속되지 않으며, 대부분의 프로그래밍 언어에서 JSON 포맷의 데이터를 핸들링 할 수 있는 라이브러리를 제공한다.

        : 태그로 표현하기보다는 중괄호 같은 형식으로 하고, 값을 ,로 나열하기에 표현이 간단하다.
        : 형식은 자바스크립트 객체와 마찬가지로 key / value가 존재할 수 있으며 key값이나 문자열은 항상 쌍따옴표를 이용하여 표기한다.
        : 객체, 배열 등의 표기를 사용할 수 있따.
        : null, number, string, array, object, boolean을 사용할 수 있다.
        문법
        {
            "employees" : [
            {
                "name" : "Do Young",
                "LastName" : "Yoon"
                },
             {
                "name" : "Do one",
                "LastName" : "Yoon"
             }
            ]
        }
     */
public class Json1 {
    public static void main(String[] args) {
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
