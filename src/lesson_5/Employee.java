package lesson_5;

public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private String job;
    private String email;
    private String phone;
    private double salary;

    public Employee() {}

    public Employee(String firstName, String lastName,
                    int age, String job,
                    String email, String phone,
                    double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public String showInfo() {
        return String.format("EMPLOYEE INFO\n" +
                "Name: %s %s%nAge: %d%nJob: %s%n" +
                "Email: %s%nPhone: %s%nSalary: %.2f%n",
                firstName, lastName, age, job, email, phone, salary);
     }
}
