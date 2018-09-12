package com.mj.designmode.link.singlelink;

import android.util.Log;

/**
 * Created by kim on 2018/9/11.
 * 节点
 */

public class SingleLinkedList {

    private int size;
    private Node head;

    public SingleLinkedList() {
        size = 0;
        head = null;
    }

    private class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }
    }

    //在链表头添加元素
    public void addHead(Object obj) {
        Node newHead = new Node(obj);
        if (size == 0) {
            head = newHead;
        } else {
            newHead.next = head;
            head = newHead;
        }
        size++;
    }

    //删除元素
    public Object deleteHead() {
        Object obj = head.data;
        head = head.next;
        size--;
        return obj;
    }

    //查找指定元素 找到了返回节点Node 找不到返回null
    public Node find(Object obj) {
        Node current = head;
        int tempSize = size;
        while (tempSize > 0) {
            if (obj.equals(current.data)) {
                return current;
            } else {
                current = current.next;
            }
            tempSize--;
        }
        return null;
    }

    //删除指定的元素,删除成功返回true
    public boolean delete(Object value) {

        //判断当前的链表是否有元素
        if (size == 0) {
            return false;
        }

        Node current = head;
        Node previous = null;
        while (current.data != value) {
            if (current.next == null) {
                return false;
            } else {
                previous = current;
                current = current.next;
                Log.d("delete","pre="+previous.data+"cur="+current.data);
            }

        }
        if (current == head) {
            head = current.next;
            size--;
        } else {
            previous.next = current.next;
            size--;
        }
        return true;
    }


    //判断链表是否为空
    public boolean isEmpty(){

        return (size==0);
    }
    //显示节点信息
    public void display(){
//        if(size>0){
//            Node node=head;
//            int tempSize=size;
//            if(tempSize==1){
//                System.out.println("["+node.data+"]");
//                return;
//            }
//            while(tempSize>0){
//                if(node.equals(head)){
//                    System.out.print("["+node.data+"->");
//                }else if(node.next==null){
//
//                    System.out.print(node.data+"]");
//                }else {
//                    System.out.println("data"+node.data+"->");
//                }
//                node=node.next;
//                tempSize--;
//            }
            Node node=head;
            Log.d("data", node.data+"");
            while(node.next!=null){
                node=node.next;
                Log.d("data",node.data+"");
            }
//        }else {
//            System.out.println("[]");
//        }


    }



}
