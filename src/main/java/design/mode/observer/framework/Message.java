package design.mode.observer.framework;

public class Message {
    String username;
    String phone;
    String msg;

    Message(String name,String phone,String msg){
        this.username=name;
        this.phone=phone;
        this.msg=msg;
    }
}
