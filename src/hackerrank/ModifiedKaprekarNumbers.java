package hackerrank;

public class ModifiedKaprekarNumbers {
    public static void kaprekarNumbers(int p, int q) {
        boolean flag = false;
        for (int i = p; i <= q; i++) {
            long num = (long)i * i;
            int length = (int) Math.log10(i) + 1;
            int a = (int) (num / (Math.pow(10, length)));
            int b = (int) (num % (Math.pow(10, length)));
            if (a + b == i) {
                flag = true;
                System.out.print(i + " ");
            }
        }
        if (flag == false) {
            System.out.println("INVALID RANGE");
        }
    }
}
