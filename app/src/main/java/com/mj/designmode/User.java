package com.mj.designmode;

/**
 * Created by kim on 2018/9/7.
 */

public class User implements  Observer {

    private String name;
    private String message;
    public User(String name){
        this.name=name;
    }
    @Override
    public void update(String message) {
        this.message=message;
        read();

    }

    public void read(){
        System.out.println("收到推送消息"+message);
    }
}
