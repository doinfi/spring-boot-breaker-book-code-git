package com.jack.ch7_6.web;

import com.jack.ch7_6.domain.JackMessage;
import com.jack.ch7_6.domain.JackResponse;
import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

/**
 * @author yangyueming
 */
@Controller
public class WsController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;//1

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public JackResponse say(JackMessage message) throws Exception {
        Thread.sleep(3000);
        return new JackResponse("Welcome, " + message.getName() + "!");
    }

    @MessageMapping("/chat")
    public void handleChat(Principal principal, String msg) { //2
        if (principal.getName().equals("wyf")) {//3
            messagingTemplate.convertAndSendToUser("jack",
                "/queue/notifications", principal.getName() + "-send:"
                    + msg);
        } else {
            messagingTemplate.convertAndSendToUser("wyf",
                "/queue/notifications", principal.getName() + "-send:"
                    + msg);
        }
    }
}