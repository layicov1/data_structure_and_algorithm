package hackerrank.UnSolved;

import java.util.ArrayList;
import java.util.List;

public class ACM_ICPC_Team {
    public static void main(String[] args) {
        List<String> a = List.of("10101" ,"11100", "11010", "00101");
        System.out.println(acmTeam(a));
    }
    public static List<Integer> acmTeam(List<String> topic) {
        int arrayCount = topic.size();
        int arraySize = topic.get(0).length();
        List<Integer> temp = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arrayCount; i++) {
            for (int j = i+1; j <arrayCount ; j++) {
                for (int k = 0; k < arraySize; k++) {
                    int i1 = Character.getNumericValue(topic.get(i).charAt(k));
                    int j1 = Character.getNumericValue(topic.get(j).charAt(k));
                    temp.add(Math.max(i1,j1));
                    System.out.println(Math.max(i1,j1));
                }
            }
        }
        int max = 0;
        int count = 0;
        int temp1 = arraySize;
        for (int i = 0; i < temp.size(); i++) {
            if(temp1>0){
                temp1--;
                if(temp.get(i)==1){
                    count++;
                }
            }else{
                    result.add(count);
                    temp1=arraySize;
                    count=0;
            }
        }
        for (int i = 0; i <result.size() ; i++) {
            if(result.get(i)>max){
                max=result.get(i);
            }
        }
        int a= 0;
        for (int i = 0; i < result.size(); i++) {
            if(result.get(i)==max){
                a++;
            }
        }
        List<Integer> result1 = new ArrayList<>();
        result1.add(max);
        result1.add(a);
        System.out.println(max);
        return result1;
    }
}
