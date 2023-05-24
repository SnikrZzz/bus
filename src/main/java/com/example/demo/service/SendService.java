package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendService {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private SendService(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendName(String name) {
        jmsTemplate.convertAndSend("pepito", name);
    }
}
