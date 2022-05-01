package person;

import multidimensional.Multidimensional;

import java.util.Scanner;

public class Run {
    public static  void main(String[] args) {
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

        int rowSize;
        int columnSize;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("enter row size ");
            rowSize = sc.nextInt();
            System.out.println("enter column size ");
            columnSize = sc.nextInt();
            if (rowSize == columnSize) break;
            System.out.println("please enter same numbers for both of them");
        }
        Multidimensional mt = new Multidimensional(rowSize,columnSize);
        mt.enterValuesFromConsole();
        System.out.println(mt.findFirstDiagonalElements());
        System.out.println(mt.findSecondDiagonalElemenets());
        mt.printArrayElementsinMatrixFormat();
    }
}
