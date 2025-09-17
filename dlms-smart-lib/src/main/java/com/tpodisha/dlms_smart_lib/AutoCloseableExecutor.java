package com.tpodisha.dlms_smart_lib;

import java.util.concurrent.ExecutorService;

public class AutoCloseableExecutor implements AutoCloseable {
    private final ExecutorService executor;

    AutoCloseableExecutor(ExecutorService executor) {
        this.executor = executor;
    }

    public ExecutorService getExecutor() {
        return executor;
    }

    @Override
    public void close() {
        executor.shutdown();
    }
}
