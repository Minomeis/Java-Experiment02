package Class;

import java.util.Arrays;

public class Student {
    int id;
    String name;
    String sex;
    int age;
    Course course;
    Course[] c = new Course[5];
    int i;

    Student(int id,String name,String sex,int age){
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    void add_course(Course cc){
        course = cc;
        c[i] = course;
        i++;
    }

    void show(){
        System.out.println("课表"+ Arrays.toString(c));
    }

}
