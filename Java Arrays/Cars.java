import java.util.Arrays;

public class Cars {
    public static void main (String[] args){
        //Array chars
        char[] middleInitials = {'A', 'B', 'C', 'D'};

        //Array String -- we use "Arrays.deepToString(arrays)" to print String arrays
        String[] names = {"Ford", "Hilux", "toyota", "Honda"};

        //Array Number -- we use "Arrays.toString(arrays)" to print String arrays
        int[] ages = {18, 22, 18, 17};

        //Outputing an array
        System.out.println(middleInitials);
        System.out.println(Arrays.toString(names));
        System.out.print(Arrays.toString(ages));

        // Array Looping
        //using forEach loop
        for (char middleInitial : middleInitials) {
            System.out.println(middleInitial);
        }

        //using forLoop
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i].toUpperCase());
        }

        //using whileLoop
        int ind = 0;
        while(ind < ages.length){
            System.out.println(ages[ind]);
            ind++;
        }
    }
}
