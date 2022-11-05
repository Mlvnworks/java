import java.util.Scanner;
class AtmMachine{
    private int pin;
    boolean cardInserted;
    private int[][] registredAccount = {
            {1230, 6_700},
            {1229, 78_000},
            {1203, 200},
            {1222, 34_000_560},
            {8888, 8_988_878}
    };

    void constructor(int pin){
        this.pin = pin;
        this.cardInserted = false;
    }
    void insertCard(){
        this.cardInserted = true;
    }
    void rejectCard(){
        this.cardInserted = false;
    }

    boolean checkPin(){
        int count = 0;
        boolean x = false;
        while(count < registredAccount.length){
            boolean y = x;
            if(registredAccount[count][0] == this.pin){
                y = true;
            }
            x = y;
            count++;
        }
        return x;
    }

    int getBalance(){
            int bal = 0;
            for(int i = 0; i < this.registredAccount.length; i++){
                int b = bal;
                if(this.pin == this.registredAccount[i][0]){
                    b =  this.registredAccount[i][1];
                }
                bal = b;
            }
           return bal;
    }

    int cashOut(int amount){
        int balanceRemain = 0;
        for(int[] acount : this.registredAccount){
                int x = balanceRemain;
                if(acount[0] == this.pin){
                    x = acount[1] - amount;
                }
                balanceRemain = x;
        }
        return balanceRemain;
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String direction = "type the number of your response";
        AtmMachine atm = new AtmMachine();

        //proccess #1
        System.out.println("-------------Please insert your card------------- \n"+direction+" \n 1.insert \n 2.cancel");
        boolean inserted = obj.nextInt() == 1 ? true : false;
        
        if(inserted){
            atm.insertCard();
            System.out.println("Card successfully inserted");

            //proccess #2
            System.out.println("\n\n\n-------------Please Enter 4 digit pin-------------");
            int pin = obj.nextInt();
            atm.constructor(pin);

            if(atm.checkPin()){
                System.out.println("\n\n\n-------------Create an transaction-------------\n"+direction+"\n1.Balance Enquire\n2.cash out\n3.Exit");
                int transaction = obj.nextInt();
                if(transaction == 1){

                    //Balance Checking
                    int balance = atm.getBalance();
                    System.out.println("\n\n\nYour current balance is: "+ balance +"php\nRestart the program to try again...");
                }else if(transaction == 2){

                    //if client choose cash out
                    System.out.println("\n\n\nPlease Enter Amount");
                    int amount = obj.nextInt();
                    int amountRemain = atm.cashOut(amount);
                    System.out.println("\n\n\nSuccessfuly cash outed "+amount+"php\nYour new Balnce is "+amountRemain+"php");
                }else if(transaction == 3){

                    //exit
                    System.out.println("\n\n\nSucessfully Exit\nRestart the program to try again...");
                    //reject atm card
                    atm.rejectCard();
                }
            }else{
                //if pin input doesnt exist
                System.out.println("You've Enter Wrong pin...Please Try Again...");

                //reject atm card
                atm.rejectCard();
            }
        }else{

            //exit
            System.out.println("Succesfully cacelled");

            //reject atm card
            atm.rejectCard();
        }
    }
}