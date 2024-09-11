package map;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "diego");
        cookies.put("email", "diego@gmail.com");
        cookies.put("phone", "999222992");

        cookies.remove("email");
        cookies.put("phone", "9911199111");

        System.out.println("Contains 'phone ' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println(cookies.size());


        System.out.println("ALL COOKIES: ");
        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
