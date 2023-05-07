package hackerrank.UnSolved;

public class RepeatedString {
    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10));
    }
    public static long repeatedString(String s, long n) {
        int size = s.length();
        String word = s;
        for (int i = 0; i < (n-size)/size; i++) {
            word=word+s;
        }
        if((n-size)%size!=0){
            for (int i = 0; i <(n-size)%size ; i++) {
                word=word+s.charAt(i);
            }
        }
        long count = 0;
        for (int i = 0; i <word.length() ; i++) {
            if(word.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(word);
        return count;
    }
}
