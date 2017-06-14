package pooatividade3;

public class Carro extends Veiculo {

    int tamanhoPortaMalas;

    public Carro(int numeroDePortas) {
        super.numeroDePortas = numeroDePortas;
        super.numeroDeRodas = 4;
    }
    
    public int getTamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }

    public void setTamanhoPortaMalas(int tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }
    
}
