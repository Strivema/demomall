package com.ccb.ray.demomall.encoder;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marie
 * @date 2020/3/22 10:13 PM
 **/
@Slf4j
public class IPasswordEncoderFactories {
    public static void main(String[] args) {
        PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        String password = "123456";
        String encode1 = passwordEncoder.encode(password);
        String encode2 = passwordEncoder.encode(password);

        log.info("明文:{},密文:{}", password, encode1);
        log.info("是否匹配:{}", passwordEncoder.matches(password, encode1));
        log.info("是否匹配:{}", passwordEncoder.matches(password, encode2));

        String[] encodes = {"bcrypt", "ldap", "MD4", "MD5", "noop", "pbkdf2", "scrypt", "SHA-1", "SHA-256", "sha256"};

        List<String> encodeList = new ArrayList();
        for (String encode : encodes) {
            passwordEncoder = newPasswordEncoder(encode);
            String encodeStr = passwordEncoder.encode(password);
            encodeList.add(encodeStr);
            log.info("{}算法,明文==>{},密文==>{}", encode, password, encodeStr);
            log.info("密文和明文匹配 :{}", passwordEncoder.matches(password, encodeStr));
        }


    }

    public static PasswordEncoder newPasswordEncoder(final String encoderType) {

        switch (encoderType) {
            case "bcrypt":
                return new BCryptPasswordEncoder();
            case "ldap":
                return new org.springframework.security.crypto.password.LdapShaPasswordEncoder();
            case "MD4":
                return new org.springframework.security.crypto.password.Md4PasswordEncoder();
            case "MD5":
                return new org.springframework.security.crypto.password.MessageDigestPasswordEncoder("MD5");
            case "noop":
                return org.springframework.security.crypto.password.NoOpPasswordEncoder.getInstance();
            case "pbkdf2":
                return new Pbkdf2PasswordEncoder();
            case "scrypt":
                return new SCryptPasswordEncoder();
            case "SHA-1":
                return new org.springframework.security.crypto.password.MessageDigestPasswordEncoder("SHA-1");
            case "SHA-256":
                return new org.springframework.security.crypto.password.MessageDigestPasswordEncoder("SHA-256");
            case "sha256":
                return new org.springframework.security.crypto.password.StandardPasswordEncoder();
            default:
                return NoOpPasswordEncoder.getInstance();
        }
    }

}
