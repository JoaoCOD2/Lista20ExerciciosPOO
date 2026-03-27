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
public class Retangulo extends Forma {
    private double base;
    private double altura;
    private String tipo;

    public Retangulo(String nome, String cor, double base, double altura) {
        super(nome, cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = base * altura;
        setArea(area);
        return area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
