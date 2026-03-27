/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarestaurante;

import java.util.ArrayList;

/**
 *
 * @author joaop
 */
public class SistemaRestaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ItemCardapio> itens = new ArrayList<>();

        itens.add(new Pizza("Pizza Calabresa", 30, "Pizza tradicional", "Grande", true, 1));
        itens.add(new Hamburguer("X-Bacon", 20, "Hambúrguer com bacon", true, true, "Brioche"));
        itens.add(new Bebida("Coca-Cola", 8, "Refrigerante", "Grande", true, true));
        itens.add(new Sobremesa("Bolo", 10, "Bolo de chocolate", true, true, "Doce"));

        for (ItemCardapio item : itens) {
            System.out.println("Item: " + item.getNome());
            item.preparar();
            System.out.println("Preço final: R$ " + item.calcularPreco());
            System.out.println("----------------------");
        }
    }
}
