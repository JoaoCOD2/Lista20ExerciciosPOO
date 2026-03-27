/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoformasgeo;

/**
 *
 * @author joaop
 */
public class Quadrado extends Forma {
    private double lado;
    private double perimetro;
    private String tipo;

    public Quadrado(String nome, String cor, double lado) {
        super(nome, cor);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double area = lado * lado;
        setArea(area);
        return area;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
