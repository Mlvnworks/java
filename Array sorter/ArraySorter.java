import java.util.Arrays;

class Arr{
    int[] arr;
    int[] sort(){
        return  arr;
    }
}

public class ArraySorter {
    public static void main(String[] args){
        Arr handle = new Arr();
        int[] toTest = {6, 5, 4, 3, 2,1};
        handle.arr = toTest;

        //Output
        System.out.print(Arrays.toString(handle.sort()));

        int[] x = {5,8,6,2,1};
        int[] y = Arrays.stream(x).max().stream().toArray();
        System.out.print(Arrays.toString(y));
    }
}