/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoveiculo;

/**
 *
 * @author joaop
 */
public class Veiculo {

    private  String modelo;
    private int ano;
    private String marca;

    public Veiculo(String modelo, int ano, String marca) {
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public void mover() {
        System.out.println("O veículo esta se movendo");
    }
}