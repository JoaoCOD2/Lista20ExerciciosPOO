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
public class SalaComercial extends Imovel {
    private String tipoNegocio;
    private boolean emShopping;
    private double taxaServico;

    public SalaComercial(String endereco, double preco, double metragem, String tipoNegocio, boolean emShopping, double taxaServico) {
        super(endereco, preco, metragem);
        this.tipoNegocio = tipoNegocio;
        this.emShopping = emShopping;
        this.taxaServico = taxaServico;
    }

    @Override
    public double calcularImposto() {
        double imposto = getPreco() * 0.012;

        if (emShopping) {
            imposto += taxaServico;
        }

        return imposto;
    }
}
