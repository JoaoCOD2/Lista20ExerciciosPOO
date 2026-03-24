/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoveiculo;

/**
 *
 * @author joaop
 */
public class Carro extends Veiculo {

    private int portas;
    private String combustivel;
    private boolean automatico;

    public Carro(String modelo, int ano, String marca, int portas, String Combustivel, boolean automatico) {
        super(modelo, ano, marca);
        this.portas = portas;
        this.combustivel = combustivel;
        this.automatico = automatico;
    }

    public int getPortas() {
        return portas;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public boolean getAutomatico() {
        return automatico;
    }

    @Override
    public void mover() {
        System.out.println("O carro esta se movendo");
    }
}