package com.juljocd.consulta_fipe.consultaVeiculo;

import feign.FeignException;

public class BusinessException extends FeignException {

    protected BusinessException(int status, String message) {
        super(status, message);
    }
}
