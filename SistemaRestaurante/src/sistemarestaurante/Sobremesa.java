/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarestaurante;

/**
 *
 * @author joaop
 */
public class Sobremesa extends ItemCardapio {
    private boolean cobertura;
    private boolean sorvete;
    private String tipo;

    public Sobremesa(String nome, double preco, String descricao, boolean cobertura, boolean sorvete, String tipo) {
        super(nome, preco, descricao);
        this.cobertura = cobertura;
        this.sorvete = sorvete;
        this.tipo = tipo;
    }

    Sobremesa(String bolo, int i, String bolo_de_chocolate, boolean b, boolean b0, String doce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void preparar() {
        System.out.println("Preparando sobremesa 🍰");
    }

    @Override
    public double calcularPreco() {
        double precoFinal = getPreco();

        if (cobertura) precoFinal += 1.5;
        if (sorvete) precoFinal += 3;

        return precoFinal;
    }
}
