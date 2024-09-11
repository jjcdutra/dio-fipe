package com.juljocd.consulta_fipe.consultaVeiculo;

import java.util.List;

public interface VeiculoService {

    List<Veiculo> listarVeiculos();

    void salvarVeiculos(String tipoVeiculo);
}
