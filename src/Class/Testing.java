package Class;
import java.util.Arrays;

public class Testing {
    public static void main(String[] args){
        Course[] C = new Course[5];
        Teacher Jason = new Teacher(1001,"Jason","male");
        Course c1 = new Course(10101,"雅思听力","教404","20:00-21:30",4,40);
        C[0] = c1;
        Course c2 = new Course(10102,"雅思口语","教404","20:00-21:30",3,40);
    //    System.out.println(c2);
        C[1] = c2;
        System.out.println("111"+C[0]);
        System.out.println("222"+Arrays.asList(C));
        Student hrm = new Student(20853,"韩若梅","female",19);
    //    System.out.println(c2.id);
        hrm.add_course(c1);
        hrm.add_course(c2);
    //    System.out.println(hrm.course);
        hrm.show();

    }
}
