package org.example.strategy;

import org.example.model.Pedido;

public class FretePadrao implements EstrategiaDeFrete{

    @Override
    public double calcularValorFinal(Pedido pedido) {
        return 40;
    }
}
