package com.shawn.view;

import cn.hutool.core.net.NetUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@ServletComponentScan
public class ViewApplication {
    private static final Logger logger = LoggerFactory.getLogger(ViewApplication.class);

    public static void main(String[] args) {
        int port = Integer.parseInt(args[0]);
        if (!NetUtil.isUsableLocalPort(port)) {
            logger.error(String.format("端口 %d 已被占用", port));
            System.exit(2);
        }

        new SpringApplicationBuilder(ViewApplication.class).properties("server.port=" + port).run(args);
//        SpringApplication.run(ViewApplication.class,args);
    }
}

