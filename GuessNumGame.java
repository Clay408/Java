package cn.zhangzhe.Demo01;
/*
 * 猜数字游戏（二分法思想）
 *
 * 游戏规则：
 * 随机产生一个0-100之间的数字，然后进行猜测，每次猜测会告诉你是猜大了还是小了，直到猜中为止。
 * 谁用的次数少算谁赢
 *
 * 思路：
 * 1.需要产生一个随机的数字，所以用到了Random类;
 * 2.需要获取一个玩家输入的数字，用到Scanner类;
 * 3.进行比较会用到 if()语句;
 * 4.比较的次数无法确定，所以要用到一个while(true) 死循环;
 * 5.得到结果之后，用break跳出循环;
 * */
import java.util.Random;
import java.util.Scanner;

public class GuessNumGame {
    public static void main(String[] args) {
        //整体+1，相当于整个区间向右移动一个单位，所以范围变成了[1,100]，两边都能取到。
        int randomNum = new Random().nextInt(100)+1;//产生随机数字
        Scanner sc = new Scanner(System.in);

        int count = 0;

        while (true){//死循环
            System.out.println("请输入一个数字");
            int guessNum = sc.nextInt();//获取玩家输入的数字
            count++;//计数器；
            if (guessNum>randomNum){
                System.out.println("猜大了");
            }
            else if(guessNum<randomNum){
                System.out.println("猜小了");
            }
            else {
                System.out.println("恭喜你猜对了，答案是："+guessNum+"，"+"所用次数:"+count);
                System.out.println("游戏结束");
                break;//找到数字，跳出循环
            }

        }
    }
}
