/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagemjogo;

/**
 *
 * @author joaop
 */
public class Paladino extends Personagem {
    private int fe;
    private String armaSagrada;
    private int defesa;

    public Paladino(String nome, int vida, int nivel, int fe, String armaSagrada, int defesa) {
        super(nome, vida, nivel);
        this.fe = fe;
        this.armaSagrada = armaSagrada;
        this.defesa = defesa;
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " ataca com poder divino! ✨");
    }

    @Override
    public void defender() {
        System.out.println(getNome() + " invoca proteção sagrada!");
    }

    public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }
}
