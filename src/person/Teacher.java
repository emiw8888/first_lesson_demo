package person;

import java.util.Locale;

public class Teacher extends Person{
    String workPlace;
    short experience;
    Student[] student;
    Teacher(){

    }

    public Teacher(String name, String surname, short age, String workPlace, short experience, Student[] student) {
        super(name, surname, age);
        this.workPlace = workPlace;
        this.experience = experience;
        this.student = student;
    }

    void displayStudentByGroupName(String group){
        for (int i = 0; i < student.length; i++) {
            if(student[i].group.equals(group.toUpperCase())){
                System.out.println(student[i].name);
                System.out.println(student[i].surname);
                System.out.println(student[i].faculty);
                System.out.println(student[i].university);
            }
        }
    }
}
