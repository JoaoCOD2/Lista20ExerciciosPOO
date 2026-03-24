package projetoproduto;

public class Eletronico extends Produto {

    private int garantiaMeses;

    public Eletronico(String nome, double preco, String categoria, int garantiaMeses) {
        super(nome, preco, categoria);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.15; // 15% imposto
    }
}