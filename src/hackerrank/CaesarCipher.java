package hackerrank;

public class CaesarCipher {
    public static String caesarCipher(String s, int k) {
        String encrypted = "";
        k = k%26;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            int index = temp;
            int sum = index + k;
            char temp1;
            if (index < 65 || index > 122 || (index > 90 && index <= 96)) {
                encrypted += (char) index;
                System.out.println("a");
            } else if (index <= 90) {
                if(sum>90){
                    temp1 = (char)(sum-26);
                }else{
                    temp1 = (char)(sum);
                }
                encrypted+=temp1;
            } else if (index<=122) {
                if(sum>122){
                    temp1 = (char)(sum-26);
                }else{
                    temp1 = (char)(sum);
                }
                encrypted+=temp1;
            }
        }
        return encrypted;
    }
}
