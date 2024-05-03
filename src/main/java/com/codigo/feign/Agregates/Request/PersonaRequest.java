package com.codigo.feign.Agregates.Request;

import lombok.Getter;
import lombok.Setter;

//Es lo que se va aenviar en el cuerpo (body) de la Api

@Getter
@Setter
public class PersonaRequest {
    private String tipoDoc;
    private String numDoc;
}
