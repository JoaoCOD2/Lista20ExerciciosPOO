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
public class Smartphone extends Dispositivo {
    private int armazenamento;
    private String sistemaOperacional;
    private boolean suporte5G;

    public Smartphone(String marca, String modelo, boolean ligado, int armazenamento, String sistemaOperacional, boolean suporte5G) {
        super(marca, modelo, ligado);
        this.armazenamento = armazenamento;
        this.sistemaOperacional = sistemaOperacional;
        this.suporte5G = suporte5G;
    }

    @Override
    public void executarFuncao() {
        System.out.println(getModelo() + " está fazendo uma chamada 📱");
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public boolean isSuporte5G() {
        return suporte5G;
    }

    public void setSuporte5G(boolean suporte5G) {
        this.suporte5G = suporte5G;
    }
}