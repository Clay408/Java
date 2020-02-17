package cn.itcast.day02.Demo03;

public class Student {
    private String name;
    private int age;
    private int id = 0;
    static int room;
    static int countID = 0;
    public Student() {
        this.id = ++countID;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++countID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
