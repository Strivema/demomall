package com.ccb.ray.demomall.crud.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author Marie
 * @date 2020/3/25 9:30 PM
 **/
public class RoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DBContext.get();
    }
}
