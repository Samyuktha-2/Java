import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] arr = {"3", "30", "34", "5", "9"};

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder result = new StringBuilder();

        for (String s : arr) {
            result.append(s);
        }

        System.out.println(result.toString());
    }
}
