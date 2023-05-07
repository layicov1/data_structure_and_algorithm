package hackerrank.UnSolved;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class HappyLadybugs {
    public static void main(String[] args) {
        System.out.println(happyLadybugs("_gr_"));
    }

    public static String happyLadybugs(String b) {
        boolean flag = true;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < b.length(); i++) {
            if (!map.containsKey(b.charAt(i))) {
                map.put(b.charAt(i), 1);
            } else {
                map.put(b.charAt(i), map.get(b.charAt(i)) + 1);
            }
        }
        System.out.println(map);
        if (!map.containsKey('_')) {
            for (int i = 1; i < b.length() - 1; i++) {
                if (b.charAt(i) != b.charAt(i - 1) || b.charAt(i) != b.charAt(i + 1)) {
                    System.out.println(b.charAt(i));
                    System.out.println(b.charAt(i-1));
                    System.out.println(b.charAt(i+1));
                    return "NO";
                }
            }
            return "YES";
        } else {
            map.remove('_');
            if (map.containsValue(1)) return "NO";
            else return "YES";
        }
    }
}
