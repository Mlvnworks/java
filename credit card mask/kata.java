class Maskify {
    String maskify(String str) {
        if(str.length() <= 3){
            return str;
        };

        String[] splitedString = str.split("");
        int strLength = splitedString.length < 4 ? splitedString.length : splitedString.length - 4;


        for(int num = 0; num < strLength; num++){
            splitedString[num] = "#";
        }

        return String.join("", splitedString);
    }
}

public class kata {
    public static void main(String[] args){
        Maskify mask = new Maskify();

        String masked = mask.maskify("Skippy");

        System.out.println(masked);
    }
}
