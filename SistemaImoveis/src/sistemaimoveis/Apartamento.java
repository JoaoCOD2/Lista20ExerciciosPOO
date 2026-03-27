/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaimoveis;

/**
 *
 * @author joaop
 */
public class Apartamento extends Imovel {
    private int andar;
    private double taxaCondominio;
    private boolean elevador;

    public Apartamento(String endereco, double preco, double metragem, int andar, double taxaCondominio, boolean elevador) {
        super(endereco, preco, metragem);
        this.andar = andar;
        this.taxaCondominio = taxaCondominio;
        this.elevador = elevador;
    }

    @Override
    public double calcularImposto() {
        return getPreco() * 0.008 + taxaCondominio;
    }
}
