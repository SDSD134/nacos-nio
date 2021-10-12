package com.saimu.nio.interceptor;

/**
 * @author yanxiaoxia
 * @ClassName Interceptor
 * @CreateDate 2021/10/11 17:18
 **/
public interface Interceptor<T extends Interceptable> {
    /**
     * 判断是否需要拦截
     * @param type
     * @return
     */
    boolean isInterceptType(Class<?> type);

    /**
     * 执行拦截
     * @param Object
     */
    void intercept(T Object);
}