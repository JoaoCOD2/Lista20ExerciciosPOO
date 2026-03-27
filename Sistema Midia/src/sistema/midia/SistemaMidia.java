/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.midia;

import java.util.ArrayList;

/**
 *
 * @author joaop
 */
public class SistemaMidia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Midia> midias = new ArrayList<>();

        midias.add(new Musica("Shape of You", 4.2, "Ed Sheeran", "Pop", "Divide", 2017));
        midias.add(new Filme("Vingadores", 120, "Marvel", "Russo Brothers", "12+", 2019));
        midias.add(new Podcast("Flow Podcast", 90, "Igor", "Entrevista", 150, "YouTube"));
        midias.add(new Audiolivro("Harry Potter", 600, "J.K. Rowling", "Narrador X", 20, "Fantasia"));

        for (Midia m : midias) {
            m.reproduzir();
            System.out.println("----------------------");
        }
    }
}