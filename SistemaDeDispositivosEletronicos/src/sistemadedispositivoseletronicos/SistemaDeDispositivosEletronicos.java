/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadedispositivoseletronicos;

import java.util.ArrayList;

/**
 *
 * @author joaop
 */
public class SistemaDeDispositivosEletronicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Dispositivo> dispositivos = new ArrayList<>();

        dispositivos.add(new Computador("Dell", "Inspiron", false, 16, "i5", "Windows"));
        dispositivos.add(new Smartphone("Samsung", "Galaxy S23", false, 256, "Android", true));
        dispositivos.add(new Tablet("Apple", "iPad", false, 10.5, true, 8000));
        dispositivos.add(new Televisao("LG", "Smart TV", false, 55, "4K", true));

        for (Dispositivo d : dispositivos) {
            d.ligar();
            d.executarFuncao();
            d.desligar();
            System.out.println("----------------------");
        }
    }
}
