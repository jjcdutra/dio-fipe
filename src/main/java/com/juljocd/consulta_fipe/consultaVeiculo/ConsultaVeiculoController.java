package com.juljocd.consulta_fipe.consultaVeiculo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/marcas")
public class ConsultaVeiculoController {

    @Autowired
    private VeiculoServiceImpl veiculoService;

    @GetMapping("/{tipoVeiculo}")
    public void criar(@PathVariable String tipoVeiculo) {
        veiculoService.salvarVeiculos(tipoVeiculo);
        ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Veiculo>> listar() {
        return ResponseEntity.ok(veiculoService.listarVeiculos());
    }
}
