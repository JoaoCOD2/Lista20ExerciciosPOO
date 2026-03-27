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
public class Arqueiro extends Personagem {
    private int precisao;
    private String tipoArco;
    private int agilidade;

    public Arqueiro(String nome, int vida, int nivel, int precisao, String tipoArco, int agilidade) {
        super(nome, vida, nivel);
        this.precisao = precisao;
        this.tipoArco = tipoArco;
        this.agilidade = agilidade;
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " dispara uma flecha certeira! 🏹");
    }

    @Override
    public void defender() {
        System.out.println(getNome() + " desvia rapidamente do ataque!");
    }

    public int getPrecisao() {
        return precisao;
    }

    public void setPrecisao(int precisao) {
        this.precisao = precisao;
    }
}
