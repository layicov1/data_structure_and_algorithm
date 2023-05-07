package hackerrank;

public class BeautifulDaysAtTheMovies {
    public static int beautifulDays(int i, int j, int k) {
        String temp = "";
        int num = 0;
        int count = 0;
        for (int l = 0; l <= j - i; l++) {
            num = i+l;
            String s = String.valueOf(i + l);
            for (int m = s.length()-1; m>=0; m--) {
                temp = temp + s.charAt(m);
            }
            int reverseNumInt = Integer.parseInt(temp);
            if((reverseNumInt-num)%k==0){
                count++;
            }
            temp = "";
        }
        return count;
    }
}
