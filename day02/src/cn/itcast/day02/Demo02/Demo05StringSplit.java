package cn.itcast.day02.Demo02;
/*
* 字符串切割方法
* public String[] split(String regex)
* 按照参数规则，将字符串切割成若干部分。
* 注意：split方法参数实际上是一个"正则表达式"，今后学习。
* 今天要注意，如果按照英文句点"."进行切分，必须写"\\."（两个反斜杠） 转义字符
* */

import org.w3c.dom.ls.LSOutput;

public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",");
        System.out.println("======================");

        String str2 = "aaa bbb ccc";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        System.out.println("=======================");

        String str3 = "XXX.YYY.ZZZ";
        String[] array3 = str3.split("\\.");//可以先认为是一种特殊的写法
        System.out.println(array3.length);
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}