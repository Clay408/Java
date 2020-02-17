package cn.itcast.day02.Demo04;

import java.util.Arrays;

/*
* java.util.Arrays是一个与数组相关的工具类，里面提供了大量的静态方法，用来实现数组的常见操作。
* public static String toString(数组)：将参数数组变成字符串（按照默认格式：[元素1，元素2，元素3.......]）
* public static void sort(数组)：按照默认升序（从小到大）的方式给数组排序
*
* 注意：
* 1.如果是数值，sort默认按照升序的方式排序
* 2.如果是字符串，默认按照字母升序排序（汉字的话按照对应的ASCII值？）
* 3.如果是自定义类型，那么这个自定义的类需要有Comparable或者Comparator接口支持（今后学习）
* */
public class Demo01Arrays {

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        //将数组按照默认格式转化成字符串
        String intStr = Arrays.toString(array);
        System.out.println(intStr);


        int[] array1 = {14,3,3,5,6,7,23,111};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));//[3, 3, 5, 6, 7, 14, 23, 111]

        String[] array2 = {"aaa","ccc","bbb"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));//[aaa, bbb, ccc]
    }
}
