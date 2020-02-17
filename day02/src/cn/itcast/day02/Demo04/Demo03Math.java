package cn.itcast.day02.Demo04;
/*
* java.lang.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学相关的运算操作
* public static double abs(double num) :获取绝对值
* public static double ceil(double num): 向上取整
* public static double floor(double num):向下取整
* public static long round(double num):四舍五入
*
*
* Math.PI 代表近似的圆周率
* */
public class Demo03Math {
    public static void main(String[] args) {

        //绝对值
        System.out.println(Math.abs(222));//222
        System.out.println(Math.abs(0));//0
        System.out.println(Math.abs(-5));//5

        System.out.println("===============");
        //向上取整
        System.out.println(Math.ceil(12.1));//13.0
        System.out.println(Math.ceil(12.0));//12.0

        System.out.println("================");

        //向下取整
        System.out.println(Math.floor(13.9));//13.0
        System.out.println(Math.floor(14));//14.0

        System.out.println("===================");

        //四舍五入
        System.out.println(Math.round(12.5));//13
        System.out.println(Math.round(12.4));//12


    }
}
