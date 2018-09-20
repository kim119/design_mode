package com.mj.designmode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mj.designmode.decorator_mode.BlackBoarderDecorator;
import com.mj.designmode.decorator_mode.Component;
import com.mj.designmode.decorator_mode.ComponentDectorator;
import com.mj.designmode.decorator_mode.ScrollBarDecorator;
import com.mj.designmode.decorator_mode.Window;
import com.mj.designmode.link.doublesinglelink.TwoWayLinkedList;
import com.mj.designmode.link.singlelink.SingleLinkedList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Component component,componentS,componentB;
        component=new Window();
        componentS = new ScrollBarDecorator(component);
        componentS.display();
        componentB=new BlackBoarderDecorator(componentS);
        componentB.display();



    }
}
