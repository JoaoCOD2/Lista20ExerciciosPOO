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
public class CartaoCredito extends Pagamento {
    private String numeroCartao;
    private String titular;
    private String bandeira;

    public CartaoCredito(double valor, String data, String descricao, String numeroCartao, String titular, String bandeira) {
        super(valor, data, descricao);
        this.numeroCartao = numeroCartao;
        this.titular = titular;
        this.bandeira = bandeira;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento com Cartão de Crédito");
        System.out.println("Titular: " + titular);
        System.out.println("Valor: R$ " + getValor());
        System.out.println("Descrição: " + getDescricao());
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
}
