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
public abstract class ItemBiblioteca {
    private String titulo;
    private String codigo;
    private boolean disponivel;

    public ItemBiblioteca(String titulo, String codigo, boolean disponivel) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.disponivel = disponivel;
    }

    public abstract void emprestar();

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println(titulo + " foi devolvido com sucesso.");
        } else {
            System.out.println(titulo + " já está disponível.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}