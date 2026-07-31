class Solution {
    public String sortVowels(String s) {
        int[] upper = new int[26];
        int[] lower = new int[26];
        char[] arr = s.toCharArray();
        int j=0;
        for (char ch : arr){
            if (isVowel(ch)){
                if (ch <= 'Z'){
                    upper[ch-'A']++;
                }
                else{
                    lower[ch-'a']++;
                }
                arr[j] = '0';
            }
            j++;
        }
        j=0;
        for (int i=0; i<26; i++){
            while (upper[i] > 0){
                while (arr[j] != '0')
                    j++;
                arr[j] = (char) (i+'A');
                upper[i]--;
            }
        }
        for (int i=0; i<26; i++){
            while (lower[i] > 0){
                while (arr[j] != '0')
                    j++;
                arr[j] = (char) (i+'a');
                lower[i]--;
            }
        }
        return new String(arr);
    }
    private boolean isVowel(char ch){
        if (ch <= 'Z'){
            ch = (char)(ch + 32); 
        }
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}