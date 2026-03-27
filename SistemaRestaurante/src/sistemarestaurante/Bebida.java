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
public class Bebida extends ItemCardapio {
    private String tamanho;
    private boolean gelada;
    private boolean comGelo;

    public Bebida(String nome, double preco, String descricao, String tamanho, boolean gelada, boolean comGelo) {
        super(nome, preco, descricao);
        this.tamanho = tamanho;
        this.gelada = gelada;
        this.comGelo = comGelo;
    }

    @Override
    public void preparar() {
        System.out.println("Servindo bebida 🥤");
    }

    @Override
    public double calcularPreco() {
        double precoFinal = getPreco();

        if (tamanho.equalsIgnoreCase("grande")) {
            precoFinal += 2;
        }

        return precoFinal;
    }
}
