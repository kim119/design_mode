package com.mj.designmode.prototype_mode;

/**
 * Created by kim on 2018/9/21.
 */

public class ConcretePrototype implements Prototype {

    private String name;
    @Override
    public Prototype clone() {
        ConcretePrototype prototype=new ConcretePrototype();
        prototype.setName(this.name);
        return prototype;
    }

    public String toString(){
        return "Now in Prototype"+this.name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;

    }
}
