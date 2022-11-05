public class Human {
    //return a full name
    public static String fullName (String fName, String lName) {
        return fName.concat(" ").concat(lName);
    }

    //Turns text into Camel Case
    public static String camelCaser(String str){
        String strFirstChar = str.split("")[0];

        return str.replaceFirst(strFirstChar, strFirstChar.toUpperCase());
    }

    public static String sanitizerFName(String fullName){
            String fName = fullName.split(" ")[0];
            String lName = fullName.split(" ")[1];

            return camelCaser(fName.toLowerCase()).concat(" ").concat(camelCaser(lName.toLowerCase()));
    }

    public static void main(String[] args){
        String userFName = fullName("mELVIN", "aGUStin");
        String sanitizedFullName = sanitizerFName(userFName);

        System.out.println(sanitizedFullName);
    }
}
