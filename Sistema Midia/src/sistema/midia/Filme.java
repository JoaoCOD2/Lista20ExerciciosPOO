/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.midia;

/**
 *
 * @author joaop
 */
public class Filme extends Midia {
    private String diretor;
    private String classificacao;
    private int ano;

    public Filme(String titulo, double duracao, String autor, String diretor, String classificacao, int ano) {
        super(titulo, duracao, autor);
        this.diretor = diretor;
        this.classificacao = classificacao;
        this.ano = ano;
    }

    @Override
    public void reproduzir() {
        System.out.println("🎬 Reproduzindo filme: " + getTitulo());
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}