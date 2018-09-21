package com.mj.designmode.decorator_mode;

/**
 * Created by kim on 2018/9/20.
 *
 */

public class ScrollBarDecorator extends ComponentDectorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }
    public void display(){
        this.setScrollBar();
        super.display();
    }


    public void setScrollBar(){
        System.out.println("为构件增加滚动条！");
    }


}
