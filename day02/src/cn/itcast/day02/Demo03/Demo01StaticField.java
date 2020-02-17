package cn.itcast.day02.Demo03;

public class Demo01StaticField {
    public static void main(String[] args) {
        Student stu1 = new Student("郭靖",19);
        stu1.room = 101;
        System.out.println("姓名："+stu1.getName()+" ,年龄："+stu1.getAge()+
                " ,教室："+stu1.room+" ，学号："+stu1.getId());

        Student stu2 = new Student("黄蓉",16);
        System.out.println("姓名："+stu2.getName()+" ,年龄："+stu2.getAge()+
                " ,教室："+stu2.room+" .学号："+stu2.getId());
    }
}
