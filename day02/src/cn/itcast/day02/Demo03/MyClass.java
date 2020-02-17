package cn.itcast.day02.Demo03;

public class MyClass {

    int num = 0;
    static int staticNum;




    //静态方法不可以访问普通的成员变量
    public static void method(){

//静态方法不能使用this关键字，因为this关键字是相对于对象来说的，而不是类。
//        System.out.println(this);

        //错误写法，静态方法不能访问成员变量，因为是先有静态后又普通的成员。
        //先人不知后人，后人知道先人
//        System.out.println(num);


    }

    //成员方法可以访问静态变量
    public void method1(){
        System.out.println(staticNum);
        System.out.println(num);
    }

}
