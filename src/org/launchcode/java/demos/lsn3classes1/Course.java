package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

    private ArrayList<Student> students;
    private String courseName;
    private String courseDescription;

    public Course(ArrayList<Student> students, String courseName, String courseDescription){
        this.students = students;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
    }
    public ArrayList<Student> getStudents(){
        return students;
    }
    protected void setStudents(ArrayList<Student> aStudents) {
        students = aStudents;
    }
    public String getCourseName(){
        return courseName;
    }
    protected void setCourseName(String aCourseName){
        courseName = aCourseName;
    }
    public String getCourseDescription(){
        return courseDescription;
    }
    protected void setCourseDescription(String aCourseDescription){
        courseDescription = aCourseDescription;
    }
}
