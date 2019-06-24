package com.alephreach.burst;

import android.os.Handler;
import android.os.Looper;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AppExecutors {

    private static final int THREAD_POOL = 3;

    private final ExecutorService service = Executors.newFixedThreadPool(THREAD_POOL);

    public void execute (Runnable runnable) {
        service.execute(runnable);
    }

    public Future<?> submit(Callable callable) {
        return service.submit(callable);
    }
}
