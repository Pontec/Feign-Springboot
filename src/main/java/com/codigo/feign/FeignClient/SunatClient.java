package com.codigo.feign.FeignClient;

import com.codigo.feign.Agregates.Response.SunatResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "sunat-client", url = "https://api.apis.net.pe/v2/sunat/")
public interface SunatClient {
    //https://api.apis.net.pe/v2/sunat/ruc?numero=20530644261

    @GetMapping("/ruc")

    SunatResponse getInfoSunat(@RequestParam("numero") String numero,
                          @RequestHeader("Authorization") String token);

}
