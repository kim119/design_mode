package com.mj.designmode.intermediary;

/**
 * Created by kim on 2018/9/7.
 * 消费者a
 */

public class ColleagueA extends  AbstractColleague {

    public ColleagueA(AbstractMediator mediator) {
        super(mediator);
    }

    public void self(){
        System.out.println("做好自己分内的事");
    }

    public void out(){
        System.out.println("同事A--> 请求同事B 做好份内工作");
        super.mediator.execute("ColleagueB","self");
    }
}
