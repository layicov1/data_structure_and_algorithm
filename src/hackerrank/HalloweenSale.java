package hackerrank;

public class HalloweenSale {
    public static int howManyGames(int p, int d, int m, int s) {
        int count=-1;
        int price=0;
        while (price<=s){
            if(p<=m){
                price+=m;
                count++;
            }else {
                price = p + price;
                p = p - d;
                count++;
            }
        }
        return count;

    }
}
