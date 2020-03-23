package com.ccb.ray.demomall.email.service.impl;

import com.ccb.ray.demomall.email.dto.EmailInfo;
import com.ccb.ray.demomall.email.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * @author Marie
 * @date 2020/3/22 10:51 PM
 **/
@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void sendSimpleMail(EmailInfo info) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(info.getFrom());
        message.setTo(info.getTo());
        message.setSubject(info.getSubject());
        message.setText(info.getContent());
        message.setCc(info.getCc());
        javaMailSender.send(message);


    }
}
