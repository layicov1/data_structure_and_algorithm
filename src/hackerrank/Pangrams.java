package hackerrank;

public class Pangrams {
    public static String pangrams(String s) {
        s = s.toUpperCase();
        int count = 0;
        for (int i = 65; i <91 ; i++) {
            for (int j = 0; j <s.length() ; j++) {
                int temp = s.charAt(j);
                if(i==temp){
                    count++;
                    break;
                }
            }
        }
        if(count==26){
            return "pangram";
        }else{
            return "not pangram";
        }
    }
}
