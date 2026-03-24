package projetoproduto;

public class ProjetoProduto {

    public static void main(String[] args) {

        Produto[] produtos = {
            new Livro("Java Básico", 100, "Livro", "João Silva"),
            new Eletronico("Notebook", 3000, "Eletrônico", 12),
            new Roupa("Camiseta", 80, "Roupa", "M"),
            new Alimento("Chocolate", 10, "Alimento", "10/12/2026")
        };

        for (Produto p : produtos) {
            System.out.println(p.getNome() + " - Preço final: R$" + p.calcularPrecoFinal());
        }
    }
}