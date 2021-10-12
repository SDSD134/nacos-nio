package com.saimu.nio.interceptor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author yanxiaoxia
 * @ClassName BeatInterceptorChain
 * @CreateDate 2021/10/11 18:19
 **/
public class BeatInterceptorChain implements  InterceptorChain{
    public List<AbstractBeatInterceptor> abstractBeatInterceptorList = new LinkedList<AbstractBeatInterceptor>();


    @Override
    public void addInterceptor(Interceptor interceptor) {

    }

    @Override
    public void doInterceptor(Interceptable object) {

    }
}