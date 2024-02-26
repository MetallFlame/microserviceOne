package com.akriskovets.microservice.controller;

import com.akriskovets.microservice.service.MessageService;
import com.akriskovets.microservice.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MainController {

    private final MessageService messageService;

    private final UserService userService;

    public MainController(MessageService messageService,
                          UserService userService) {
        this.messageService = messageService;
        this.userService = userService;
    }

    @GetMapping("/message/send/{messageId}")
    public String sendMessage(@PathVariable Long messageId) {
        messageService.sendMessage(messageId);
        return "message delivered";
    }

    @GetMapping("/user/get/{userId}")
    public String getUser(@PathVariable Long userId) {
        return userService.getUser(userId).toString();
    }
}