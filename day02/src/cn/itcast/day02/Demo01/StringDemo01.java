package cn.itcast.day02.Demo01;
/*
* java.lang.String类代表字符串。
* API当中说：java当中所有字符串的字面值都作为此类的实例实现。
* 其实就是说，程序当中所有双引号字符串都是String类的对象。（就算没有new，也算是）
*
* 字符串的特点：
* 1.字符串的内容永不可变。【重点】
* 2.正因为字符串内容不可改变，所以字符串是可以共享使用的。
* 3.字符串效果上相当于 char[] 字符数组，但是底层原理是byte[] 字节数组。
*
* 创建字符串的常见的 3+1种方式
* 三种构造方法：
* 1.public String(); 创建一个空白字符串，不含有任何内容。
* 2.public String(char[] array); 根据字符数组的内容，创建字符串内容。
* 3.public String(byte[] array); 根据字节数组的内容，创建字符串内容。
*一种直接创建
* */
public class StringDemo01 {

    public static void main(String[] args) {
        //直接创建
        String str1 = "abc";
        System.out.println(str1);
        //1.空白字符串
        String str2 = new String();
        System.out.println(str2);

        //2.根据字符数组创建字符串
        char[] array = {'1','2','3'};
        String str3 = new String(array);
        System.out.println(str3);

        //3.根据字节数组创建字符串
        byte[] array2 = {97,98,99};
        String str4 = new String(array2);
        System.out.println(str4);
    }
}
