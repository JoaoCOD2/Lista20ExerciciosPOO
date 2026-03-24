/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoanimais;

/**
 *
 * @author aluno.saolucas
 */
public class ProjetoAnimais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Animal[] animais ={
            new Cachorro("Thor", 12, 47.984, "Labrador", "Preto", true),
            new Gato("Poly", 4, 3.599, "SRD", "Preta", true),
            new Cavalo("Carlos", 6, 469.665, "Cavalo Árabe", "Cinza", true),
            new Vaca("Maro", 14, 689.345, "Holandesa", "Marrom", false)
        };
        
        for (Animal a : animais){
            a.emitirSom();
        }
    }
}
