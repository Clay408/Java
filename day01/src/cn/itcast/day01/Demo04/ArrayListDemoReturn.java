package cn.itcast.day01.Demo04;
/*
* 题目：用一个大集合存储20个随机数字，筛选其中的偶数数字存入一个小集合当中。
* 要求使用自定义的方法实现筛选。
*
* 思路；
* 1.创建两个集合，<Integer>
  2.生成随机数字，要用到Random.nextInt();
  3.存储数字，用到集合中的add方法
  4.判断集合中的数字是否是偶数，首先获取集合中的元素->get()方法，之后与2做取余操作。

* */

import com.sun.jdi.ArrayReference;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Random;

public class ArrayListDemoReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100)+1;

            bigList.add(num);
        }

        ArrayList<Integer> smallList = getNum(bigList);
        System.out.println("偶数个数为:"+smallList.size());
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }

//        GenerateRandomNum(bigList);
//        ScreenNum(bigList,smallList);
//        PrintArrayList(smallList,bigList);
    }


    public static ArrayList<Integer> getNum(ArrayList<Integer> list){
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num%2==0){
                smallList.add(num);
            }
        }

        return smallList;
    }

    public static void GenerateRandomNum(ArrayList<Integer> list){
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(100)+1);
        }
    }

    public static void ScreenNum(ArrayList<Integer> bigList,ArrayList<Integer> smallList){
        for (int i = 0; i < bigList.size(); i++) {
            if (bigList.get(i)%2 == 0){
                smallList.add(bigList.get(i));
                bigList.remove(i);
            }
        }
    }

    public static void PrintArrayList(ArrayList<Integer> smallList,ArrayList<Integer> bigList ){
        System.out.print("偶数：");
        for (int i = 0; i < smallList.size(); i++) {
            System.out.print(smallList.get(i)+" ");
        }
        System.out.println();
        System.out.println("=============================");

        System.out.print("奇数：");
        for (int i = 0; i < bigList.size(); i++) {
            System.out.print(bigList.get(i)+" ");
        }
    }

}
