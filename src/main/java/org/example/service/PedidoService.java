package org.example.service;

import org.example.model.Pedido;
import org.example.strategy.EstrategiaDeFrete;

import java.util.Map;

public class PedidoService {

    public double calcularValor(Pedido pedido, Map<String, EstrategiaDeFrete> mapa){

        EstrategiaDeFrete estrategia = mapa.get(pedido.getTipoFrete());
        double valorFrete = estrategia.calcularValorFinal(pedido);

        return pedido.getValorBruto() + valorFrete;
    }
}
