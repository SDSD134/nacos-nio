package com.saimu.nio.task;

import com.saimu.nio.interceptor.Interceptable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author yanxiaoxia
 * @ClassName BeatTask
 * @CreateDate 2021/10/11 18:09
 **/
public class BeatTask implements Interceptable {

    private static final List<BeatChecker> CHECKERS = new LinkedList<BeatChecker>();

    private Server server;


    public BeatTask(Server server) {
        this.server = server;
    }

    public void sendBeat(Server server) {
        System.out.println("发送心跳包");
    }

    public void processBeat() {
        System.out.println("处理心跳包");
    }

    @Override
    public void beforeIntercept() {
        System.out.println("心跳包发送前执行");

    }

    @Override
    public void afterIntercept() {
        System.out.println("心跳包发送后执行");

    }

    @Override
    public void passIntercept() {
        //检查器查看服务是否可执行
        CHECKERS.forEach(item -> item.doCheck(server));
        System.out.println("不拦截时执行");
    }
}