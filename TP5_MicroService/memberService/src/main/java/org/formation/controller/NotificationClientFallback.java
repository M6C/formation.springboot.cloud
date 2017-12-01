package org.formation.controller;

import org.springframework.stereotype.Service;

@Service
public class NotificationClientFallback implements NotificationClient {

    public String sendSimple(Email email) {
        return "Error";
    }

}
