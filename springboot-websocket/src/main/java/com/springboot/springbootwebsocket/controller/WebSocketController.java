package com.springboot.springbootwebsocket.controller;

import com.springboot.springbootwebsocket.config.WebSocketServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@Controller
@RestController
public class WebSocketController {

    @RequestMapping("/socket")
    public String openServer(){
        return "server";
    }

    /**
     * 推送数据
     * @param say
     * @return
     */
    @RequestMapping("/socket/push")
    public String pushMsg(@RequestParam("say") String say) {
        try {
            WebSocketServer.sendInfo("服务器推送消息"+say);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "server";
    }
}

//@RestController
//@RequestMapping("/socket")
//public class WebSocketController {
//
//    //推送数据接口
//     @RequestMapping("/push")
//    public String pushMsg(String message) {
//        try {
//            WebSocketServer.sendInfo(message);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return "server";
//    }
//}
