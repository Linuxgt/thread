package com.linuxgt.demo.thread;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by liuteng on 2019/4/21
 */
@Configuration
public class ThreadConfig {

    @Bean
    public ThreadPoolExecutor threadPoolExecutor() {
        return new ThreadPoolExecutor(5, 20, 180, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));
    }
}
