import java.util.Scanner;

class Person {
    String name;
    String surname;
    int age;
    String university;
    Person(){}
    Person(String name,String surname,int age,String university){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.university = university;
    }
    public void display(){
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
        System.out.println(university);

    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("your name: ");
        String name = sc.next();
        System.out.println("your surname: ");
        String surname = sc.next();
        System.out.println("your university: ");
        String university = sc.nextLine();//nextline problem
        System.out.println("your age: ");
        int age = sc.nextInt();
        Person person = new Person(name,surname,age,university);
        person.display();
    }
}
