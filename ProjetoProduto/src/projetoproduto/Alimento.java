package projetoproduto;

public class Alimento extends Produto {

    private String validade;

    public Alimento(String nome, double preco, String categoria, String validade) {
        super(nome, preco, categoria);
        this.validade = validade;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco();
    }
}