package com.saimu.nio.task;

import com.saimu.nio.interceptor.Interceptable;

/**
 * @author yanxiaoxia
 * @ClassName BeatTask
 * @CreateDate 2021/10/11 18:09
 **/
public class BeatTask implements Interceptable {
    public void beforeIntercept() {
        System.out.println("心跳包发送前执行");

    }

    public void afterIntercept() {
        System.out.println("心跳包发送后执行");

    }

    public void passIntercept() {
        System.out.println("不拦截时执行");
    }
}