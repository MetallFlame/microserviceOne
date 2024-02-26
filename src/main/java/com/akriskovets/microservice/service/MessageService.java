package com.akriskovets.microservice.service;

import com.akriskovets.microservice.DTO.MessageDTO;
import com.akriskovets.microservice.entity.Message;
import com.akriskovets.microservice.mapper.MessageMapper;
import com.akriskovets.microservice.repository.MessageRepository;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MessageService {
    private final MessageRepository messageRepository;

    private final MessageMapper messageMapper;

    private final KafkaTemplate<String, String> template;

    private final String MESSAGE_DELIVERED = "Message delivered!";

    private final String MESSAGE_NOT_FOUND = "Message not found!";

    public MessageService(MessageRepository messageRepository,
                          MessageMapper messageMapper,
                          KafkaTemplate<String, String> template) {
        this.messageRepository = messageRepository;
        this.messageMapper = messageMapper;
        this.template = template;
    }

    public String sendMessage(Long messageId) {
        Optional<Message> messageFromDB = messageRepository.findById(messageId);
        if (messageFromDB.isPresent()) {
            template.send("messages", messageFromDB.get().getText());
            return MESSAGE_DELIVERED;
        } else {
            return MESSAGE_NOT_FOUND;
        }
    }
}
