package app;

public class Car {


    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();

    }
    private void startElectricity(){
        System.out.println("Cars electricity started");
    }

    public void startCommand(){
        System.out.println("Car transmission started");

    }
    public void  startFuelSystem(){
        System.out.println("Car fuelSystem started");
    }
}
