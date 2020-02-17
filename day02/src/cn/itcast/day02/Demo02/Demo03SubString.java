package cn.itcast.day02.Demo02;

import com.sun.jdi.connect.Connector;

/*
 * public String subString(int index):截取从index开始之后的字符串，返回新的字符串
 * public String subString(int begin,int end):截取指定范围内的字符串，返回新的字符串
 * 备注：[begin,end) 包括左边，但是不包括右边
 * */
public class Demo03SubString {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);//HelloWorld  原封不动
        System.out.println(str2);//World 新的字符串
        System.out.println("======================");

        String str3 = str1.substring(4, 7);
        System.out.println(str3);//oWo 新的字符串
        System.out.println("=================");

        //注意下面这种写法，字符串的内容仍然是没有改变的。
        //这是两个字符串   Hello java
        //strA当中保存的是地址值
        //本来保存的戏 0x666
        //后面变成了  0x777   变得只是地址值，原先地址的存储单元当中保留的内容是没有改变的。
        String strA = "Hello";
        System.out.println(strA);
        strA = "java";
        System.out.println(strA);

    }
}
