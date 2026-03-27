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
public class Onibus extends Transporte {
    private int numeroLinha;
    private String tipo;
    private boolean arCondicionado;

    public Onibus(int capacidade, String empresa, double tarifaBase, int numeroLinha, String tipo, boolean arCondicionado) {
        super(capacidade, empresa, tarifaBase);
        this.numeroLinha = numeroLinha;
        this.tipo = tipo;
        this.arCondicionado = arCondicionado;
    }

    @Override
    public double calcularTarifa(double distancia) {
        return getTarifaBase(); // valor fixo
    }

    public int getNumeroLinha() {
        return numeroLinha;
    }

    public void setNumeroLinha(int numeroLinha) {
        this.numeroLinha = numeroLinha;
    }
}