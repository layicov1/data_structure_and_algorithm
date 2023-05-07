package hackerrank;

public class HackerRankInAString {
    public static String hackerrankInString(String s) {
        String word = "hackerrank";
        int i = 0;
        for (int j = 0; j <s.length() ; j++) {
            if(word.charAt(i)==s.charAt(j)){
                i++;
            }if(i==word.length()){
                return "YES";
            }
        }
        return "NO";
    }
}
