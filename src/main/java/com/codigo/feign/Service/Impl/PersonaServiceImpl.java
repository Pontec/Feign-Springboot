package com.codigo.feign.Service.Impl;

import com.codigo.feign.Agregates.Request.PersonaRequest;
import com.codigo.feign.Agregates.Response.BaseResponse;
import com.codigo.feign.Repository.PersonaRepository;
import com.codigo.feign.Service.PersonaService;

public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository personaRepository;

    public PersonaServiceImpl(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @Override
    public BaseResponse crearPersona(PersonaRequest personaRequest) {
        return null;
    }

    @Override
    public BaseResponse getInfoReniec(String numero) {
        return null;
    }
}
