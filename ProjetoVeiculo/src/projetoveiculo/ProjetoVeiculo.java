package projetoveiculo;

public class ProjetoVeiculo {

    public static void main(String[] args) {

        Veiculo[] veiculo = {
            new Carro("Jetta", 2016, "Volkswagen", 4, "Cheio", true),
            new Moto("CB 500F", 2022, "Honda", 471, "Naked", true),
            new Bicicleta("Elite", 2021, "Caloi", 21, "Disco hidráulico", false),
            new Onibus("Marcopolo", 2025, "Volare Fly 10 GV", 2, 30, "assentos Leito-Cama (90º)"),
        };

        for (Veiculo v : veiculo) {
            v.mover();

        }

    }
}