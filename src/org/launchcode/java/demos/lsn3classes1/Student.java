package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0; //default of zero, don't NEED in the 2nd constructor
    private double gpa = 0.0;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    } //This is a constructor - transfer student

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = 0;
        this.gpa = 0.0;
    } //This is a constructor - new student




    public String getName() {
        return this.name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    //Private getter is redundant because field is private
    //use this. because it signifies it is a field (instead of global variable)


    public int getStudentId() {
        return studentId;
    }
    //no setter because we do not need to provide a way to change an ID


    public int getNumberOfCredits() {
        return numberOfCredits;
    }


    public double getGpa() {
        return gpa;
    }


}

//public void takeCourse(double grade, int credits) {
//this is how you would change grade or gpa etc with no setter
//}