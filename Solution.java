import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String input = "aaabbbbccppppxx";
        printFilteredElements(input);
    }

    public static void printFilteredElements(String input) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Print filtered elements
        StringBuilder output = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            output.append(entry.getKey()).append(entry.getValue());
        }

        System.out.println(output);
    }
}