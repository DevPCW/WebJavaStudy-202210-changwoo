package j20_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Data
class User {
    private String username;
    private String password;
    private String email;
    private String name;
}

public class JSON2 {

    public static void main(String[] args) {

        // 'Gson' 으로 변환 할 수 있는 객체의 종류
        // JsonObject, Object, Map

        String userJson = null;
        String studentJson = null;
        String productJson = null;

        // 둘이 동일한데 'GsonBuilder' 는 속성들을 추가 할 수 있음.
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        System.out.println("--------------------------------------------------------------");
        // Object(객체) -> JSON
        System.out.println("1. Object(객체) -> JSON");

        User user = new User("devpcw", "1234", "abcd@gmail.com", "박창우");
//        System.out.println(gson.toJson(user));
        System.out.println(gsonBuilder.toJson(user));
        userJson = gsonBuilder.toJson(user);




        // 리턴이 String 'String' 으로 해당 객체의 정보를 변경 시켜줌.
        System.out.println(gson.toJson(user));
        System.out.println(gsonBuilder.toJson(user));

        System.out.println("--------------------------------------------------------------");
        // JsonObject -> JSON
        System.out.println("2. JsonObject -> JSON");

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("studentCode", "20220001");
        jsonObject.addProperty("studentName", "김준이");
        jsonObject.addProperty("studentYear", "2");
        System.out.println(gsonBuilder.toJson(jsonObject));
        studentJson = gsonBuilder.toJson(jsonObject);



        System.out.println("--------------------------------------------------------------");
        // Map -> JSON
        System.out.println("3. Map -> JSON");

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("productCode", "P-20220001");
        map.put("productName", "삼성 노트북");
        System.out.println(gsonBuilder.toJson(map));
        productJson = gsonBuilder.toJson(map);


        Map<String, Object> jsonData = convertJsonToMap(userJson);
        System.out.println(jsonData);
        System.out.println(jsonData.get("name")); // Map 이니깐 .get() 같은 메소드 사용 가능.

        jsonData = convertJsonToMap(studentJson);
        System.out.println(jsonData);

        jsonData = convertJsonToMap(productJson);
        System.out.println(jsonData);


        System.out.println("--------------------------------------------------------------");
        // Json -> JsonObject
        System.out.println("Json -> JsonObject");
        JsonObject jsonObj = convertJsonToObject(userJson);
        System.out.println(jsonObj);


        jsonObj = convertJsonToObject(studentJson);
        System.out.println(jsonObj);

        jsonObj = convertJsonToObject(productJson);
        System.out.println(jsonObj);


        // JSON -> User
        User userObj = convertJsonToUser(userJson);
        System.out.println(userObj);
    }

    public static Map convertJsonToMap(String json) {

        Gson gson = new Gson();
        return gson.fromJson(json, Map.class); // JSON 을 Map 형태로 바꿔줌.
    }

    public static JsonObject convertJsonToObject(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, JsonObject.class); // JSON 을 JsonObject 형태로 바꿔줌. 리턴될 때 JsonObject
    }

    public static User convertJsonToUser(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, User.class); // 리턴될 때 User
    }
}
