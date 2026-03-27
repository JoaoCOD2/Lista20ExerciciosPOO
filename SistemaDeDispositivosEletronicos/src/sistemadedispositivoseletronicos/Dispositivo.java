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
public abstract class Dispositivo {
    private String marca;
    private String modelo;
    private boolean ligado;

    public Dispositivo(String marca, String modelo, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = ligado;
    }

    public void ligar() {
        ligado = true;
        System.out.println(modelo + " foi ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println(modelo + " foi desligado.");
    }

    public abstract void executarFuncao();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
