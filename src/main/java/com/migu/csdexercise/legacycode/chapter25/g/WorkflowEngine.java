package com.migu.csdexercise.legacycode.chapter25.g;


import java.io.Reader;

public class WorkflowEngine {
    private TransactionManager tm;

    public TransactionManager getTm() {
        return tm;
    }

    public TransactionManager getTmInstance() {
        if (tm == null) {
            Reader reader = new ModelReader(AppConfig.getDryConfiguration());
            Persister persister = new XMLStore(AppConfig.getDryConfiguration());
            this.tm = new TransactionManager(reader, persister);

        }
        return tm;
    }

    public WorkflowEngine() {
        Reader reader = new ModelReader(AppConfig.getDryConfiguration());
        Persister persister = new XMLStore(AppConfig.getDryConfiguration());
        this.tm = new TransactionManager(reader, persister);
    }

    /*public WorkflowEngine() {
        this.tm = createTransactionManager();
    }

    protected TransactionManager createTransactionManager() {
        Reader reader = new ModelReader(AppConfig.getDryConfiguration());
        Persister persister = new XMLStore(AppConfig.getDryConfiguration());
        return new TransactionManager(reader, persister);
    }*/
}
