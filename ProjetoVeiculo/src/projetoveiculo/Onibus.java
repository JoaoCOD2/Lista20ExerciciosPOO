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
public class Onibus extends Veiculo {

    private int andares;
    private int capacidadePassageiros;
    private String assento;

    public Onibus(String modelo, int ano, String marca, int andares, int capacidadePassageiros, String assento) {
        super(modelo, ano, marca);
        this.andares = andares;
        this.capacidadePassageiros = capacidadePassageiros;
        this.assento = assento;
    }

    public int getAndares() {
        return andares;
    }

    public int getcapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public String getAssento() {
        return assento;
    }

    @Override
    public void mover() {
        System.out.println("O onibus esta se movendo");
    }
}