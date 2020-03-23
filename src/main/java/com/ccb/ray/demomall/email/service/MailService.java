package com.ccb.ray.demomall.email.service;

import com.ccb.ray.demomall.email.dto.EmailInfo;

public interface MailService {
    /**
     * 发送文本邮件
     *
     * @param to      收件人地址
     * @param subject 邮件主题
     * @param content 邮件内容
     * @param cc      抄送地址
     */
    void sendSimpleMail(EmailInfo info);
}
