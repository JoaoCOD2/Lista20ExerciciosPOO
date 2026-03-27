/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetotransporte;

/**
 *
 * @author joaop
 */
public class Metro extends Transporte {
    private int numeroEstacoes;
    private boolean integracao;
    private String linha;

    public Metro(int capacidade, String empresa, double tarifaBase, int numeroEstacoes, boolean integracao, String linha) {
        super(capacidade, empresa, tarifaBase);
        this.numeroEstacoes = numeroEstacoes;
        this.integracao = integracao;
        this.linha = linha;
    }

    @Override
    public double calcularTarifa(double distancia) {
        return getTarifaBase() + (numeroEstacoes * 0.5);
    }

    public int getNumeroEstacoes() {
        return numeroEstacoes;
    }

    public void setNumeroEstacoes(int numeroEstacoes) {
        this.numeroEstacoes = numeroEstacoes;
    }
}
