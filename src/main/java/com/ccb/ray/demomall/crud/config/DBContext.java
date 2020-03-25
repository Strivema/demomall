package com.ccb.ray.demomall.crud.config;

import com.ccb.ray.demomall.enums.DBTypeEnum;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Marie
 * @date 2020/3/25 9:32 PM
 **/
@Slf4j
public class DBContext {
    private static final ThreadLocal<DBTypeEnum> dbContext = new ThreadLocal<>();

    private static final AtomicInteger counter = new AtomicInteger(-1);

    public static void set(DBTypeEnum dbTypeEnum) {
        dbContext.set(dbTypeEnum);
    }

    public static DBTypeEnum get() {
        return dbContext.get();
    }

    public static void master() {
        set(DBTypeEnum.MASTER);
        log.info("切换到master库");
    }

    public static void slave() {
        //  读库负载均衡(轮询方式)
        int index = counter.getAndIncrement() % 2;
        log.info("slave库访问线程数==>{}", counter.get());
        if (0 == index) {
            set(DBTypeEnum.SLAVE1);
            log.info("切换到slave1库");
        }else {
            set(DBTypeEnum.SLAVE2);
            log.info("切换到slave2库");
        }

    }


}
