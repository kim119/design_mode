package com.mj.designmode.decorator_mode;

/**
 * Created by kim on 2018/9/20.
 */

public class ComponentDectorator extends Component {
    private Component component;
    public ComponentDectorator(Component component){
        this.component=component;
    }
    @Override
    public void display() {
        component.display();

    }
}
