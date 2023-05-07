package hackerrank.Java;

import java.util.List;
import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int i = q; i >0 ; i--) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int count = a;
            int c = 0;
            for (int j = 0; j < n; j++) {
                c = (int)Math.pow(2,j);
                count+=c*b;
                System.out.print(count);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
