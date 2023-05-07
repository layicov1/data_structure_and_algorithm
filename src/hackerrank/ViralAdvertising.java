package hackerrank;

public class ViralAdvertising {
    public static int viralAdvertising(int n) {
        int sum = 0;
        int floor = 0;
        int people = 5;
        for (int i = n; i > 0 ; i--) {
            floor = people/2;
            sum+=floor;
            people=floor*3;
        }
        return sum;
    }

    public static class MarsExploration {
        public static void main(String[] args) {
            System.out.println(marsExploration("SOSSPSSQSSOR"));
        }
        public static int marsExploration(String s) {
            int count =0 ;
            for (int i = 0; i <s.length() ; i+=3) {
                String temp = s.substring(i,i+3);
                if(temp.charAt(0)!='S'){
                    count++;
                }
                if(temp.charAt(1)!='O'){
                    count++;
                }
                if(temp.charAt(2)!='S'){
                    count++;
                }
            }
            return count;
        }

    }
}
