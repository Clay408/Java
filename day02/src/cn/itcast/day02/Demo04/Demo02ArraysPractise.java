package cn.itcast.day02.Demo04;

import java.util.Arrays;

/*
* 题目：请使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印。
*
* */
public class Demo02ArraysPractise {
    public static void main(String[] args) {
        String str = "sdhksdhjlsj1l2jk3j2l454212";

        //如何进行升序排列：sort()
        //必须是一个数组才能使用sort()方法
        //字符串转成数组： toCharArray()
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }

    }
}
