package hackerrank;

public class NumberLineJumps {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if((x1>x2 && v1>v2)|| (x2>x1 && v2>v1) || (v1==v2) ){
            return "NO";
        }else {
            if(Math.abs(x1-x2)%Math.abs(v1-v2)==0){
                return "YES";
            }
            else {
                return "NO";
            }
        }
    }
}
