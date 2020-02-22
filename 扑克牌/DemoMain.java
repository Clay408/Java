package Demo.DemoFinal;

import java.util.ArrayList;
import java.util.Collections;

public class DemoMain {
    public static void main(String[] args) {
        //首先定义一个集合存放牌
        ArrayList<String> cards = new ArrayList<>();
        //这个数组存放花色
        String[] suit = {"♥", "♠", "♣", "♦"};
        //这个数组存放序号
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        //添加大小王
        cards.add("大王");
        cards.add("小王");

        //利用这个嵌套循环创建一副不带大小王的牌
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                cards.add(numbers[i]+suit[j]);
            }
        }

        //三个人斗地主，需要定义三个集合来存放牌
        ArrayList<String> p0 = new ArrayList<>();
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();

        //定义一个集合存储底牌
        ArrayList<String> holeCard = new ArrayList<>();

        //洗牌,打乱牌的顺序
        Collections.shuffle(cards);

        //发牌
        for (int i = 0; i < cards.size(); i++) {
            String p = cards.get(i);
            if (i>=51){
                holeCard.add(p);
            }else if (i%3== 0) {
                p0.add(p);
            } else if (i%3==1) {
                p1.add(p);
            } else if (i%3==2){
                p2.add(p);
            }
        }

        //看牌
        System.out.println("周润发的牌："+p0);
        System.out.println("刘德华的牌："+p1);
        System.out.println("周星驰的牌："+p2);
        System.out.println("底牌："+holeCard);

    }
}
