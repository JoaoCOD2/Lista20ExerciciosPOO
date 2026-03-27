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
public class Casa extends Imovel {
    private int quartos;
    private boolean temPiscina;
    private int vagasGaragem;

    public Casa(String endereco, double preco, double metragem, int quartos, boolean temPiscina, int vagasGaragem) {
        super(endereco, preco, metragem);
        this.quartos = quartos;
        this.temPiscina = temPiscina;
        this.vagasGaragem = vagasGaragem;
    }

    Casa(String rua_A, int i, int i0, int i1, boolean b, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularImposto() {
        double imposto = getPreco() * 0.01;

        if (temPiscina) {
            imposto += 500;
        }

        return imposto;
    }
}
