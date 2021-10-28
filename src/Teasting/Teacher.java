package Teasting;
import java.util.Arrays;

public class Teacher {
    int id;
    String name;
    String sex;
    Classes classes;
    Object[] aa = new Object[6];
    Object[] bb;
    Classes[] cc;
    int i;

    Teacher(int id,String name, String sex,Object[] aa) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.bb = aa;
    }

    void setClasses(Classes x){
        aa[i] = x;
    }

    void set_class(Classes x) {
        classes = x;
        cc[i] = classes;
        this.i++;
    }

    void setup_class(int id, String name, String place, String time, int week, int stu_num) {
        classes.id = id;
        classes.name = name;
        classes.place = place;
        classes.time = time;
        classes.week = week;
        classes.stu_num = stu_num;
        aa[i] = classes;
        this.i++;
    }

    void add(int id, String name, String place, String time, int week, int stu_num){
        aa[0] = id;
        aa[1] = name;
        aa[2] = place;
        aa[3] = time;
        aa[4] = week;
        aa[5] = stu_num;
        bb[i] = Arrays.toString(aa);
        this.i++;
    }
    void show(){
        System.out.println("课程信息为"+Arrays.toString(aa));
    }

    void show_all(){
        System.out.println("课程有"+Arrays.toString(bb));
    }

}
