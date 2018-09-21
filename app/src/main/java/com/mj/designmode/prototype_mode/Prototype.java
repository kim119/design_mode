package com.mj.designmode.prototype_mode;

/**
 * Created by kim on 2018/9/21.
 * 抽象原型角色
 */

public interface Prototype {
    public Prototype clone();
    public String getName();
    public void setName(String name);
}
