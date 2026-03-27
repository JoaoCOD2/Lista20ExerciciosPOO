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
public abstract class Imovel {
    private String endereco;
    private double preco;
    private double metragem;

    public Imovel(String endereco, double preco, double metragem) {
        this.endereco = endereco;
        this.preco = preco;
        this.metragem = metragem;
    }

    public abstract double calcularImposto();

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getMetragem() {
        return metragem;
    }

    public void setMetragem(double metragem) {
        this.metragem = metragem;
    }
}
