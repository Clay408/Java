package it.cast.Demo.Demo04;

public class Mouse implements USB {

    @Override
    public void open() {
        System.out.println("鼠标接入");
    }

    @Override
    public void off() {
        System.out.println("鼠标关闭");
    }

    public void click(){
        System.out.println("鼠标点击");
    }
}
