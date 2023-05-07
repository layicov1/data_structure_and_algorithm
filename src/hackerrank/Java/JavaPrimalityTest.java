package hackerrank.Java;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        BigInteger a = new BigInteger(n);
        boolean flag = a.isProbablePrime(1);
        if(flag){
            System.out.println("Prime");
        }else {
            System.out.println("not prime");
        }
    }
}
