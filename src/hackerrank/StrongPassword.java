package hackerrank;

public class StrongPassword {
    public static int minimumNumber(int n, String password) {
        int num = 0;
        int lower = 0;
        int upper = 0;
        int special = 0;
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if(password.charAt(i)>='0' && password.charAt(i)<='9'){
                num++;
            } else if (password.charAt(i)>='a' && password.charAt(i)<='z') {
                lower++;
            } else if (password.charAt(i)>='A' && password.charAt(i)<='Z') {
                upper++;
            }else{
                special++;
            }
        }
        if(num==0)count++;
        if(lower==0)count++;
        if(upper==0)count++;
        if(special==0)count++;
        if(count+n>=6){
            return count;
        }else{
            count=(6-n);
            return count;
        }
    }
}
