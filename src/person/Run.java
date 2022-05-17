package person;

import car.Car;
import car.Kia;
import car.Truck;
import figure.Circle;
import figure.Figure;
import figure.Polygonal;
import figure.Rectangle;
import multidimensional.Multidimensional;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Run {
    public static void main(String[] args) {
        System.out.println(Circle.pi);

//        Teacher teacher = new Teacher("Kenan","Fatullayev", (short) 25,
//            "Pashabank",(short) 4,null);
//        Student emil = new Student("emil","cahangirli",(short) 18,"adnsu",
//                (short) 84,"BA","BBA",teacher);
//        Student murad = new Student("murad","Aliyev",(short) 18,"adnsu",
//                (short) 84,"BA","ZU",teacher);
//        teacher.students
//                = new Student[]{emil, murad};
//        System.out.println(Student.getObjectCount());
//        teacher.displayStudentByGroupName("ZU");

//        int rowSize;
//        int columnSize;
//        Scanner sc = new Scanner(System.in);
//        while(true){
//            System.out.println("enter row size ");
//            rowSize = sc.nextInt();
//            System.out.println("enter column size ");
//            columnSize = sc.nextInt();
//            if (rowSize == columnSize) break;
//            System.out.println("please enter same numbers for both of them");
//        }
//        Multidimensional mt = new Multidimensional(rowSize,columnSize);
//        mt.enterValuesFromConsole(sc);
//        System.out.println(Arrays.toString(mt.findFirstDiagonalElements()));
//        System.out.println(Arrays.toString(mt.findSecondDiagonalElemenets()));
//        mt.printArrayElementsinMatrixFormat();

        Car kia = new Kia("sportage", "white", (short) 240, (byte) 4);
        Truck truck = new Truck("DAF", "Blue", (short) 180, (byte) 6, 5000);
        kia.display();
        kia.gas();
        System.out.println(kia.getWheelCount());

        truck.display();
        truck.gas();
        System.out.println(truck.getWheelCount());
        truck.getWeightCapacity();

        Rectangle rectangle = new Rectangle(7, 8);
        System.out.println("area: " + rectangle.area());
        System.out.println("perimeter" + rectangle.perimeter());
        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println("area: " + circle.area());
        System.out.println("length: " + circle.perimeter());
        Polygonal polygonal = new Polygonal(4, 6);
        System.out.println("area: " + polygonal.area());
        System.out.println("perimeter: " + polygonal.perimeter());
    }
}
