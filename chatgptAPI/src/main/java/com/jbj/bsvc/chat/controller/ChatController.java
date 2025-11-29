package com.jbj.bsvc.chat.controller;

import org.springframework.web.bind.annotation.*;

import com.jbj.bsvc.chat.service.ChatService;

import java.util.Map;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    private final ChatService chatService;
    public ChatController(ChatService chatService){ this.chatService = chatService; }

    @PostMapping("/{sessionId}")
    //public Map<String,Object> chat(@PathVariable("sessionId")  String sessionId, @RequestBody String message){
    public Map<String,Object> chat(@PathVariable  String sessionId, @RequestBody String message){
        return chatService.sendMessage(sessionId, message);
    }

    @PostMapping("/lastAnswer")
    public Map<String,Object> lastAnswer(@RequestBody Map<String,String> payload){
        String sessionId = payload.get("sessionId");
        String question = payload.get("lastQuestion");
        String answer = payload.get("lastAiAnswer");
        return chatService.sendLastAnswer(sessionId, question, answer);
    }
}