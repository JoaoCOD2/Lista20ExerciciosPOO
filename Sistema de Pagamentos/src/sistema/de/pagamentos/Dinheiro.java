/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.pagamentos;

/**
 *
 * @author joaop
 */
public class Dinheiro extends Pagamento {
    private double valorRecebido;
    private double troco;
    private String moeda;

    public Dinheiro(double valor, String data, String descricao, double valorRecebido, String moeda) {
        super(valor, data, descricao);
        this.valorRecebido = valorRecebido;
        this.moeda = moeda;
    }

    @Override
    public void processarPagamento() {
        troco = valorRecebido - getValor();

        System.out.println("Pagamento em Dinheiro");
        System.out.println("Valor: R$ " + getValor());
        System.out.println("Valor recebido: R$ " + valorRecebido);
        System.out.println("Troco: R$ " + troco);
    }

    public double getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }
}
