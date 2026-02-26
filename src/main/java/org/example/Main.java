package org.example;

import org.example.model.Pedido;
import org.example.service.PedidoService;
import org.example.strategy.EstrategiaDeFrete;
import org.example.strategy.FreteGratis;
import org.example.strategy.FretePadrao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Qual o valor da compra?");
        double valorBruto = leia.nextDouble();
        leia.nextLine();

        System.out.print("Qual o tipo do frete?");
        String tipoFrete = leia.nextLine().toUpperCase();

        Pedido pedido = new Pedido(valorBruto, tipoFrete);

        Map<String, EstrategiaDeFrete> mapa = new HashMap<>();
        mapa.put("PADRAO", new FretePadrao());
        mapa.put("GRATIS", new FreteGratis());

        PedidoService service = new PedidoService();

        double total = service.calcularValor(pedido, mapa);

        System.out.print("O valor total com o frete é: " + total);

    }
}