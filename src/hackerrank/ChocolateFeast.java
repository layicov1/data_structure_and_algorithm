package hackerrank;

public class ChocolateFeast {
    public static int chocolateFeast(int n, int c, int m) {
        int count = 0;
        int buy = 0;
        count = n/c;
        buy = n/c;
        while(buy>=m){
            int rest=buy%m;
            buy=buy/m;
            count+=buy;
            buy +=rest;
        }
        return count;
    }

}
