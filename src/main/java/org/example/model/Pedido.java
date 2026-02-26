package org.example.model;

public class Pedido {
    protected double valorBruto;
    protected String tipoFrete;
    public Pedido(double valorBruto, String tipoFrete) {
        this.valorBruto = valorBruto;
        this.tipoFrete = tipoFrete;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public String getTipoFrete() {
        return tipoFrete;
    }
}
