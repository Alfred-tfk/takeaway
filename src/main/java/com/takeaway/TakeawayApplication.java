package com.takeaway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j // 日志
@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement //事务处理
@EnableCaching //开启redis注解缓存功能
public class TakeawayApplication {
    public static void main(String[] args) {
        SpringApplication.run(TakeawayApplication.class,args);
        log.info("项目启动成功");
    }
}
