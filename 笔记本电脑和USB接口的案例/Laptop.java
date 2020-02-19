package it.cast.Demo.Demo04;

import java.nio.file.attribute.UserDefinedFileAttributeView;

public class Laptop {

    public void powerOn(){
        System.out.println("电脑开机");
    }

    public void powerOff(){
        System.out.println("电脑关机");
    }


    public void useDevice(USB usb){
        usb.open();
        if (usb instanceof Mouse){//先判断
            Mouse mouse = (Mouse) usb;//向下转型
            mouse.click();
        }
        if (usb instanceof KeyBoard){//先判断
            KeyBoard keyBoard = (KeyBoard) usb;//向下转型
            keyBoard.type();
        }
        usb.off();
    }

}
