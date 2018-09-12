package com.mj.designmode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mj.designmode.link.doublesinglelink.TwoWayLinkedList;
import com.mj.designmode.link.singlelink.SingleLinkedList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        SingleLinkedList singleLinkedList=new SingleLinkedList();
//
//        singleLinkedList.addHead("A");
//        singleLinkedList.addHead("B");
//        singleLinkedList.addHead("C");
//        singleLinkedList.addHead("D");
//        singleLinkedList.addHead("E");
//
//        //singleLinkedList.display();
//
//        singleLinkedList.delete("C");
        //singleLinkedList.display();

        TwoWayLinkedList twoWayLinkedList=new TwoWayLinkedList();

        twoWayLinkedList.addHead("A");
        twoWayLinkedList.addHead("B");
        twoWayLinkedList.addHead("C");
        twoWayLinkedList.addHead("D");
        twoWayLinkedList.addHead("E");

        twoWayLinkedList.insertNode(1,"K");
    }
}
