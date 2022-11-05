public class JavaRecursion {
    static int sum(int x, int end){
        if(x < end){
            return x + sum(x ,end -1 );
        }else{
            return x;
        }
    }

    public static void main(String[] args) {
        int result = sum(20,2000 );
        System.out.println(result);
    }
}
