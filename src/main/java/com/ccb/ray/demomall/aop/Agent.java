package com.ccb.ray.demomall.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Marie
 * @date 2020/3/22 2:17 PM
 **/
@Component
@Aspect
public class Agent {
    @Value("${agent:}")
    private String agent;
    @Pointcut("execution(* com.ccb.ray.demomall.aop.Buyer.servicce())")
    public void IService(){

    }

    @Before("IService()")
    public void before(){
        System.out.println(agent+"代理");
    }
    @After("IService()")
    public void after(){
        System.out.println(agent+"结束");

    }


}
