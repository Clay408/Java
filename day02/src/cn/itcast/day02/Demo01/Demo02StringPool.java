package cn.itcast.day02.Demo01;
/*
* 字符串双引号直接定义的（没有new的），都在字符串常量池（堆中的一块特定区域）当中。new的在堆当中。
*
*
* 对于数值类型的变量来说， == 是进行数值的比较
* 对于引用类型的变量来说， == 是进行地址的比较。
*
*
* */

public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] array = {'a','b','c'};
        String str3 = new String(array);

        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str2==str3);//false

    }
}
