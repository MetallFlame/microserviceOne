package com.akriskovets.microservice.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageDTO {

    private Long id;

    private String text;

    private String header;

}
