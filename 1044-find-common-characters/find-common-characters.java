import java.util.*;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();

        String first = words[0];

        for (char c : first.toCharArray()) {
            boolean found = true;

            for (int i = 1; i < words.length; i++) {
                int index = words[i].indexOf(c);

                if (index == -1) {
                    found = false;
                    break;
                } else {
                
                    words[i] = words[i].substring(0, index) + words[i].substring(index + 1);
                }
            }

            if (found) {
                result.add(String.valueOf(c));
            }
        }

        return result;
    }
}