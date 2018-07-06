package com.migu.csdexercise.legacycode.chapter25.u;

public class TestingMessageForwarder extends MessageForwarder {
    protected Message createForwardMesage(Session session, Message message) {
        Message forward = new FakeMessage(message);
        return forward;
    }
}
