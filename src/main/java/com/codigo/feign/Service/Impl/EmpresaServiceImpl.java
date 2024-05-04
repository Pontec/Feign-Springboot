package com.codigo.feign.Service.Impl;

import com.codigo.feign.Agregates.Constants.Constants;
import com.codigo.feign.Agregates.Request.EmpresaRequest;
import com.codigo.feign.Agregates.Response.BaseResponse;
import com.codigo.feign.Agregates.Response.ReniecResponse;
import com.codigo.feign.Agregates.Response.SunatResponse;
import com.codigo.feign.FeignClient.SunatClient;
import com.codigo.feign.Repository.EmpresaRepository;
import com.codigo.feign.Service.EmpresaService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpresaServiceImpl implements EmpresaService {

    private final EmpresaRepository empresaRepository;
    private final SunatClient sunatClient;

    public EmpresaServiceImpl(EmpresaRepository empresaRepository, SunatClient sunatClient) {
        this.empresaRepository = empresaRepository;
        this.sunatClient = sunatClient;
    }

    //recuperando el token
    @Value("${toke.api}")
    private String tokenApi;


    @Override
    public BaseResponse crearEmpresa(EmpresaRequest empresaRequest) {
        return null;
    }

    @Override
    public BaseResponse getInfoSunat(String numero) {
        SunatResponse response = getExecution(numero);
        if (response != null){
            return new BaseResponse(Constants.CODE_SUCCESS, Constants.MESS_SUCCESS, Optional.of(response));
        }else {
            return new BaseResponse(Constants.CODE_ERROR, Constants.MESS_ERROR,Optional.empty());
        }

    }

    private SunatResponse getExecution(String numero){
        String authorization = "Bearer "+ tokenApi;
        return sunatClient.getInfoSunat(numero,authorization);
    }
}
