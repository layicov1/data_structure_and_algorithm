package hackerrank;

public class CatsandAMouse {
    static String catAndMouse(int x, int y, int z) {
        if(Math.abs(x-z)>Math.abs(y-z)){
            return "Cat B";
        }else if(Math.abs(x-z)<Math.abs(y-z)){
            return "Cat A";
        }else{
            return "Mouse C";
        }

    }
}
