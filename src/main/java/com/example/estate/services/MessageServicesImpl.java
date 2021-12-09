package com.example.estate.services;

import com.example.estate.domain.Message;
import com.example.estate.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServicesImpl implements MessageServices{

    @Autowired
    MessageRepository messageRepository;
    @Override
    public Message Save(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public List<Message> getAllMessage() {

        return messageRepository.findAll();
    }

    @Override
    public Message FindMessage(long id) {
        return messageRepository.findById(id).get();
    }
}
