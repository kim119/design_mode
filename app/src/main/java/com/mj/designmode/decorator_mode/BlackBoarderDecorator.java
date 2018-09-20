package com.mj.designmode.decorator_mode;

/**
 * Created by kim on 2018/9/20.
 */

public class BlackBoarderDecorator extends ComponentDectorator {

    public BlackBoarderDecorator(Component component) {
        super(component);
    }

    public void display(){
        this.setBlackBoarder();
        super.display();

    }
    private void setBlackBoarder(){
        System.out.println("为构件增加黑色边框！");
    }
}
