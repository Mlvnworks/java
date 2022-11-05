
public class WhileLoop {
    public static void main(String[] args){
        String myName = "abcdefghijklmnopqrstuvwxyz";
        String[] splited = myName.split("");
        int splitCount = splited.length;
        int ind = 0;


        while(splitCount > ind){
            int count = splitCount -1;
            String currChar = splited[count];
            String[] filter = myName.split(currChar);
            System.out.println(filter[0]);
            splitCount--;
        }
    }
}