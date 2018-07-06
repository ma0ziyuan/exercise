package com.migu.csdexercise.legacycode.chapter25.u;


import java.io.IOException;

public class MessageForwarder {
    private static final String LOOP_HEADER = "LOOP_HEADER";
    private String[] listAddress;

    private Message createForwardMesage(Session session, Message message) throws MessagingException,IOException {
        MimeMessage forward = new MimeMessage(session);
        forward.setFrom(getFromAddress(message));
        forward.setReplyTo(listAddress);
        forward.addRecipients(Message.RecipientType.TO,listAddress);
        forward.addRecipients(Message.RecipientType.BCC,getMailListAddresses());
        forward.setSubject(transformedSubject(message.getSubject()));
        forward.setSentDate(message.getSentDate());
        forward.addHeader(LOOP_HEADER,listAddress);
        buildForwardContent(message,forward);
        return forward;
    }

    private String transformedSubject(String subject) {
        return subject;
    }

    private String[] getMailListAddresses() {
        return null;
    }

    private void buildForwardContent(Message message, MimeMessage forward) {
    }

    private String getFromAddress(Message message) {
        return "";
    }
}
