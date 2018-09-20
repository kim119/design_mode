package com.mj.designmode.observerMode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kim on 2018/9/7.
 * 被观察者
 */

public class WechatServer implements Observerable {

    private List<Observer> list;
    private String message;

    public WechatServer(){
        list = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer o) {
        list.add(o);

    }

    @Override
    public void removerObserver(Observer o) {
        if(!list.isEmpty()){
            list.remove(o);
        }


    }

    @Override
    public void notifyObserver() {
        for(int i=0;i<list.size();i++){
            Observer observer = list.get(i);
            observer.update(message);
        }
    }

    public  void setInfomation(String s){
        this.message=s;
        notifyObserver();

    }
}
