package projetoproduto;

public class Livro extends Produto {

    private String autor;

    public Livro(String nome, double preco, String categoria, String autor) {
        super(nome, preco, categoria);
        this.autor = autor;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.9; // 10% desconto
    }
}