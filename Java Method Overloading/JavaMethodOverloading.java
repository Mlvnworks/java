public class JavaMethodOverloading {
    public static int getTotalSalary(int salPerMonth, int totalMonth){
        return salPerMonth * totalMonth;
    }

    public static double getTotalSalary(double salPerMonth, double totalMonth){
        return salPerMonth * totalMonth;
    }

    public static void main(String[] args){
            String name = "John Doe";
            double salPerMonth = 24300.80;
            double totalMonth = 2;

            System.out.println(name + " Have a total salary of "+ getTotalSalary(salPerMonth, totalMonth) + "php in "+ totalMonth + " month(s)");
    }
}
