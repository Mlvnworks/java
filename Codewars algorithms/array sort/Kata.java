import java.util.Arrays;


class Algo{
     static int[] flip(char dir, int[] arr){
         Arrays.sort(arr);
         if(dir == 'R'){
            return arr;
         }else{
             int count = - 1;
             int[] reversedArr = arr.clone();
            for(int i = arr.length - 1; i >= 0; i--){
                count++;
                reversedArr[i] = arr[count];
            }
            return reversedArr;
         }
     }
}
public class Kata{
    
    public static void main(String[] args){
        int[] toTest = new int[]{1,3,4,5,6,7};
        int[] result = Algo.flip('L',toTest);
        System.out.println(Arrays.toString(result));
    }
}