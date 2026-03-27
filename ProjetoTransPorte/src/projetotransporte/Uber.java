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
public class Uber extends Transporte {
    private double precoPorKm;
    private double taxaDinamica;
    private String categoria;

    public Uber(int capacidade, String empresa, double tarifaBase, double precoPorKm, double taxaDinamica, String categoria) {
        super(capacidade, empresa, tarifaBase);
        this.precoPorKm = precoPorKm;
        this.taxaDinamica = taxaDinamica;
        this.categoria = categoria;
    }

    @Override
    public double calcularTarifa(double distancia) {
        return (getTarifaBase() + (distancia * precoPorKm)) * taxaDinamica;
    }

    public double getTaxaDinamica() {
        return taxaDinamica;
    }

    public void setTaxaDinamica(double taxaDinamica) {
        this.taxaDinamica = taxaDinamica;
    }
}
