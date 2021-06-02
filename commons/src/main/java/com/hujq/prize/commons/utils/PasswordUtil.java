package com.hujq.prize.commons.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 密码工具类
 */
public class PasswordUtil {

    private String md5(String inputStr){

        BigInteger bigInteger = null;
        try {
            MessageDigest md =MessageDigest.getInstance("MD5");
            byte[] bytes = inputStr.getBytes();
            md.update(bytes);
            bigInteger = new BigInteger(md.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return bigInteger.toString(16);
    }

    public static String encodePassword(String password){
        return new PasswordUtil().md5(password);
    }

    public static void main(String[] args) {
        System.out.println(PasswordUtil.encodePassword("123456"));
    }
}
