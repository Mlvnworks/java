import java.lang.reflect.Array;
import java.util.Arrays;

class AreSame {
    int[] removeItem(int[] arr, int toRemove){
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == toRemove) {
                int[] newNumbers = new int[arr.length - 1];
                System.arraycopy(arr, 0, newNumbers, 0, i);
                System.arraycopy(arr, i + 1, newNumbers, i, arr.length - i - 1);
                arr = newNumbers;
                break;
            }
        }

        return arr;
    }
    boolean inArray(int[] arr, int toFind){
        boolean inArr = false;

        for(int num : arr){
            if(toFind == num){
                inArr = true;
            }
        }

        return inArr;
    }

    boolean comp(int[] a, int[] b) {
        if(a == null || b == null){
            return false;
        }else if(a.length < 1 || b.length < 1){
            return false;
        }

        for(int num : a) {
            int squared = num * num;
            if(!inArray(b,squared)){
                return false;
            }else{
                b = removeItem(b ,squared);
            }
        }

        return true;
    }
}

public class Kata {
    public static void main(String[] args){
        int[] a = {};
        int[] b = {1};

        AreSame same = new AreSame();

        boolean result = same.comp(a, b);
        System.out.println(result);
    }
}
