package com.company;

import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;

public class CourseMain {

    public static void main(String[] args) {
        //Instantiate a Course1 object named Course1 with a courseName of "DS"  and add 3 students S1,S2, S3
        Course1 course1 = new Course1("DS");
        course1.addStudent("S1");
        course1.addStudent("S2");
        course1.addStudent("S3");

        //Create a second Course1 object as a clone of course1 and add 4 new students to it;
        Course1 course2 = (Course1) course1.clone();
        course2.addStudent("S4");
        course2.addStudent("S5");
        course2.addStudent("S6");
        course2.addStudent("S7");

        System.out.println("course1 # of students =  " + course1.getNumberOfStudents());
        System.out.println("course2 # of students =  " + course2.getNumberOfStudents());
    }

}
//class course1
class Course1 implements Cloneable{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course1(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourse1Name() {
        return courseName;
    }

    public void dropStudent(String student) {
        List<String> l = new ArrayList<String>(Arrays.asList(students));
        l.removeAll(Arrays.asList("a"));
        students = l.toArray(students);
        numberOfStudents--;
    }

    @Override
    public Object clone() {
        try {
            Course1 c = (Course1) super.clone();
            c.students = new String[100];
            System.arraycopy(students, 0, c.students, 0, 100);
            c.numberOfStudents = numberOfStudents;
            return c;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}
