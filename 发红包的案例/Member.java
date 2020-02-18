package it.learn.Demo.Demo03;

import java.util.ArrayList;
import java.util.Random;


//普通成员类
public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        //红包都在这个参数集合当中了，我们需要随机从中拿一个出来
        //随机获取集合当中的索引值

        int index = new Random().nextInt(list.size());//list.size是根据集合的长度来定义随机数的取值范围

        int receiveMoney = list.remove(index);//获取集合中的红包，并且删除集合中该位置的元素
        //看一下这个成员当前有多少钱。
        int leftMoney = super.getMoney();
        //然后把抢到的红包钱加上去。
        super.setMoney(leftMoney + receiveMoney);
    }
}
