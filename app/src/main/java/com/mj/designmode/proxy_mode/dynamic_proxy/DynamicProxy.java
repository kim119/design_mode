package com.mj.designmode.proxy_mode.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by kim on 2018/9/7.
 */

public class DynamicProxy  implements InvocationHandler{
    private Object object;

    public DynamicProxy(final Object object){
        this.object=object;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("付首付");
         Object result=method.invoke(object,args);
        return result;
    }
}
