package com.mj.designmode.build_mode;


/**
 * Created by kim on 2018/9/7.
 */

public class ConcreteBuilder extends Builder {
   private Computer computer=new Computer();
    //创建产品实例
    @Override
    public void BuildCPU() {
        computer.add("组装cpu");
    }
    @Override
    public void BuildMainboard() {
        computer.add("组装主板");
    }
    @Override
    public void BuildHD() {
        computer.add("组装主板");
    }
    @Override
    public Computer GetComputer() {
        return computer;
    }
}
