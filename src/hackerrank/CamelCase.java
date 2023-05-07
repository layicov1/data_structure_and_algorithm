package hackerrank;

public class CamelCase {
    public static int camelcase(String s) {
        int count = 1;
        String temp = s.toUpperCase();
        for (int i = 0; i <s.length() ; i++) {

            if(s.charAt(i) == temp.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
