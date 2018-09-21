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
import com.mj.designmode.prototype_mode.ConcretePrototype;
import com.mj.designmode.prototype_mode.ConcretePrototype2;
import com.mj.designmode.prototype_mode.Prototype;
import com.mj.designmode.prototype_mode.PrototypeManger;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Component component,componentS,componentB;
//        component=new Window();
//        componentS = new ScrollBarDecorator(component);
//        componentS.display();
//        componentB=new BlackBoarderDecorator(componentS);
//        componentB.display();


        Prototype p1=new ConcretePrototype();
        PrototypeManger.setPrototype("p1",p1);

        //获取原型来创建
        try {
            Prototype p3=PrototypeManger.getProtoType("p1").clone();
            p3.setName("张三");

            Prototype p2=new ConcretePrototype2();
            PrototypeManger.setPrototype("p2",p2);

            // 重新获取原型来创建对象

            Prototype p4=PrototypeManger.getProtoType("p4").clone();
            p4.setName("李四");
            System.out.println("第二个实例"+p4);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
