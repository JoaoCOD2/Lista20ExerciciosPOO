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
public class Guerreiro extends Personagem {
    private int forca;
    private String arma;
    private int defesa;

    public Guerreiro(String nome, int vida, int nivel, int forca, String arma, int defesa) {
        super(nome, vida, nivel);
        this.forca = forca;
        this.arma = arma;
        this.defesa = defesa;
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " ataca com sua espada! ⚔️");
    }

    @Override
    public void defender() {
        System.out.println(getNome() + " levanta o escudo para se defender!");
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
}
