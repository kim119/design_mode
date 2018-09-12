package com.mj.designmode.proxy_mode.static_proxy;

/**
 * Created by kim on 2018/9/7.
 */

public class ProxyTest {
    public static  void main(String[] args){
        BuyHouse buyHouse=new BuyHouseImp();
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyHouse();

    }
}
