package com.wbg.ioc;

import org.junit.Test;

import static org.junit.Assert.*;

public class BeanShopTest {

    @Test
    public void getBen() {
        BeanShop beanShop=new BeanShop("fruit.xml");
    }
}