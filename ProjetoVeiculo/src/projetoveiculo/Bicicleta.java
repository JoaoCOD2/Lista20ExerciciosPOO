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
public class Bicicleta extends Veiculo {

    private int marchas;
    private String tipoFreio;
    private boolean eletrica;

    public Bicicleta(String modelo, int ano, String marca, int marchas, String tipoFreio, boolean eletrica) {
        super(modelo, ano, marca);
        this.marchas = marchas;
        this.tipoFreio = tipoFreio;
        this.eletrica = eletrica;
    }
    
    public int getMarchas(){
        return marchas;
    }
    
    public String getTipoFreio(){
        return tipoFreio;
    }
    
    public boolean getEletrica(){
        return eletrica;
    }
    
    @Override
    public void mover() {
        System.out.println("A bicicleta esta se movendo");
    }
}