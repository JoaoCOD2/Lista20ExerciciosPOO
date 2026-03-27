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
public class Mago extends Personagem {
    private int mana;
    private String magia;
    private int inteligencia;

    public Mago(String nome, int vida, int nivel, int mana, String magia, int inteligencia) {
        super(nome, vida, nivel);
        this.mana = mana;
        this.magia = magia;
        this.inteligencia = inteligencia;
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " lança uma magia poderosa! 🔮");
    }

    @Override
    public void defender() {
        System.out.println(getNome() + " cria um escudo mágico!");
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
