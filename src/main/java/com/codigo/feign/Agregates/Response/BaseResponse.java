package com.codigo.feign.Agregates.Response;

import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

//Todos nuestros apis responde con esta clase

@Getter
@Setter
public class BaseResponse {

    private int code;
    private String message;
    private Optional data;

}
