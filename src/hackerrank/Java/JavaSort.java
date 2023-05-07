package hackerrank.Java;

import java.util.Scanner;

public class JavaSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int id = sc.nextInt();
            String name = sc.nextLine();
            Double cgpa = sc.nextDouble();
            System.out.println(name);
        }
    }
}
