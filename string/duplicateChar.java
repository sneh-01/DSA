import java.util.HashMap;
import java.util.Map;

public class duplicateChar {
    public static void main(String[] args) {
        String input = "programmingmmggbbbbbbbbbb";

        System.out.println("Original string: " + input);
        System.out.println("Duplicate characters: " + findDuplicateCharacters(input));
    }

    private static String findDuplicateCharacters(String str) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        StringBuilder duplicates = new StringBuilder();

        for (char ch : str.toCharArray()) {
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }
        // addition

        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.append(entry.getKey());
            }
        }
        // cheking

        return duplicates.toString();
    }
}
