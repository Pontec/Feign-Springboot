package com.codigo.feign.Service;

import com.codigo.feign.Agregates.Request.EmpresaRequest;
import com.codigo.feign.Agregates.Response.BaseResponse;
import org.springframework.stereotype.Service;

public interface EmpresaService {


    BaseResponse crearEmpresa (EmpresaRequest empresaRequest);

    BaseResponse getInfoSunat(String numero);
}
