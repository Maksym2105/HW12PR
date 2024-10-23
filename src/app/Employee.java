package app;

public class Employee {

    private String name;
    private String job;
    private String email;
    private long phoneNumber;
    private int age;

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public Employee(String name, String job, String email, long phoneNumber, int age) {
        this.name = name;
        this.job = job;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;


    }
}
