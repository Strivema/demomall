package com.ccb.ray.demomall.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Marie
 * @date 2020/3/22 2:18 PM
 **/
@Component
public class Buyer {
    @Value("${buyer:}")
    private String buyer;

    public void servicce() {
        System.out.println(buyer + "...");
        System.out.println(buyer + "ok");
    }


}
