package com.codigo.feign.Service.Impl;

import com.codigo.feign.Agregates.Constants.Constants;
import com.codigo.feign.Agregates.Request.PersonaRequest;
import com.codigo.feign.Agregates.Response.BaseResponse;
import com.codigo.feign.Agregates.Response.ReniecResponse;
import com.codigo.feign.FeignClient.ReniecClient;
import com.codigo.feign.Repository.PersonaRepository;
import com.codigo.feign.Service.PersonaService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository personaRepository;
    private final ReniecClient reniecClient;

    public PersonaServiceImpl(PersonaRepository personaRepository, ReniecClient reniecClient) {
        this.personaRepository = personaRepository;
        this.reniecClient = reniecClient;
    }

    //recuperando el token
    @Value("${toke.api}")
    private String tokenApi;

    @Override
    public BaseResponse crearPersona(PersonaRequest personaRequest) {

        return null;
    }

    @Override
    public BaseResponse getInfoReniec(String numero) {
        ReniecResponse response = getExecution(numero);
        if (response != null){
            return new BaseResponse(Constants.CODE_SUCCESS, Constants.MESS_SUCCESS, Optional.of(response));
        }else {
            return new BaseResponse(Constants.CODE_ERROR, Constants.MESS_ERROR, Optional.empty());
        }
    }

    private ReniecResponse getExecution(String numero){
        String authorization = "Bearer "+ tokenApi;
        return reniecClient.getInfoReniec(numero,authorization);
    }
}
