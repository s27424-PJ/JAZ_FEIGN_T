package org.example.schroniskozwierzat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final MessegeClient messegeClient;
@Autowired
    public MessageService(MessegeClient messegeClient) {
        this.messegeClient = messegeClient;
    }

    public String testReq() {
        String response = messegeClient.test();
        if ("test".equals(response)) {
            return "test" + response;
        } else {
            return "Błąd";
        }
    }

}