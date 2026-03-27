/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaimoveis;

import java.util.ArrayList;

/**
 *
 * @author joaop
 */
public class SistemaImoveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayLisat<Imovel> imoveis = new ArrayList<>();

        imoveis.add(new Casa("Rua A", 300000, 120, 3, true, 2));
        imoveis.add(new Apartamento("Rua B", 250000, 80, 5, 500, true));
        imoveis.add(new Terreno("Rua C", 150000, 200, false, "Argiloso", true));
        imoveis.add(new SalaComercial("Rua D", 400000, 100, "Loja", true, 1000));

        for (Imovel i : imoveis) {
            System.out.println("Endereço: " + i.getEndereco());
            System.out.println("Imposto: R$ " + i.calcularImposto());
            System.out.println("----------------------");
        }
    }
}