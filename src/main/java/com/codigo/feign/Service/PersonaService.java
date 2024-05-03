package com.codigo.feign.Service;

import com.codigo.feign.Agregates.Request.PersonaRequest;
import com.codigo.feign.Agregates.Response.BaseResponse;

public interface PersonaService {

    BaseResponse crearPersona(PersonaRequest personaRequest);

    BaseResponse getInfoReniec(String numero);
}
