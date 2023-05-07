package hackerrank;

public class FindDigits {
    public static int findDigits(int n) {
        String nString = String.valueOf(n);
        int count = 0;
        int num = 0;
        for (int i = 0; i <nString.length() ; i++) {
            String a = String.valueOf(nString.charAt(i));
            num=Integer.parseInt(a);
            if(num!=0 && n%num==0){
                count++;
            }
        }
        return count;
    }
}
