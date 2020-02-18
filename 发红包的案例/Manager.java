package it.learn.Demo.Demo03;

import java.util.ArrayList;


//群主类
public class Manager extends User {
    public Manager(){
        //super() 这个是调用了父类的默认构造方法，一般不用写出来，编译器默认赠送
    }

    public Manager(String name, int money) {
        super(name, money);//这个是调用了父类的有参构造，父类把这两个参数放在了肚子里，然后又被本类所继承。。
    }


    //发红包的方法

    public ArrayList<Integer> send(int totalMoney,int count){
        //首先需要一个集合来存放若干个红包
        ArrayList<Integer> redList = new ArrayList<>();

        //看一下群主有多少钱
        int leftMoney = super.getMoney();
        if (totalMoney>leftMoney){
            System.out.println("余额不足");
            return redList;
        }
        super.setMoney(leftMoney-totalMoney);//重新设置群主的余额

        int avg = totalMoney/count;//平均一下红包的金额。
        for (int i = 0; i < count-1; i++) {//可能存在有余数的情况，所以留下最后一个红包，把余数也包进去。
            redList.add(avg);
        }
        int mod = totalMoney%count;//余数，也就是甩下的零头
        redList.add(avg+mod);//把零头一块儿包进最后一个红包里面
        return redList;

    }
}
