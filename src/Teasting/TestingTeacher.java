package Teasting;

import java.util.Scanner;

public class TestingTeacher {
    public static void main(String[] args) {
        //Scanner s = new Scanner(System.in);
        //System.out.println("请选择身份（请输入”老师“或者“学生”）");
        //String shenfen = s.nextLine();

            //int i = 0;
            Classes[] classes = new Classes[3];
            Teacher tea1 = new Teacher(2001, "Jason", "男", classes);
            Classes classes1 = new Classes(
                    1111,
                    "雅思听力",
                    "综1020",
                    "20:00-21:30",
                    3,
                    40);
            //tea1.set_class(classes1);
            tea1.add(
                    1112,
                    "雅思口语",
                    "综1020",
                    "20:00-21:30",
                    4,
                    40);
            tea1.add(
                    1111,
                    "雅思听力",
                    "综1020",
                    "20:00-21:30",
                    3,
                    40);
            System.out.println(tea1.id);
            System.out.println(classes1.id);
            tea1.show();
            tea1.show_all();


    }
}
