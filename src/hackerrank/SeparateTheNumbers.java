package hackerrank;

public class SeparateTheNumbers {



    public static void separateNumbers(String s) {
        int size = s.length() / 2;
        String result = "";
        boolean flag = false;
        for (int i = 1; i <= size; i++) {
            result = s.substring(0, i);
            long number = Long.parseLong(result);
            String generated = result;
            while (generated.length() < s.length()) {
                generated += Long.toString(number++);
            }
            if (s.equals(generated)) {
                flag = true;
                break;
            }
        }
        if (flag) System.out.println("YES " + result);
        else System.out.println("NO");
    }
}
