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
public class Audiolivro extends Midia {
    private String narrador;
    private int capitulos;
    private String genero;

    public Audiolivro(String titulo, double duracao, String autor, String narrador, int capitulos, String genero) {
        super(titulo, duracao, autor);
        this.narrador = narrador;
        this.capitulos = capitulos;
        this.genero = genero;
    }

    @Override
    public void reproduzir() {
        System.out.println("📖 Reproduzindo audiolivro: " + getTitulo());
    }

    public String getNarrador() {
        return narrador;
    }

    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }
}
