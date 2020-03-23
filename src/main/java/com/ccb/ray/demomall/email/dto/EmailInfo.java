package com.ccb.ray.demomall.email.dto;

import lombok.Data;

/**
 * @author Marie
 * @date 2020/3/23 1:48 PM
 **/
@Data
public class EmailInfo {

    private String from;
    private String to;
    private String subject;
    private String cc;
    private String content;

}
