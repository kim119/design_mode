package com.mj.designmode.intermediary;

/**
 * Created by kim on 2018/9/7.
 * 抽象同事类
 */

public abstract class AbstractColleague {
    protected  AbstractMediator mediator;
    public AbstractColleague(AbstractMediator mediator){
        this.mediator=mediator;
    }

    public void setMediator(AbstractMediator mediator){
        this.mediator=mediator;
    }
}
