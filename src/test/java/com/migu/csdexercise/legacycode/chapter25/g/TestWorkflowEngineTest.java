package com.migu.csdexercise.legacycode.chapter25.g;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class TestWorkflowEngineTest {

    @Before
    public void setUp() throws Exception {
    }

    public void tearDown() throws Exception {
    }

    @Test
    public void createTransactionManager() {
        TestWorkflowEngine testWorkflowEngine = new TestWorkflowEngine();
        testWorkflowEngine.createTransactionManager();
        assertNotNull(testWorkflowEngine.getTm());
        assertNotNull(testWorkflowEngine.getTmInstance());
    }
}