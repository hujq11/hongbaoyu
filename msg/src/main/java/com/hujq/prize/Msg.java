package com.hujq.prize;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringCloudApplication
@EnableScheduling
@EnableTransactionManagement
@MapperScan("com.hujq.prize.commons.db.mapper")
public class Msg {
    public static void main(String[] args) {
        SpringApplication.run(Msg.class,args);
    }
}
