import java.util.Scanner;

class Kata {
    int[] push(int[] intArr, int toPush){
        int[] pushedArr = new int[intArr.length + 1];
        for(int i = 0; i < intArr.length; i++){
            pushedArr[i] = intArr[i];
        }
        pushedArr[pushedArr.length - 1] = toPush;
        return pushedArr;
    }

    boolean inArray(int[] intArr, int toFind){
        boolean state = false;
        for(int i = 0; i < intArr.length; i++){
            if(intArr[i] == toFind) state = true;
        }
        return state;
    }

    int[] arrayDiff(int[] a, int[] b) {
        int[] handle = {};
        if(b.length <= 0){
            return a;
        }


        for(int i = 0; i < a.length; i++){
            if(!inArray(b,a[i])){
                handle = push(handle, a[i]);
            }
        }

        return handle;
    }

}
public class Solution {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
    }
}
