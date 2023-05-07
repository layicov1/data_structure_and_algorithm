package hackerrank.UnSolved;

public class AppendAndDelete {
    public static void main(String[] args) {
        System.out.println(appendAndDelete("qwerasdf", "qwerbsdf", 6));
    }

    public static String appendAndDelete(String s, String t, int k) {
        int sLength = s.length();
        int tLength = t.length();
        int length = 0;
        if (sLength > tLength) {
            length = tLength;
        } else if (tLength > sLength) {
            length = sLength;
        } else {
            length = sLength;
        }
        int max = 0;
        String sWord = "";
        String tWord = "";
        for (int i = 0; i < length; i++) {
            sWord = s.substring(0, i);
            tWord = t.substring(0, i);
            if (sWord.equals(tWord)) {
                System.out.println(sWord);
                System.out.println(tWord);
                System.out.println("&****************");
                if (sWord.length() >= max) {
                    max = sWord.length();
                }
            }
        }
        if (s.length() + t.length() - max > k) {
            return "No";
        } else if (s == t) {
            return "Yes";
        } else {
            return "Yes";
        }
    }
}
