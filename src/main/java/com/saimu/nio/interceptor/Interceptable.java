package com.saimu.nio.interceptor;

/**
 * 实现此接口该类就可被拦截
 * @author yanxiaoxia
 * @ClassName Interceptable
 * @CreateDate 2021/10/11 17:09
 **/
public interface Interceptable {

    /**
     * 拦截前此方法会调用
     */
     void beforeIntercept();

    /**
     * 拦截后此方法不会调用
     */
    void afterIntercept();

    /**
     * 若没有拦截器拦截此对象，此方法会被调用
     */
    void passIntercept();





}