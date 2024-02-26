package com.akriskovets.microservice.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDTO {

    private Long id;

    private String name;

    private String phone;

}
