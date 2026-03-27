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
public class Terreno extends Imovel {
    private boolean rural;
    private String tipoSolo;
    private boolean temEnergia;

    public Terreno(String endereco, double preco, double metragem, boolean rural, String tipoSolo, boolean temEnergia) {
        super(endereco, preco, metragem);
        this.rural = rural;
        this.tipoSolo = tipoSolo;
        this.temEnergia = temEnergia;
    }

    @Override
    public double calcularImposto() {
        if (rural) {
            return getPreco() * 0.005;
        } else {
            return getPreco() * 0.01;
        }
    }
}
