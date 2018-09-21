package com.mj.designmode.prototype_mode;

/**
 * Created by kim on 2018/9/21.
 */

public class ConcretePrototype2 implements Prototype {
    private String name;
    @Override
    public Prototype clone() {
        ConcretePrototype2 prototype=new ConcretePrototype2();
        prototype.setName(this.name);
        return prototype;
    }
    public String toString(){
        return "Now is Prototype"+this.name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name =name;

    }
}
