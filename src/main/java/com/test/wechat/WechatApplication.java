package com.test.wechat;

import com.mxixm.fastboot.weixin.annotation.WxApplication;
import com.mxixm.fastboot.weixin.annotation.WxController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;


@WxApplication
@Slf4j
public class WechatApplication {

    public static void main(String[] args) throws UnknownHostException {
        ApplicationContext applicationContext = SpringApplication.run(WechatApplication.class, args);
        Environment env = applicationContext.getEnvironment();
        log.info("\n----------------------------------------------------------\n" +
                        "    Application '{}' is running! Access URLs:\n" +
                        "    Local:       http://127.0.0.1:{}\n" +
                        "    External:    http://{}:{}" +
                        "\n----------------------------------------------------------",
                env.getProperty("spring.application.name"),
                env.getProperty("server.port"),
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port"));
    }

}

