package cn.itcast.day01.Demo02;

import java.util.ArrayList;

public class ArrayListPrintDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("张三丰");
        list.add("宋远桥");
        list.add("张无忌");
        list.add("张翠山");
        list.add("张无忌他娘");
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i<list.size()-1){
                System.out.print(name+"@");
            }
            else System.out.print(name+"}");

        }
    }
}
