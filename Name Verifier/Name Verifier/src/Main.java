public class Main {
    public static void main(String[] args){
        /***************  Client Input ****************/

        //this 3 lines code is editable acording to client input
        String myName = "Melvin Agustin";
        String firstName = "Melvin";
        String lastName = "Agustin";

        /********************* Qualification  *************************/

        //lengh of the client name input (this code is not editable)
        int inputLength = myName.length();

        //maximum name chars input (his code is editable)
        int maxLength = 8;

        /********************* Verification  *************************/

        //this code are not editable
        String clientNameLow = myName.toLowerCase();
        String fNameVerification = firstName.toLowerCase();
        String lNameVerification = lastName.toLowerCase();

        int fNameInd = clientNameLow.indexOf(fNameVerification);
        int lNameInd = clientNameLow.indexOf(lNameVerification);

        /********************* Checking *************************/
        if(fNameInd != -1 && lNameInd != -1){
            System.out.println("Name Verified...");
        }else if(fNameInd == -1 && lNameInd != -1){
            System.out.println("Name connot verified...");
            System.out.println("Err: first name "+ firstName + " cannot find in Registry names.");
        }else if(lNameInd == -1 && fNameInd != -1){
            System.out.println("Name connot verified...");
            System.out.println("Err: lastname "+ lastName + "cannot find in Registry names.");
        }else if(lNameInd == -1 && fNameInd == -1){
            System.out.println("Name connot verified...");
            System.out.println("Err: "+ firstName +" "+ lastName + " cannot find in Registry names.");
        }
    }
}