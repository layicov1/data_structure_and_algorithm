package hackerrank;

public class StrangeCounter {
    public static void main(String[] args) {
        System.out.println(strangeCounter(1000));
        System.out.println(strangeCounter(1));
    }
    public static long strangeCounter(long t) {
        long temp = 3;
        long num = 1;
        while(num<t){
            num = num+temp;
            temp*=2;
        }
        long between = num-t;
        long count= 0;
        if(num==t){
             count = temp-between;
        }else{
            count = num-t;
        }
        return count;
    }
}
