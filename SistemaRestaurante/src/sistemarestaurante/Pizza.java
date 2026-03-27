/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarestaurante;

/**
 *
 * @author joaop
 */
public class Pizza extends ItemCardapio {
    private String tamanho;
    private boolean bordaRecheada;
    private int quantidadeSabores;

    public Pizza(String nome, double preco, String descricao, String tamanho, boolean bordaRecheada, int quantidadeSabores) {
        super(nome, preco, descricao);
        this.tamanho = tamanho;
        this.bordaRecheada = bordaRecheada;
        this.quantidadeSabores = quantidadeSabores;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pizza no forno 🍕");
    }

    @Override
    public double calcularPreco() {
        double precoFinal = getPreco();

        if (bordaRecheada) {
            precoFinal += 5;
        }

        return precoFinal;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
