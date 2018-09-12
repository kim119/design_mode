package com.mj.designmode.intermediary;

/**
 * Created by kim on 2018/9/7.
 */

public class Mediator extends  AbstractMediator {
    @Override
    public void execute(String name, String method) {

        //各自做好自己份内的事
        if("self".equals(method)){
            if("ColleagueA".equals(name)) {
                ColleagueA colleague = (ColleagueA)super.colleagues.get("ColleagueA");
                colleague.self();
            }else {
                ColleagueB colleague = (ColleagueB)super.colleagues.get("ColleagueB");
                colleague.self();
            }

        }else{//与其他同事合作
            if("ColleagueA".equals(name)) {
                ColleagueA colleague = (ColleagueA)super.colleagues.get("ColleagueA");
                colleague.out();
            }else {
                ColleagueB colleague = (ColleagueB)super.colleagues.get("ColleagueB");
                colleague.out();
            }


        }

    }
}
