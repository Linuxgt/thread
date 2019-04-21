package com.linuxgt.demo.thread;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by liuteng on 2019/4/21
 */
@RestController
public class TestController {

    private final ThreadPoolExecutor threadPoolExecutor;

    @Autowired
    public TestController(ThreadPoolExecutor threadPoolExecutor) {
        this.threadPoolExecutor = threadPoolExecutor;
    }

    @RequestMapping("/test")
    public void startTestThread() {
        this.threadPoolExecutor.submit(new ThreadTest("test1"));
        this.threadPoolExecutor.submit(new ThreadTest("test2"));
        this.threadPoolExecutor.submit(new ThreadTest("test3"));
    }
}
