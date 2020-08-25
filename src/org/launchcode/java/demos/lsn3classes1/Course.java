package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

    //has a ___
    private String name;
    private int credits;
    private ArrayList<Student> roster = new ArrayList<>(); //this is an object type

    //this is the constructor
    //does ever course have same name? if not, need parameter
    public Course(String name, int credits) {
        this.name = name;
        this.credits = credits;
        this.roster = new ArrayList<>(); //this is an object type, needs to be initialized correctly
        //roster begins class as empty ArrayList ^^ so we just call the arraylist constructor
    }

//    public void enroll(Student student) {
//        this.roster.add(student); //put the student into the arraylist
//    }

}

