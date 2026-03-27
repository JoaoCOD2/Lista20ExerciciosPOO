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
public class DVD extends ItemBiblioteca {
    private String genero;
    private int duracao;
    private String classificacao;

    public DVD(String titulo, String codigo, boolean disponivel, String genero, int duracao, String classificacao) {
        super(titulo, codigo, disponivel);
        this.genero = genero;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }

    @Override
    public void emprestar() {
        if (isDisponivel()) {
            setDisponivel(false);
            System.out.println("DVD emprestado 🎬: " + getTitulo());
        } else {
            System.out.println("DVD indisponível.");
        }
    }
}
