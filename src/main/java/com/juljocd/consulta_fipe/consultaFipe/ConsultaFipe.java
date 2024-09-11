package com.juljocd.consulta_fipe.consultaFipe;

import com.juljocd.consulta_fipe.consultaVeiculo.VeiculoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "consultaFipe", url = "https://brasilapi.com.br/api/fipe")
public interface ConsultaFipe {

    @GetMapping("/marcas/v1/{tipoVeiculo}")
    List<VeiculoResponse> consultar(@PathVariable("tipoVeiculo") String tipoVeiculo);
}
