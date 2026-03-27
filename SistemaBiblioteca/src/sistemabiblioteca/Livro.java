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
public class Livro extends ItemBiblioteca {
    private String autor;
    private int paginas;
    private String genero;

    public Livro(String titulo, String codigo, boolean disponivel, String autor, int paginas, String genero) {
        super(titulo, codigo, disponivel);
        this.autor = autor;
        this.paginas = paginas;
        this.genero = genero;
    }

    Livro(String java_Básico, String string, boolean b, String autor_X, int i, String educação) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void emprestar() {
        if (isDisponivel()) {
            setDisponivel(false);
            System.out.println("Livro emprestado 📖: " + getTitulo());
        } else {
            System.out.println("Livro indisponível.");
        }
    }
}
