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
public class Revista extends ItemBiblioteca {
    private int edicao;
    private String tema;
    private String editora;

    public Revista(String titulo, String codigo, boolean disponivel, int edicao, String tema, String editora) {
        super(titulo, codigo, disponivel);
        this.edicao = edicao;
        this.tema = tema;
        this.editora = editora;
    }

    Revista(String tech_News, String string, boolean b, int i, String tecnologia, String editora_Y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void emprestar() {
        if (isDisponivel()) {
            setDisponivel(false);
            System.out.println("Revista emprestada 📰: " + getTitulo());
        } else {
            System.out.println("Revista indisponível.");
        }
    }
}
