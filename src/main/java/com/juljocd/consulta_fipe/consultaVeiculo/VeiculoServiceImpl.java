package com.juljocd.consulta_fipe.consultaVeiculo;

import com.juljocd.consulta_fipe.consultaFipe.ConsultaFipe;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VeiculoServiceImpl implements VeiculoService {

    @Autowired
    private ConsultaFipe consultaFipe;

    @Autowired
    private VeiculoRepository repository;

    @Override
    public List<Veiculo> listarVeiculos() {
        return repository.findAll();
    }

    @Override
    public void salvarVeiculos(String tipoVeiculo) {
        try {
            List<VeiculoResponse> veiculos = consultaFipe.consultar(tipoVeiculo);
            veiculos.forEach(veiculoResponse -> repository.save(veiculoResponse.toModel()));
        } catch (FeignException e) {
            throw new BusinessException(e.status(), "Tabela de referência inválida");
        }
    }
}
