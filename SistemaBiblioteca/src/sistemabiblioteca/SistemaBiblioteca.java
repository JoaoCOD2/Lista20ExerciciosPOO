/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabiblioteca;

import java.util.ArrayList;

/**
 *
 * @author joaop
 */
public class SistemaBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ItemBiblioteca> itens = new ArrayList<>();

        itens.add(new Livro("Java Básico", "001", true, "Autor X", 300, "Educação"));
        itens.add(new Revista("Tech News", "002", true, 10, "Tecnologia", "Editora Y"));
        itens.add(new Jornal("Diário RS", "003", true, "27/03/2026", "Porto Alegre", "Impresso"));
        itens.add(new DVD("Matrix", "004", true, "Ação", 120, "16+"));

        for (ItemBiblioteca item : itens) {
            item.emprestar();
            item.devolver();
            System.out.println("----------------------");
        }
    }
}
