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
public class Pix extends Pagamento {
    private String chavePix;
    private String banco;
    private String tipoChave;

    public Pix(double valor, String data, String descricao, String chavePix, String banco, String tipoChave) {
        super(valor, data, descricao);
        this.chavePix = chavePix;
        this.banco = banco;
        this.tipoChave = tipoChave;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via PIX");
        System.out.println("Chave: " + chavePix);
        System.out.println("Valor: R$ " + getValor());
        System.out.println("Descrição: " + getDescricao());
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }
}