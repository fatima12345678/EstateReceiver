package com.example.estate.services;

import com.example.estate.domain.Message;

import java.util.List;

public interface MessageServices {
    Message Save(Message message);
    List<Message>getAllMessage();
    Message FindMessage(long id);
}
