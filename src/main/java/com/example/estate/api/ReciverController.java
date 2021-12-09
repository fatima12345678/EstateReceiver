package com.example.estate.api;

import com.example.estate.domain.EstateModel;
import com.example.estate.domain.Message;
import com.example.estate.domain.Tracing;
import com.example.estate.services.MessageServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller @Slf4j
public class ReciverController {


    @Autowired
    MessageServices services;
    @RabbitListener(queues = {"${queue.name}"})
    public void Reciver(@Payload Message message){
        log.info("recive message");
        services.Save(message);
    }
    @GetMapping(value = "/reciver")
    public String ReciverPage( Model model){

        model.addAttribute("messages",services.getAllMessage());
        return "Reciver/reciver";
    }
    @GetMapping(value = "/show/message/{id}")
    public String showemessage(Model model ,@PathVariable("id") Long id){
        Message message=services.FindMessage(id);
        model.addAttribute("message",message);


        return "Reciver/show";
    }


}
