public class StringMethods {
    public static  void  main(String[] args){
        String myString = "Hi there my friend! I am Melvin Agustin from the beautiful country of the Philippines. If you are looking for someone to create a website for your Business, or any type of website you want, you are in the right place!";
        System.out.println("reference string: "+ myString);

        //	Returns the character at the specified index (position)
        char charAtMethod = myString.charAt(47);

        //Returns the Unicode of the character at the specified index
        int cpaMethod = myString.codePointAt(47);


        //The method returns 0 if the string is equal to the other string. A value less than 0 is returned if the string is less than the other string (less characters) and a value greater than 0 if the string is greater than the other string (more characters).
        String myString2 = "Melvin";
        int comparedResult = myString2.compareTo(myString);

        //Appends a string to the end of another string
        String fName = "Melvin";
        String lName = "Agustin";
        String joined = fName.concat(lName);

        //	Checks whether a string contains a sequence of characters
        boolean contained = myString.contains("Melvin");

        //Returns a String that represents the characters of the character array
        char[] nameSplited = {'m', 'e','l','v','i', 'n'};
        String nameJoined = "".copyValueOf(nameSplited, 0,6 );

        //Splited
        String x = "Melvn Agustin";
        System.out.print(x.isEmpty());
    }
}
