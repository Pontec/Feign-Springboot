package com.codigo.feign.FeignClient;

import com.codigo.feign.Agregates.Response.ReniecResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "reniec-client",url = "https://api.apis.net.pe/v2/reniec/")
public interface ReniecClient {
    //https://api.apis.net.pe/v2/reniec/dni?numero=75878591

    ReniecResponse getInfo(@RequestParam("numero") String numero);ee

}
