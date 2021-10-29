package Class;

import java.util.Arrays;
import java.util.Scanner;

public class simulate {
    public static void main(String[] args){
        Course[] C = new Course[20];
        Course c1 = new Course(10101,"雅思听力","教404","20:00-21:30",4,40,"Jsaon");
        C[0] = c1;
        Course c2 = new Course(10102,"雅思口语","教404","20:00-21:30",3,40,"Jason");
        C[1] = c2;
        Course c3 = new Course(10103,"雅思阅读","教404","20:00-21:30",2,40,"Jason");
        C[2] = c3;
        Course c4 = new Course(10104,"雅思写作","教404","20:00-21:30",1,40,"Jason");
        C[3] = c4;
        Scanner in = new Scanner(System.in);
        System.out.println("请选择身份：管理员请输入1，教师请输入2，学生请输入3"); //判断身份
        int idd = in.nextInt();
        if (idd == 1){  //管理员操作界面
        }
        if (idd == 2){  //教师操作界面
            for (int i=0; ;i++){
                System.out.println("请输入ID：");
                int id = in.nextInt();
                System.out.println("请输入姓名：");
                String name = in.nextLine();
                //System.out.println("请输入性别：");
                //String sex = in.nextLine();
                Teacher tea = new Teacher(id, name);
                for (int j=0;j<=20;)
                tea.show();
            }


        }
        if (idd == 3){  //学生操作界面

        }





        Student hrm = new Student(20853,"韩若梅","female",19);
        hrm.add_course(c1);
        hrm.add_course(c2);
        hrm.show();
        hrm.drop_course(10101);
        hrm.show();


    }
}
