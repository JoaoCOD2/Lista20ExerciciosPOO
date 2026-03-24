package projetoproduto;

public class Roupa extends Produto {

    private String tamanho;

    public Roupa(String nome, double preco, String categoria, String tamanho) {
        super(nome, preco, categoria);
        this.tamanho = tamanho;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.05;
    }
}