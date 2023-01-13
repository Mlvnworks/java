import java.util.Arrays;
import java.util.Scanner;

public class anagramChecker {
     static boolean isAnagram(String str1, String str2){
         String[] words = {str1, str2};
         for(int ind = 0; ind < words.length; ind++){
             String[] x = words[ind].split("");
             Arrays.sort(x);
             words[ind] = String.join("", x).toLowerCase();
         }

         return words[0].equals(words[1]);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Input
        String word1, word2 = null;

        //Ask For First Word
        System.out.println("Enter First Word...");
        word1 = sc.nextLine();

        //Ask For First Word
        System.out.println("Enter Second Word...");
        word2 = sc.nextLine();

        //Output
        System.out.print("\nis "+word1+ " and "+word2+" a anagram word? "+isAnagram(word1,word2));
    }
}
