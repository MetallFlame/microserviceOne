package com.akriskovets.microservice.mapper;

import com.akriskovets.microservice.DTO.MessageDTO;
import com.akriskovets.microservice.DTO.UserDTO;
import com.akriskovets.microservice.entity.Message;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class MessageMapper {
    private final ModelMapper mapper;

    public MessageMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }

    public Message toEntity(MessageDTO dto) {
        return Objects.isNull(dto) ? null : mapper.map(dto, Message.class);
    }

    public MessageDTO toDto(Message entity) {
        return Objects.isNull(entity) ? null : mapper.map(entity, MessageDTO.class);
    }
}
