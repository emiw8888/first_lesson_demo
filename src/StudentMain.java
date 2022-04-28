import java.util.Scanner;

class Student {
    String name;
    String surname;
    String university;
    short age;
    short score;

    Student(String name, String surname, short age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void display() {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
        System.out.println(university);
        System.out.println(score);
    }

    public void showExamResultWithAlphabet() {
        String result = score > 50 && score < 61 ? "you passed exam with E" :
                score > 60 && score < 71 ? "you passed exam with D" :
                        score > 70 && score < 81 ? "you passed exam with C" :
                                score > 80 && score < 91 ? "you passed exam with B" :
                                        score > 90 && score < 100 ? "you passed exam with A" : "You cannot pass the exam";
        System.out.println(name + " " + surname + ". " + result);
    }
}

public class StudentMain {
    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//        System.out.println("your name: ");
//        String name = sc.nextLine();
//        System.out.println("your surname: ");
//        String surname = sc.nextLine();
//        System.out.println("your age: ");
//        short age = sc.nextShort();
//
//        Student student = new Student(name,surname,age);
//        student.university = "BDU";
//        student.score = 98;
//        student.display();
//        student.showExamResultWithAlphabet();
    }
}
