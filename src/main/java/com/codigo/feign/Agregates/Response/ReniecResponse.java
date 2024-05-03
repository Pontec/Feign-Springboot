package com.codigo.feign.Agregates.Response;

import lombok.Getter;
import lombok.Setter;

//Lo que nos va a responder reniec
@Getter
@Setter
public class ReniecResponse {
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String tipoDocumento;
    private String numeroDocumento;
    private String digitoVerificador;
}
