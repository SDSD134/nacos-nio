package com.saimu.nio.interceptor;

import com.saimu.nio.task.BeatTask;

/**
 * 用于心跳拦截的拦截器
 * @author yanxiaoxia
 * @ClassName InterceptImpl
 * @CreateDate 2021/10/11 17:54
 **/
public abstract class AbstractBeatInterceptor implements Interceptor<BeatTask> {

    @Override
    public boolean isInterceptType(Class<?> type) {
        //确定此Class对象表示的类或接口是否与指定的Class参数表示的类或接口相同，或者是其超类或超接口
        return BeatTask.class.isAssignableFrom(type);
    }

}