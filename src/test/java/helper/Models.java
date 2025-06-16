package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static helper.Utility.generateRandomEmail;

public class Models {
    //sebuah model untuk menghit restassured

    private static RequestSpecification request;

    public static void  setupHeader(){
        request = RestAssured.given()
                .header("Content-Type","application/json")
                .header("Accept","application/json")
                .header("Authorization", "Bearer 96f78e4e92590df8b7cd7dada69f8cff0e8ec62d67022dec77fe9d6f337cfdd7");

    }

    public static  Response getListUsers(String endpoint) {
        //System.out.println("endend : " + endpoint);
        setupHeader();
        return request.when().get(endpoint);
    }

    public static Response postCreateUser(String endpoint) {
        String name = "Yahi Yaho Kolo";
        String gender = "male";
        String email = generateRandomEmail();
        String status = "active";
        JSONObject payload = new JSONObject();
        payload.put("name",name);
        payload.put("gender",gender);
        payload.put("email",email);
        payload.put("status",status);

        setupHeader();
        return request.body(payload.toString()).when().post(endpoint);
    }

    public static Response deleteUser(String endpoint, String user_id) {
        setupHeader();
        String finalEndpoint = endpoint + "/" + user_id;
        return request.when().delete(finalEndpoint);
    }

    public static Response updateUser(String endpoint, String user_id) {
        setupHeader();

        String name = "Yahi Edit";
        String gender = "male";
        String email = generateRandomEmail();
        String status = "active";
        JSONObject payload = new JSONObject();
        payload.put("name",name);
        payload.put("gender",gender);
        payload.put("email",email);
        payload.put("status",status);


        String finalEndpoint = endpoint + "/" + user_id;
        return request.body(payload.toString()).when().patch(finalEndpoint);
    }

}
