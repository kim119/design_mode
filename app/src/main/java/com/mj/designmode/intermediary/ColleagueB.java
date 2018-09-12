package com.mj.designmode.intermediary;

/**
 * Created by kim on 2018/9/7.
 * 消费者b
 */

public class ColleagueB  extends AbstractColleague{
    public ColleagueB(AbstractMediator mediator) {
        super(mediator);
    }

    public void self(){

        System.out.println("同事B 做好自己份内的事");
    }

    public void out(){
        System.out.println("同事B --> 请求同事A做好分内工作  ...");
        super.mediator.execute("ColleagueA", "self");
    }
}
