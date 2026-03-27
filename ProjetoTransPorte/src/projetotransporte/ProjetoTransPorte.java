/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetotransporte;

import java.util.ArrayList;

/**
 *
 * @author joaop
 */
public class ProjetoTransPorte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Transporte> transportes = new ArrayList<>();

        transportes.add(new Taxi(4, "Taxi RS", 5.0, 2.5, "Bandeira 1", "João"));
        transportes.add(new Uber(4, "Uber", 4.0, 2.0, 1.5, "Comfort"));
        transportes.add(new Onibus(40, "Carris", 4.5, 123, "Urbano", true));
        transportes.add(new Metro(200, "Trensurb", 4.5, 10, true, "Linha 1"));

        double distancia = 10; // km

        for (Transporte t : transportes) {
            System.out.println("Empresa: " + t.getEmpresa());
            System.out.println("Tarifa: R$ " + t.calcularTarifa(distancia));
            System.out.println("-----------------------");
        }
    }
}
