package com.mj.designmode.prototype_mode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kim on 2018/9/21.
 */

public class PrototypeManger {
    /**
     * 用来记录原型的编号和原型实例的对应关系
     *
     */
    private static Map<String,Prototype> map=new HashMap<>();

    /**
     * 私有构造方法，避免外部创建实例
     */
    private PrototypeManger(){}

    /***
     * 向原型管理器里面添加或是修改某个原因注册
     */
    public synchronized static void setPrototype(String prototypeId,Prototype prototype){

        map.put(prototypeId,prototype);

    }
    /***
     * 从原型管理器里面删除某个原型注册
     */
    public synchronized static void removePrototype(String prototypeId){

        map.remove(prototypeId);
    }

    /**
     * 获取某个原型编号对应的原型实例
     */

    public synchronized static Prototype getProtoType(String prototypeId) throws Exception {

        Prototype prototype=map.get(prototypeId);
        if(prototype==null){

            throw new Exception("找不到你的原型");
        }
        return  prototype;
    }
}
