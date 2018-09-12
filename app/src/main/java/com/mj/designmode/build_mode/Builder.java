package com.mj.designmode.build_mode;

/**
 * Created by kim on 2018/9/7.
 */

public  abstract  class Builder {

    //第一步 ：装cpu
    //声明为抽象方法，具体由子类实现

    public abstract void BuildCPU();

    //装主板
    public abstract  void BuildMainboard();

    public  abstract void BuildHD();

    public abstract Computer GetComputer();
}
