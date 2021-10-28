package Class;

public class Teacher {
    int id;
    String name;
    String sex;
    Course course;

    Teacher(int id,String name,String sex){
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    void add_course(Course c){
        course.id = c.id;
        course.stu_num = c.stu_num;
        course.week = c.week;
        course.time = c.time;
        course.place = c.place;
        course.name = c.name;
    }
}
