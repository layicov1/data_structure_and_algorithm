package hackerrank;

import java.util.List;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(List.of(0, 0, 1, 0, 0, 0, 0, 1, 0, 0
        )));
    }

    public static int jumpingOnClouds(List<Integer> c) {
        int count = 0;
        int index = 0;
        while (c.size() - 1 > index) {
            if (c.get(index + 2) != 1 && index+2<c.size()) {
                index += 2;
                count++;
            } else {
                index++;
                count++;
            }
        }
        return count;
    }
    public static int jumpingOnClouds2(List<Integer> c) {
        int count =0;
        for (int i=0;i<c.size()-1;i++) {
            count++;
            if((i+2)<c.size() && c.get(i+2) == 0) i++;
        }
        return count;
    }
}
