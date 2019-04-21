package com.linuxgt.demo.thread;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by liuteng on 2019/4/21
 */
@Slf4j
@Data
@AllArgsConstructor
public class ThreadTest implements Runnable {

    private String name;

    @Override
    public void run() {
        log.debug("I'm a thread , my name is {}", null == this.name ? this.getClass().getSimpleName() : this.name);
    }
}
