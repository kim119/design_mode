package com.mj.designmode.build_mode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kim on 2018/9/7.
 */

public class Computer {

    private List<String> parts=new ArrayList<>();

    public void add(String part){
        parts.add(part);
    }

    public void  show(){
        for (int i=0; i<parts.size();i++) {
            System.out.println("组件"+parts.get(i)+"装好了");
        }


    }
}
