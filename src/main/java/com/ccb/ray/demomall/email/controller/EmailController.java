package com.ccb.ray.demomall.email.controller;

import com.ccb.ray.demomall.email.dto.EmailInfo;
import com.ccb.ray.demomall.email.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Marie
 * @date 2020/3/23 1:14 PM
 **/
@RestController
@RequestMapping("mail")
public class EmailController {
    @Autowired
    private MailService mailService;

    @RequestMapping("send")
    public String sendEmail(@RequestBody EmailInfo info) {

        try {
            mailService.sendSimpleMail(info);
        } catch (Exception e) {
            return "fail";
        }
        return "success";

    }

}
