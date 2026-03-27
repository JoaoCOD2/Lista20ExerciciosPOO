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
public class Podcast extends Midia {
    private String tema;
    private int episodio;
    private String plataforma;

    public Podcast(String titulo, double duracao, String autor, String tema, int episodio, String plataforma) {
        super(titulo, duracao, autor);
        this.tema = tema;
        this.episodio = episodio;
        this.plataforma = plataforma;
    }

    @Override
    public void reproduzir() {
        System.out.println("🎙️ Tocando podcast: " + getTitulo() + " (Ep. " + episodio + ")");
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
