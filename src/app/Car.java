package app;

public class Car {


    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();

    }
    private void startElectricity(){
        System.out.println("Car electricity started");
    }

    private void startCommand(){
        System.out.println("Car transmission started");

    }
    private void  startFuelSystem(){
        System.out.println("Car fuelSystem started");
    }
}
