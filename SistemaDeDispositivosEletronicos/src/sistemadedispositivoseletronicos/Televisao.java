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
public class Televisao extends Dispositivo {
    private int polegadas;
    private String resolucao;
    private boolean smartTV;

    public Televisao(String marca, String modelo, boolean ligado, int polegadas, String resolucao, boolean smartTV) {
        super(marca, modelo, ligado);
        this.polegadas = polegadas;
        this.resolucao = resolucao;
        this.smartTV = smartTV;
    }

    @Override
    public void executarFuncao() {
        System.out.println(getModelo() + " está exibindo um filme 🎬");
    }

    public int getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(int polegadas) {
        this.polegadas = polegadas;
    }
}
