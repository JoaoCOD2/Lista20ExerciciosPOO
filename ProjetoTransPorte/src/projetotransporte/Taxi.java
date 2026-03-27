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
public class Taxi extends Transporte {
    private double precoPorKm;
    private String bandeira;
    private String motorista;

    public Taxi(int capacidade, String empresa, double tarifaBase, double precoPorKm, String bandeira, String motorista) {
        super(capacidade, empresa, tarifaBase);
        this.precoPorKm = precoPorKm;
        this.bandeira = bandeira;
        this.motorista = motorista;
    }

    @Override
    public double calcularTarifa(double distancia) {
        return getTarifaBase() + (distancia * precoPorKm);
    }

    public double getPrecoPorKm() {
        return precoPorKm;
    }

    public void setPrecoPorKm(double precoPorKm) {
        this.precoPorKm = precoPorKm;
    }
}
