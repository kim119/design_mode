package com.mj.designmode.intermediary;

import java.util.HashMap;

/**
 * Created by kim on 2018/9/7.
 * 中介者
 */

abstract class AbstractMediator {

    protected HashMap<String,AbstractColleague> colleagues=new HashMap<>();

    public void addColleague(String name,AbstractColleague c){
        this.colleagues.put(name,c);
    }

    public void deleteColleague(String name){

        this.colleagues.remove(name);
    }
    public abstract void execute(String name,String method);
}
