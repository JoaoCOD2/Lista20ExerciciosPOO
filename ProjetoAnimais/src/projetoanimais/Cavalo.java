/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoanimais;

/**
 *
 * @author aluno.saolucas
 */
public class Cavalo extends Animal {

    private String raca;
    private String cor;
    private boolean domestico;

    public Cavalo(String nome, int idade, double peso, String raca, String cor, boolean domestico) {
        super(nome, idade, peso);
        this.raca = raca;
        this.cor = cor;
        this.domestico = domestico;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean getDomestico() {
        return domestico;
    }

    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
    }

    @Override
    public void emitirSom() {
        System.out.println("O cavalo relinche");
    }
}
