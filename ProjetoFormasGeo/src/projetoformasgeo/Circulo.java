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
public class Circulo extends Forma {
    private double raio;
    private double diametro;
    private String tipo;

    public Circulo(String nome, String cor, double raio) {
        super(nome, cor);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double area = Math.PI * raio * raio;
        setArea(area);
        return area;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
