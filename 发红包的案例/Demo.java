package it.learn.Demo.Demo03;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",1000000000);
        //装好红包
        ArrayList<Integer> redList = manager.send(10020033,5);

        //定义成员
        Member member1 = new Member("成员A",0);
        Member member2 = new Member("成员B",0);
        Member member3 = new Member("成员C",0);
        Member member4 = new Member("成员D",0);
        Member member5 = new Member("成员E",0);

        //开始抢红包啦
        member1.receive(redList);
        member2.receive(redList);
        member3.receive(redList);
        member4.receive(redList);
        member5.receive(redList);

        //说出自己有多少钱。
        manager.show();
        member1.show();
        member2.show();
        member3.show();
        member4.show();
        member5.show();


    }
}
