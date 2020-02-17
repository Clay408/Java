package cn.itcast.day02.Demo04;

import javax.swing.*;

/*
* 题目：计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？
* 1.既然确定了范围，那就用for循环
* 2.起始点-10.8应该转换成-10
*   2.1 可以使用Math.ceil()方法向上取整
*   2.2 可以使用强制类型转换，直接忽略掉小数位。
* 3.每一个数字都是整数，所以步进表达式应该是count++,这样每次都是+1的。
* 4.如何拿到绝对值：Math.abs（）
* 5.一旦发现符合要求的数字，那么步进器就+1；
*
*
* 备注：Math.ceil()方法返回的是double类型的值，但是double类型的值也是可以 ++ 的。
*
* */
public class Demo04MathPractise {
    public static void main(String[] args) {
        int count = 0;
        double min = -10.8;
        double max = 5.9;

        for (int i = (int)min; i <5.9 ; i++) {
            int abs = Math.abs(i);
            if (abs>6||abs<2.1){
                System.out.println(abs);
                count++;
            }
        }

        System.out.println("符合要求的整数有："+count+"个");
    }
}
