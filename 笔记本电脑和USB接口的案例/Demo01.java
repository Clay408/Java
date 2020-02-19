package it.cast.Demo.Demo04;

public class Demo01 {
    public static void main(String[] args) {
        //首先需要new一台电脑
        Laptop laptop = new Laptop();

        laptop.powerOn();
        //使用多态的形势
        USB mouse = new Mouse();
        USB keyBoard = new KeyBoard();
        //定义的变量类型就是接口类型的
        laptop.useDevice(mouse);
        laptop.useDevice(keyBoard);

        //没有使用多态的形势
        Mouse mouse1 = new Mouse();
        KeyBoard keyBoard1 = new KeyBoard();
        //没有使用多态照样可以正常传参数，因为这些子类都实现了这个接口的功能，所以可以直接当参数传进去
        laptop.useDevice(mouse1);
        laptop.useDevice(keyBoard1);

        //直接new对象的形势
        laptop.useDevice(new KeyBoard());
        laptop.useDevice(new Mouse());

        laptop.powerOff();






    }
}
