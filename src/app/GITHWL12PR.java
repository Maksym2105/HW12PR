package app;

public class GITHWL12PR {
    public static void main(String[] args) {

        Employee kate = new Employee(
                "Kate", "Java Developer", "kate34@gmail.com", +890684931, 32);
        System.out.println(
                kate.getName() + " " + kate.getJob()+ " " + kate.getEmail() + " " + kate.getPhoneNumber());

        Car car = new Car();
        car.start();


    }
}
