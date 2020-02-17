package cn.itcast.day02.Demo02;
/*
* String之中常用的获取方法
*
* 1.public int length();获取字符串当中字符的个数，拿到字符串长度。
* 2.public String concat(String str); 字符串拼接并且返回新的字符串。
* 3.public char charAt(int index):获取指定索引位置的字符，并且返回该字符。（索引从0开始）
* 4.public int indexOf(String str):查找参数字符串在本字符串当中第一次出现的索引位置，如果没有就返回 -1
* */
public class Demo02StringGet {
    public static void main(String[] args) {
        //1.获取字符串的长度
        int length ="skdjlksdjskjdlsajdlasjd".length();
        System.out.println("字符串的长度是："+length);

        //2.拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);

        System.out.println(str1);//Hello 原封不动
        System.out.println(str2);//World 原封不动
        System.out.println(str3);//HelloWorld 这种拼接是生成一个全新的字符串，不会影响到原来字符串的内容。
        System.out.println("===============");

        //获取指定位置索引的单个字符
        char ch = "hello".charAt(1);
        System.out.println("在1号位置的字符是："+ch);
        System.out.println("================");

        //查找参数字符串在本来字符串中第一次出现的索引位置，如果没有就返回-1
        String original = "HelloWorld";
        int index = original.indexOf("llo");
        System.out.println("第一次出现的索引位置是："+index);
    }
}
