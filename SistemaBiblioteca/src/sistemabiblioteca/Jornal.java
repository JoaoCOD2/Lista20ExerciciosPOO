/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabiblioteca;

/**
 *
 * @author joaop
 */
public class Jornal extends ItemBiblioteca {
    private String dataPublicacao;
    private String cidade;
    private String tipo;

    public Jornal(String titulo, String codigo, boolean disponivel, String dataPublicacao, String cidade, String tipo) {
        super(titulo, codigo, disponivel);
        this.dataPublicacao = dataPublicacao;
        this.cidade = cidade;
        this.tipo = tipo;
    }

    @Override
    public void emprestar() {
        System.out.println("Jornais não podem ser emprestados ❌");
    }
}
