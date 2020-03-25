package com.ccb.ray.demomall.crud.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Marie
 * @date 2020/3/25 9:44 PM
 **/
@Aspect
@Component
public class DataSourceAop {
    @Pointcut("@annotation(com.ccb.ray.demomall.crud.annotation.Master)" +
            "|| execution(* com.ccb.ray.demomall.crud.service..*.insert*(..))" +
            "|| execution(* com.ccb.ray.demomall.crud.service..*.add*(..))" +
            "|| execution(* com.ccb.ray.demomall.crud.service..*.update*(..))" +
            "|| execution(* com.ccb.ray.demomall.crud.service..*.edit*(..))" +
            "|| execution(* com.ccb.ray.demomall.crud.service..*.delete*(..))" +
            "|| execution(* com.ccb.ray.demomall.crud.service..*.remove*(..))")
    public void writePointCut() {

    }

    @Pointcut("@annotation(com.ccb.ray.demomall.crud.annotation.Slave)" +
            "&& execution(* com.ccb.ray.demomall.crud.service..*select*(..))" +
            "||execution(* com.ccb.ray.demomall.crud.service..*get*(..))")
    public void readPointCut() {

    }

    @Before("writePointCut()")
    public void write() {
        DBContext.master();
    }

    @Before("readPointCut()")
    public void read() {
        DBContext.slave();

    }

}
