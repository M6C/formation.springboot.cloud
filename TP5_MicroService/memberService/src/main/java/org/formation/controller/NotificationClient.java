package org.formation.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "notification-service", fallback = NotificationClientFallback.class)
public interface NotificationClient {

    @RequestMapping(path = "/sendSimple", method = RequestMethod.POST, consumes = "application/json")
    String sendSimple(Email email);

}
