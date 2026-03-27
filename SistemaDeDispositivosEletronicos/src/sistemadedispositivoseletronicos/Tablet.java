/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadedispositivoseletronicos;

/**
 *
 * @author joaop
 */
public class Tablet extends Dispositivo {
    private double tamanhoTela;
    private boolean canetaDigital;
    private int bateria;

    public Tablet(String marca, String modelo, boolean ligado, double tamanhoTela, boolean canetaDigital, int bateria) {
        super(marca, modelo, ligado);
        this.tamanhoTela = tamanhoTela;
        this.canetaDigital = canetaDigital;
        this.bateria = bateria;
    }

    @Override
    public void executarFuncao() {
        System.out.println(getModelo() + " está sendo usado para desenho 🎨");
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }
}
