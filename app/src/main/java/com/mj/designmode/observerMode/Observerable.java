package com.mj.designmode.observerMode;


/**
 * Created by kim on 2018/9/7.
 * 被观察者接口
 */

public interface Observerable {

    public void registerObserver(Observer o);
    public void removerObserver(Observer o);
    public void notifyObserver();

}
