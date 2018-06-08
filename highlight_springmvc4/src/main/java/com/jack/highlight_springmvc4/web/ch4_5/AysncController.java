package com.jack.highlight_springmvc4.web.ch4_5;

import com.jack.highlight_springmvc4.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

@RestController
public class AysncController {

    @Autowired
    PushService pushService; //1

    @RequestMapping("/defer")
    public DeferredResult<String> deferredCall() { //2
        return pushService.getAsyncUpdate();
    }

}

