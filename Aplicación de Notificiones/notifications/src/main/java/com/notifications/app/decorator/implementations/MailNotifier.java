package com.notifications.app.decorator.implementations;

import com.notifications.app.decorator.BaseNotifier;

public class MailNotifier extends BaseNotifier {

    public MailNotifier() {
    }

    public MailNotifier(BaseNotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        sendNotifier(message);
        System.out.println("Hello from MailNotifier " + message);
    }
}
