package com.codigo.feign.Agregates.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

//Todos nuestros apis responde con esta clase

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse {

    private int code;
    private String message;
    private Optional data;

}
