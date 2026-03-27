/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoformasgeo;

import java.util.ArrayList;

/**
 *
 * @author joaop
 */
public class ProjetoFormasGeo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(new Quadrado("Quadrado", "Azul", 4));
        formas.add(new Retangulo("Retângulo", "Vermelho", 5, 3));
        formas.add(new Circulo("Círculo", "Verde", 2.5));
        formas.add(new Triangulo("Triângulo", "Amarelo", 6, 4));

        for (Forma f : formas) {
            System.out.println("Forma: " + f.getNome());
            System.out.println("Cor: " + f.getCor());
            System.out.println("Área: " + f.calcularArea());
            System.out.println("-----------------------");
        }
    }
}
