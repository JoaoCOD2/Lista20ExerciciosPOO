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
public class Boleto extends Pagamento {
    private String codigoBarras;
    private String dataVencimento;
    private String banco;

    public Boleto(double valor, String data, String descricao, String codigoBarras, String dataVencimento, String banco) {
        super(valor, data, descricao);
        this.codigoBarras = codigoBarras;
        this.dataVencimento = dataVencimento;
        this.banco = banco;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Boleto");
        System.out.println("Código de barras: " + codigoBarras);
        System.out.println("Valor: R$ " + getValor());
        System.out.println("Descrição: " + getDescricao());
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
}
