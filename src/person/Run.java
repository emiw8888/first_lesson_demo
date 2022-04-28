package person;

public class Run {
    public static  void main(String[] args) {
        Student emil = new Student("emil","cahangirli",(short) 18,"adnsu",
                (short) 84,"BA","BBA","Kenan");
        Student murad = new Student("murad","Aliyev",(short) 18,"adnsu",
                (short) 84,"BA","ZU","Kenan");
        Teacher teacher = new Teacher("Kenan","Fatullayev", (short) 25,
                    "Pashabank",(short) 4,new Student[]{emil, murad});

        teacher.displayStudentByGroupName("ZU");
    }
}
