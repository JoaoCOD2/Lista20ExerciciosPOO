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
public class Moto extends Veiculo {

    private int cilindradas;
    private String tipo;
    private boolean partidaEletrica;

    public Moto(String modelo, int ano, String marca, int cilindradas, String tipo, boolean partidaEletrica) {
        super(modelo, ano, marca);
        this.cilindradas = cilindradas;
        this.partidaEletrica = partidaEletrica;
        this.tipo = tipo;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean getParidaEletrica() {
        return partidaEletrica;
    }
    
    @Override
    public void mover() {
        System.out.println("A moto esta se movendo");
    }
}