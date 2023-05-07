package hackerrank;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class CavityMap {
    public static void main(String[] args) {
        List<String> grid = new ArrayList<>();
        grid.add("63456754");
        grid.add("68335522");
        grid.add("25482912");
        grid.add("54429472");
        grid.add("35416147");
        grid.add("75848666");
        grid.add("41633675");
        grid.add("82511989");
        System.out.println(cavityMap(grid));
    }
    public static List<String> cavityMap(List<String> grid) {
        List<String> cavityMap = new ArrayList<>();
        boolean flag = false;
        for (int i = 0; i < grid.size()-1; i++) {
            for (int j = 1; j < grid.size(); j++) {
                if(grid.get(i)==grid.get(j)){
                    flag= true;
                }else {
                    flag = false;
                    break;
                }
                if(flag==false){
                  break;
                }
            }
        }
        if(grid.size()==1){
            return grid;
        } else {
            String temp = "";
            String temp1 = "";
            cavityMap.add(grid.get(0));
             boolean flag2 = false;
            for (int i = 1; i < grid.size() - 1; i++) {
                temp1 = grid.get(i);
                for (int j = 1; j < grid.get(i).length() - 1; j++) {
                    int a = Character.getNumericValue(grid.get(i).charAt(j));
                    int a1 = Character.getNumericValue(grid.get(i - 1).charAt(j));
                    int a2 = Character.getNumericValue(grid.get(i).charAt(j - 1));
                    int a3 = Character.getNumericValue(grid.get(i).charAt(j + 1));
                    int a4 = Character.getNumericValue(grid.get(i + 1).charAt(j));
                    if (a > a1 && a > a2 && a > a3 && a > a4) {
                        temp = temp1.substring(0, j) + 'X'
                                + temp1.substring(j + 1);
                        temp1 = temp;
                        flag2 = true;
                    }
                }
                if(flag2==false){
                    cavityMap.add(grid.get(i));
                }else{
                    cavityMap.add(temp1);
                }
            }
            cavityMap.add(grid.get(grid.size() - 1));
            return cavityMap;
        }
    }
}
