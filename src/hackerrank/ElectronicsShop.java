package hackerrank;

public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int count = -1;
        for (int i = 0; i <keyboards.length ; i++) {
            for (int j = 0; j < drives.length ; j++) {
                if(count<keyboards[i]+drives[j] && keyboards[i]+drives[j]<=b){
                    count = keyboards[i]+drives[j];
                }
            }
        }
        return count;
    }
}
