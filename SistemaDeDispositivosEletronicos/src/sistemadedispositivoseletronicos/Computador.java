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
public class Computador extends Dispositivo {
    private int memoriaRAM;
    private String processador;
    private String sistemaOperacional;

    public Computador(String marca, String modelo, boolean ligado, int memoriaRAM, String processador, String sistemaOperacional) {
        super(marca, modelo, ligado);
        this.memoriaRAM = memoriaRAM;
        this.processador = processador;
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public void executarFuncao() {
        System.out.println(getModelo() + " está rodando programas pesados 💻");
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }
}
