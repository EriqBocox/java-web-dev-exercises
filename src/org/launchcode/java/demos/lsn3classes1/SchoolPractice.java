package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        Student bocox = new Student ("Eriq Bocox", 173, 1, 4.0);
        Student hopkins = new Student( "Alexa Hopkins", 286, 3, 4.3);
        Student stewart = new Student("Sabrina Stewart", 364, 2, 2.5);
        Student greenberg = new Student("Gabriella Greenberg", 451, 6, 3.5);

        ArrayList<Student> roster = new ArrayList<>();
        roster.add(bocox);
        roster.add(hopkins);
        roster.add(stewart);
        roster.add(greenberg);

        Teacher mccarthy = new Teacher("Paul", "McCarthy", "History", 10);

        ArrayList<Teacher> leader = new ArrayList<>();
        leader.add(mccarthy);

        for(Teacher teacher : leader) {
            System.out.println(teacher.getFirstName() + " " + teacher.getlastName() + " has been a teacher for " + teacher.getYearsTeaching() + " years and teaches " + teacher.getSubject());
        }

        for (Student student : roster) {
            System.out.println(student.getName() + "'s ID is " + student.getId() + " and has " + student.getNumberOfCredits() + " credit with a Gpa of " + student.getGpa());
        }
    }
}
