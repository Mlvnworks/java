import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args){

            //String multi-d. array
            String[][] users = {
                    {"Melvin", "Jhon"},
                    {"Jake", "Jefferson"},
                    {"Jerome", "Jhon Micheal"},
            };

            // user grouped
            String[] team1 = users[0];
            String[] team2 = users[1];
            String[] team3 = users[2];

            //int multi-d array
            int[][] lottery = {
                    {15,67,87,56,78,18},
                    {78,53,67,87,90,32},
                    {72,98,67,87,3,6,72}
            };

            int[] lotteryResult1 = lottery[0];
            int[] lotteryResult2 = lottery[1];
            int[] lotteryResult3 = lottery[2];
    }
}
