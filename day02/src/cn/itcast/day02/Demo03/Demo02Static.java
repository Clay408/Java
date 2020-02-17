package cn.itcast.day02.Demo03;
/*静态代码块
 * 格式
 * public class 类名称{
 *   static{
 *       //代码块
 *   }
 *
 * }
 *特点：
 * 当第一次用到本类时，静态代码块儿执行唯一的一次。
 *静态的总是优先于普通的
 *
 *
 * 静态代码块的典型用途：
 * 用来一次性的对静态成员变量进行赋值。
 * */
public class Demo02Static {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();//第二次执行时，静态代码块就不会执行了。
    }
}
