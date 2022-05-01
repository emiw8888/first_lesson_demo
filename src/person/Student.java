package person;

public class Student extends Person{
    String university;
    short gpa;
    String faculty;
    String group;
    Teacher teacher;
    static int count = 0;
    {
        count++;
    }
    public Student(){

    }

    public Student(String name, String surname, short age, String university, short gpa, String faculty, String group, Teacher teacher) {
        super(name, surname, age);
        this.university = university;
        this.gpa = gpa;
        this.faculty = faculty;
        this.group = group;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return   name + "\n" + surname + "\n" + age + "\n" +
                 university + "\n" +  faculty + "\n" + group ;
    }

    static int getObjectCount(){
        return count;
    }
}
