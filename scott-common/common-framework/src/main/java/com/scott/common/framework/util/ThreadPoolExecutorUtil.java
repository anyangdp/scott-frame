package com.scott.common.framework.util;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author anyang
 * @CreateTime 2020/1/16
 * @Des 线程池工具类
 */
public class ThreadPoolExecutorUtil {
    public static ThreadPoolExecutor linkBlockingPool = new ThreadPoolExecutor(5, 10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
    /**
     * 无界SynchronousQueue
     */
    public static ThreadPoolExecutor noFairSynchronousPool = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<>());

}
