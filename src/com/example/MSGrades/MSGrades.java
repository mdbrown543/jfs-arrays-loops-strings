package com.example.MSGrades;
import java.util.ArrayList;

public class MSGrades {

    private final String[] teachers = {"Ms. Smith", "Mr. Johnson", "Mrs. Doe"};
    private final ArrayList<String> students = new ArrayList<String>();
    private final ArrayList<Integer> math = new ArrayList<Integer>();
    private final ArrayList<Integer> science = new ArrayList<Integer>();
    private final ArrayList<Integer> english = new ArrayList<Integer>();

    public MSGrades(){
        // Add some students and their grades to the array lists
    students.add("Jacin");
    students.add("Kaseem");
    students.add("Mario");
    math.add(90);
    math.add(80);
    math.add(75);
    science.add(65);
    science.add(65);
    science.add(65);
    english.add(85);
    english.add(95);
    english.add(100);

    }

    public void printStudents(){
        for(String student : students){
            System.out.println(student);
        }
        System.out.println("");
    }
    public void printGrades(int index){
        System.out.println(students.get(index) + " Math: " + math.get(index));
        System.out.println(students.get(index) + " English: " + english.get(index));
        System.out.println(students.get(index) + " Science: " + science.get(index));
    }

    public static void main(String[] args) {
        // write your code here
        MSGrades school = new MSGrades();
        
        System.out.println("Middle School Roster");
        System.out.println("====================");

       school.printStudents();

        System.out.println("Middle School Grades");
        System.out.println("====================");
       school.printGrades(1);

        System.out.println("");
        System.out.println("Middle School Teachers");
        System.out.println("====================");
       for(int i = 0; i < school.teachers.length; i++){
           String teachersName = school.teachers[i];
           System.out.println(teachersName);
        }

        System.out.println("\nStudent Grades:");
        System.out.println("====================");
        for(int i=0;i<school.students.size();i++){
            school.printGrades(i);
        }

    }
}
