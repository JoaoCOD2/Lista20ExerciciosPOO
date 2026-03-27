/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagemjogo;

import java.util.ArrayList;

/**
 *
 * @author joaop
 */
public class PersonagemJogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Personagem> personagens = new ArrayList<>();

        personagens.add(new Guerreiro("Thor", 150, 10, 80, "Espada", 50));
        personagens.add(new Mago("Merlin", 100, 12, 200, "Fogo", 90));
        personagens.add(new Arqueiro("Legolas", 110, 11, 95, "Arco Longo", 85));
        personagens.add(new Paladino("Arthur", 130, 9, 70, "Martelo Sagrado", 60));

        for (Personagem p : personagens) {
            System.out.println("Personagem: " + p.getNome());
            p.atacar();
            p.defender();
            System.out.println("----------------------");
        }
    }
}
