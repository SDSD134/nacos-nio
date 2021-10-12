package com.saimu.nio.interceptor;

/**
 * @author yanxiaoxia
 * @ClassName InterceptorChain
 * @CreateDate 2021/10/11 17:24
 **/
public interface  InterceptorChain<T extends Interceptor> {

    /**
     * 添加拦截器
     * @param interceptor
     */
    void addInterceptor(Interceptor interceptor);

    /**
     * 执行拦截
     * @param object
     */
    void doInterceptor(T object);

}