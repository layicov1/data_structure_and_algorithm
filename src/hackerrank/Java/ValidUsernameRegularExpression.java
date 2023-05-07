package hackerrank.Java;

import java.util.Scanner;

public class ValidUsernameRegularExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            int temp = 0;
            String word = sc.nextLine();
            char aa= word.charAt(0);
            if((aa>=48 && aa<=57) | aa==95){
                System.out.println("Invalid");
            } else if (word.length() >= 8 && word.length() <= 30) {
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(j) >= 'A' && word.charAt(j) <= 'Z') {
                        temp++;
                    } else if (word.charAt(j) >= 'a' && word.charAt(j) <= 'z') {
                        temp++;
                    } else if (word.charAt(j) == '_') {
                        temp++;
                    } else if (word.charAt(j)>='0' && word.charAt(j)<='9') {
                        temp++;
                    }
                }
                if (word.length() == temp && word.length() >= 8 && word.length() <= 30) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Invalid");
                }
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
