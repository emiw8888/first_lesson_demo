package person;

public class Student extends Person{
    String university;
    short gpa;
    String faculty;
    String group;
    String teacher;
    static int count = 0;
    {
        count++;
    }
    public Student(){

    }

    public Student(String name, String surname, short age, String university, short gpa, String faculty, String group, String teacher) {
        super(name, surname, age);
        this.university = university;
        this.gpa = gpa;
        this.faculty = faculty;
        this.group = group;
        this.teacher = teacher;
    }

    int getObjectCount(){
        return count;
    }
}
