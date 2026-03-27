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
public class Hamburguer extends ItemCardapio {
    private boolean queijoExtra;
    private boolean bacon;
    private String tipoPao;

    public Hamburguer(String nome, double preco, String descricao, boolean queijoExtra, boolean bacon, String tipoPao) {
        super(nome, preco, descricao);
        this.queijoExtra = queijoExtra;
        this.bacon = bacon;
        this.tipoPao = tipoPao;
    }

    @Override
    public void preparar() {
        System.out.println("Montando hambúrguer 🍔");
    }

    @Override
    public double calcularPreco() {
        double precoFinal = getPreco();

        if (queijoExtra) precoFinal += 2;
        if (bacon) precoFinal += 3;

        return precoFinal;
    }
}
