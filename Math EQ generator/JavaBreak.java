public class JavaBreak {
    public static void main(String[] args){
        //Pwede mong ibahin yung number na nasa baba
        //////////👇
        int num = 655;

        //Operations(bawal ibahin)
        String[] tools = {"+", "-","x", "/"};

        //kung ilan gusto mong maging equation(pwedeng ibahin)
        ///////////////////👇
        int problemCount = 10;

        System.out.println("-----------😎 EQUATIONS 😎-----------");
        //counter
        int i = 1;

        while(i <= problemCount){
            String method =  tools[(int)Math.floor(Math.random() * tools.length)];

            //changers and result handlers
            float handle = 0.0f;
            float result = 0.0f;
            double changer = Math.floor(Math.random() * num / 2);

            // Algorithm
            switch (method) {
                case "+" -> {
                    handle = (float) num / 2;
                    result = handle + handle;
                    System.out.println(i + ". " + (handle - changer) + " + " + (handle + changer) + " = " + (int) result);
                }
                case "-" -> {
                    handle = (float) num + (float) num;
                    result = handle - num;
                    System.out.println(i + ". " + handle + changer + " - " + ((double) result + changer) + " = " + (int) result);
                }
                case "x" -> {
                    float divider = (float) Math.floor(Math.random() * num);
                    handle = num / divider;
                    result = handle * divider;
                    System.out.println(i + ". " + handle + " x " + divider + " = " + result);
                }
                case "/" -> {
                    int multiplier = num / 2;
                    handle = num * multiplier;
                    result = handle / multiplier;
                    System.out.println(i + ". " + handle + " ÷ " + multiplier + " = " + result);
                }
            }
            i++;
        }

        System.out.println("------- 😍Thank you! 😍-------");
    }
}
