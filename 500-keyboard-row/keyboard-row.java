import java.util.*;

class Solution {
    public String[] findWords(String[] words) {

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> result = new ArrayList<>();

        for(String word : words) {
            String lower = word.toLowerCase();

            if(allInRow(lower, row1) || 
               allInRow(lower, row2) || 
               allInRow(lower, row3)) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    public boolean allInRow(String word, String row) {
        for(char c : word.toCharArray()) {
            if(!row.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }
}