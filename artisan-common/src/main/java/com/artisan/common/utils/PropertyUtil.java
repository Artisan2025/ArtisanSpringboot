package com.artisan.common.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @description 获取配置文件信息
 * @author puxianfeng
 * @date 2020/8/4 10:38 上午
 */
public class PropertyUtil {

    public static Properties getConfig(String name) {
        Properties props = new Properties();
        try (InputStream in = PropertyUtil.class.getClassLoader().getResourceAsStream(name)) {
            assert in != null;
            props.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return props;
    }
}
