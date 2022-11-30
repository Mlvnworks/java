import java.util.Scanner;


public class InputCalculator {

    //Check if the input operation is correct
    static boolean inputOperationChecker(String input){
        String[] validOperation = {"+", "-", "*", "/"};
        boolean validity = false;
        for (String oper : validOperation){
            if(oper.equals(input)){
                validity = true;
            }
        }
        return validity;
    }

    //Calculate user input depending on the operation
    static int calculateInput(String oper, int x1, int x2){
        switch (oper){
            case "+":
                return x1 + x2;
            case "-":
                return x1 - x2;
            case "*":
                return x1 * x2;
            case "/":
                return x1 / x2;
        }
        return 0;
    }


    // Main Method
    public static void main(String[] args) {
        //Declare scanner variable
        Scanner math =  new Scanner(System.in);

        //this will show if the user have invalid input
        String errMsg = "\n‼Invalid input... Please read the instruction carefully‼";

        //Ask for First Number
        System.out.println("----------------\nequation: ? ? ? = ?\n\n🚩Enter number....");

        try{
            //First number input
            int numOne = math.nextInt();

            //Ask what operation to be use
            System.out.println("\n\n\n----------------\nequation: "+numOne+" ? ? = ?\n\n🚩Enter Operation(+, -, *, /)....");

            // Select an operation
            String operInput = math.next();

            //if operation input is valid
            if(inputOperationChecker(operInput)){
                System.out.println("\n\n\n----------------\nequation: "+numOne+" "+operInput+" ? = ?\n\n");
                try{
                    int numTwo = math.nextInt();

                    //Output
                    int output = calculateInput(operInput, numOne, numTwo);

                    //Show Output
                    System.out.println("\n\n\n----------------\nequation: "+numOne+" "+operInput+" "+ numTwo +" = "+ output +"\n\n----------------\nANSWER: "+ output);
                }catch(Throwable err){
                    System.out.println(errMsg);
                }

            //if operation input is invalid
            }else{
                System.out.println(errMsg);
            }

        // if the user have a in-valid input
        }catch (Throwable err){
            System.out.println(errMsg);
        }

        //Outro Message
        System.out.print("\n\n📃--Please Restart the Program to try again--😀");
    }
}