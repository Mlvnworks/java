import java.util.Objects;
import java.util.Scanner;

class Password {
    private String password;
    private String encoded;

    private String getChar(){
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String[] alphaSplited = alpha.split("");
        for(int i =0; i < alphaSplited.length; i++){
            alphaSplited[i] = alphaSplited[i].concat(alphaSplited[i].toUpperCase());
        }
        return String.join("", alphaSplited);
    }

    private String[] symbol = {"~", "`", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "-", "+", "=", "{", "[", "}","]", "|", ":", ";", "'", "<", ",", ">", ".", "?", "/", "~1", "`1", "@1", "#1", "$1", "%1", "^1", "&1", "*1", "(1", ")1", "_1", "+1", "=1", "{1", "[1", "}1", "]1", "|1", ":1", ";1", "'1"};

    void construct(String password){
        this.password = password;
    }

    String encode(){
        String[] passSplited = this.password.split("");
        String[] x = passSplited.clone();
        for(int i =0; i< passSplited.length; i++){
            int pos = getChar().indexOf(passSplited[i]);
            x[i] = this.symbol[pos];
        }
        this.encoded = String.join("x", x);
        return this.encoded;
    }

    String decode(String input){
        String[] x = input.split("x");
        String[] y = getChar().split("");

        String[] handle = x.clone();
        for(int i = 0; i < x.length; i++){
            int pos = 0;
            while(pos < this.symbol.length){
                if(Objects.equals(this.symbol[pos], x[i])){
                    break;
                }
                pos++;
            }
            handle[i] = y[pos];
        }
        return String.join("", handle);
    }
}


public class Main {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        Password password = new Password();

        System.out.println("----Select Action---- \ninput the number of your selection \n1.encode \n2.decode");
        int action1 = obj.nextInt();

        if(action1 == 1){
            System.out.println("---Please enter text--- \n DIRECTION: input must not have space, number, and special character");
            String toEncode = obj.next();
            password.construct(toEncode);
            System.out.println("Your Encoded text is: " + password.encode());
        }else{
            System.out.println("Enter/Paste the coded text");
            String codedText = obj.next();
            System.out.println("The result of coded text is :" + password.decode(codedText));
        }
    }
}
