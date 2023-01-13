class MorseDecoder{
    String[] alphabet = {
            "a","b","c","d", "e", "f", "g", "h", "i", "j", "k", "l","m", "n","o","p","q","r","s","t", "u", "v", "w","x", "y", "z"
    };

    String[] morseCode = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....","..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-",".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
    };

    String decode(String code){
        String[] morseByte = code.split(" ");
        for(int i = 0; i < morseByte.length; i++){
            int ind = 0;
            while(ind < morseCode.length){
                if(morseByte[i].equals(morseCode[ind])){
                    morseByte[i] = alphabet[ind];
                    break;
                }
                ind++;
            }
        }
        return String.join("", morseByte).toUpperCase();
    }


    String encode(String text){
        String[] txtByte = text.split("");

        for(int i = 0; i < txtByte.length; i++){

            int ind = 0;

            while(ind < alphabet.length){
                if(txtByte[i].equals(alphabet[ind])){
                    txtByte[i] = morseCode[ind];
                    break;
                }
                ind++;
            }
        }

        return String.join(" ", txtByte).toUpperCase();
    }
}

public class Main {
    public static void main(String args[]){
        MorseDecoder morseDecoder = new MorseDecoder();
        String decodeResult = morseDecoder.decode("-- . .-.. ...- .. -.");
        String encodeResult = morseDecoder.encode("melvin");
        System.out.println(encodeResult);
        System.out.println(decodeResult);
    }
}
