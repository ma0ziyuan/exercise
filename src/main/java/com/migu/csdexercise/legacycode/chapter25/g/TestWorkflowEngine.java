package com.migu.csdexercise.legacycode.chapter25.g;

public class TestWorkflowEngine extends WorkflowEngine {

    protected TransactionManager createTransactionManager() {
        return new FakeTransactionManager();
    }

    public TransactionManager getTmInstance() {
        return new FakeTransactionManager();
    }
}
