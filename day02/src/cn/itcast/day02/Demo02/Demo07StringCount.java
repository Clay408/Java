package cn.itcast.day02.Demo02;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

/*
* 题目：
* 键盘输入字符串，统计各种字符出现的次数。
* 种类有：大写字母，小写字母，数字，其他
*
* 思路：
* 1.键盘输入需要用到Scanner类
* 2.键盘输入的是字符串  String str = sc.next();
* 3.定义四个变量用来统计各种字符出现的次数
* 4.需要对字符串中的字符一个一个的进行检查，所以要用 toCharArray()方法
* 5.遍历字符数组，并且判断属于哪一种字符，然后相应的变量++
* 5.打印结果。
*
* */
public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();

        int countUpper = 0;
        int countLower = 0;
        int countNum = 0;
        int countOther = 0;

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch>='A'&&ch<='Z'){
                countUpper++;
            }else if (ch>='a'&&ch<='z'){
                countLower++;
            }else if (ch>=0&&ch<=9){
                countNum++;
            }else {
                countOther++;
            }
        }

        System.out.println("大写字母个数为："+countUpper);
        System.out.println("小写字母个数为："+countLower);
        System.out.println("数字个数为："+countNum);
        System.out.println("其他字符个数为："+countOther);
    }
}
