class Car{
    int maxKiloPerHour = 0;
    private boolean ready = false;

    void start(){
        if(ready){
            System.out.println("PLease turn off the engine first!");
        }else{
            ready = true;
            System.out.println("The Engine Started");
        }
    }

    void run (int curSpeed){
        if(!ready){
            System.out.println("Please Start Engine Before Running");
        }else{
            int calcSpeed = curSpeed > maxKiloPerHour ? maxKiloPerHour : curSpeed;
            System.out.println("The car running at " + calcSpeed + "km/h");
        }
    }

    void off (){
        if(!ready){
            System.out.println("Please Start Engine Before Turning Off");
        }else{
            System.out.println("The car currently running "+ 0 + " \nCar succesfully turned off...");
            ready = false;
        }
    }
}

public class  OOPJava {
    public static void main(String[] args){
        Car honda = new Car();
        honda.maxKiloPerHour = 200;
        honda.start();
        honda.run(180);
        honda.run(60);
        honda.off();
    }
}
