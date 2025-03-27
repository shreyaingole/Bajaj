import org.json.JSONObject;
import java.util.HashSet;

class HashGenerator {
    public static void main(String[] args) {
        String first_name = "Sam";
        String roll_number = "240350000046";
        String hash = first_name + roll_number;
        System.out.println(hash);
    }
}
