package person;

import java.util.Locale;

public class Teacher extends Person{
    String workPlace;
    short experience;
    Student[] students;
    Teacher(){

    }

    public Teacher(String name, String surname, short age, String workPlace, short experience, Student[] student) {
        super(name, surname, age);
        this.workPlace = workPlace;
        this.experience = experience;
        this.students = student;
    }


    void displayStudentByGroupName(String group){

        for (Student student :students ) {
            if(student.group.equals(group.toUpperCase())){
                System.out.println(student.toString());
            }
        }
    }
}
