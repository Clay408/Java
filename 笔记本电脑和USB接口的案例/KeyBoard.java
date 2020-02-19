package it.cast.Demo.Demo04;

public class KeyBoard implements USB{
    @Override
    public void open() {
        System.out.println("键盘接入");
    }

    @Override
    public void off() {
        System.out.println("键盘关闭");
    }

    public void type(){
        System.out.println("键盘输入");
    }
}
