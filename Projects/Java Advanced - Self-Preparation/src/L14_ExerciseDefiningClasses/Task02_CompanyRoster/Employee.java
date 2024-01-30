package L14_ExerciseDefiningClasses.Task02_CompanyRoster;

public class Employee {
    private String name;
    private double salary;
    private String position;
    private String department;
    //optional
    private String email = "n/a";
    private int age = -1;
    /* name, salary, position, department, email, and age.
    The name, salary, position, and department are mandatory,
    while the rest are optional.*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
    }

    public Employee(String name, double salary, String position, String department, String email, int age) {
        this(name, salary, position, department);
        this.email = email;
        this.age = age;
    }

    public Employee(String name, double salary, String position, String department, String email) {
        this(name, salary, position, department);
        this.email = email;

    }

    public Employee(String name, double salary, String position, String department, int age) {
        this(name, salary, position, department);
        this.age = age;
    }
    @Override
    public String toString () {
        StringBuilder builder = new StringBuilder();
        builder.append(name + " ").append(salary + " ").append(email + " ").append(age);
        return builder.toString();
    }

}
