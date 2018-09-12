package com.mj.designmode.link.doublesinglelink;

import android.util.Log;

/**
 * Created by kim on 2018/9/12.
 * 双链表代码实现
 */

public class TwoWayLinkedList {

    private Node head;
    private Node tail;
    private int size;
    public class Node{
        private Object data;
        private Node next;
        private Node prev;
        public Node(Object data){
            this.data=data;
        }
    }

    public TwoWayLinkedList(){
        size=0;
        head=null;
        tail=null;
    }
    //在链表头增加节点
    public void addHead(Object value){
        Node newNode=new Node(value);
        if(size==0){
            head=newNode;
            tail=newNode;
            size++;
        }else{
            head.prev=newNode;
            newNode.next=head;
            head=newNode;
            size++;
        }
    }

    //在链表尾增加节点
    public void addTail(Object value){
        Node newNode=new Node(value);
        if(size==0){
            head=newNode;
            tail=newNode;
            size++;
        }else{
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
            size++;

        }

    }

    //删除链表头
    public Node deleteHead(){
        Node temp=head;
        if(size!=0){
            head=head.next;
            head.prev=null;
            size--;
        }
        return temp;
    }

    //删除链表尾
    public Node deteleTail(){
        Node temp=tail;
        if(size!=0){
            tail=tail.prev;
            tail.next=null;
            size--;
        }
        return temp;
    }

    //获取链表的节点个数
    public int getSize(){
        return size;
    }

    //判断链表是否为空
    public boolean isEmpty(){
        return (size==0);
    }

    public void insertNode(int position,Object value){


        Node current=head;

        while((position)!=0&&current.next!=null){
            current=current.next;
            position--;
            Log.d("position",position+"");
        }

        Log.d("Node","current"+current.data);
        if(current!=null){
            Node k=new Node(value);
            Node n=current.next;
            n.prev=k;
            current.next=k;
            k.prev=current;
           // k.next=
            k.next=n;

        }else {

            return;
        }
        while(head!=null){
            Log.d("Node", "insertNode: "+head.data);
            head=head.next;


        }



    }

//    //显示节点信息
//    public void display(){
//        if(size>0){
//            Node node=head;
//            int tempSize=size;
//            if(tempSize==1){
//                Log.d("data","["+node.data+"]");
//                return;
//            }
//            while(tempSize>0){
//                if(node.equals(head)){
//                    Log.d("data",node.data+"");
//                }else if(node.next==null){
//                    Log.d("data",node.data+"");
//                }else {
//                    Log.d("data",node.data+"");
//                }
//                node=node.next;
//                tempSize--;
//            }
//        }else {
//
//
//        }

    //}

}
