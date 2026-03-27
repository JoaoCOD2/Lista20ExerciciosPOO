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
public class Musica extends Midia {
    private String genero;
    private String album;
    private int ano;

    public Musica(String titulo, double duracao, String autor, String genero, String album, int ano) {
        super(titulo, duracao, autor);
        this.genero = genero;
        this.album = album;
        this.ano = ano;
    }

    @Override
    public void reproduzir() {
        System.out.println("🎵 Tocando música: " + getTitulo() + " - " + getAutor());
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}