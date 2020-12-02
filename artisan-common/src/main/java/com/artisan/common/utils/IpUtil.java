package com.artisan.common.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @description 获取IP
 * @author puxianfeng
 * @date
 */
public class IpUtil {

    public static String getIp() {
        String address = "";
        try {
            address = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        return address;
    }
}
