package com.shawn.manager;

import cn.hutool.core.net.NetUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableTransactionManagement
public class ManagerApplication {
    private static final Logger logger = LoggerFactory.getLogger(ManagerApplication.class);

    public static void main( String[] args ) {

        int port = Integer.parseInt(args[0]);
        if (!NetUtil.isUsableLocalPort(port)){
            logger.error(String.format("端口 %d 已被占用",port));
            System.exit(2);
        }

        new SpringApplicationBuilder(ManagerApplication.class).properties("server.port="+port)
                .properties("spring.profiles.active="+args[1]).run(args);

    }
}
