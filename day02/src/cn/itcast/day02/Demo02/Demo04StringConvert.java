package cn.itcast.day02.Demo02;
/*
* String当中与转换相关的常用方法有：
* public char[] toCharArray():将当前字符串转化成为字符数组。
* public byte[] getBytes():获取当前字符串底层的字节数组。
* public String replace(CharSequence oldString,CharSequence newString):
* 注意：CharSequence 是一个接口，而String类就是实现了这个接口的其中一个类，所以可以接受String类型的对象。
* 将所有出现的老字符串替换成新的字符串，并且返回新的字符串。
* */
public class Demo04StringConvert {
    public static void main(String[] args) {

        //1.将当前字符串转化成为字符数组。
        char[] array = "zhangzhe".toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
        System.out.println("================");

        //2.获取当前字符串底层的字节数组。
        byte[] bytes = "zhangzhe".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i]+" ");
        }
        System.out.println("=======================");
        //3.将所有出现的老字符串替换成新的字符串，并且返回新的字符串。
        //字符串内容的替换
        String str1 = "Hello World";
        String str2 = "&";
        String str3 = str1.replace(" ",str2);
        System.out.println(str3);

        String lang1 = "会不会玩啊，你大爷的！";
        String lang2 = lang1.replace("你大爷的","****");
        System.out.println(lang2);
    }
}
