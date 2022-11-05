import java.util.Arrays;

class Arr {
    int[] arr;

    int[] sort(){
        for(int i = 1; i < arr.length; i++){
            int x = i;
            int y = arr[i];

            while(x > 0 && arr[x - 1] > y){
                arr[x] = arr[x - 1];
                x --;
            }

            arr[x] = y;
        }
        return arr;
    }

    int[] reverse(){
        int count = 0;
        int[] handler = arr.clone();

        for(int i = arr.length - 1; i >= 0; i--){
            handler[count] = arr[i];
            count++;
        }

        return handler;
    }


}


public class Algo {
    public static void main(String args[]){
        int[] arr = {67,78,89,62,9,-7};
        Arr handle = new Arr();
        handle.arr = arr;

        int[] intSorted = handle.sort();
        handle.arr = intSorted;
        handle.reverse();

        System.out.println(Arrays.toString(handle.reverse()));
        System.out.println(Arrays.toString(intSorted));
    }
}
