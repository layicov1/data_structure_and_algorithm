package hackerrank.Java;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String word2 = "";
        for(int  i = word.length()-1;i>=0;i--){
            word2 = word2+word.charAt(i);
        }
        if(word2.equals(word)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
