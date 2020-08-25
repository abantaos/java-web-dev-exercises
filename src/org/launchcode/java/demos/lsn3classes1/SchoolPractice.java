package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {

        //it will find the correct constructor from student.java based on how many arguments you enter
        //cannot have two constructors with same amount of arguments AND same types
        Student pearl = new Student("Pearl Weber", 1234, 1, 4.0);
        Student simon = new Student("simon weber", 789); //new student, no credits

        System.out.println("Pearl's gpa: " + pearl.getGpa());
        System.out.println("Simon's gpa: " + simon.getGpa());

    }
}
