package L23_ExerciseObjectsAndClasses.Task04_Students;

public class Student {

    private String firstName;
    private String lastName;
    private double grade;


    public Student(String firstName, String lastName, double grade) {
        //създава нов празен обект
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }
    //getters:

    public double getGrade() {
        return this.grade;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }

}
