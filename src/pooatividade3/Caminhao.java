package pooatividade3;

public class Caminhao extends Veiculo {

    int cargaMaxima;
    
    public Caminhao(int numeroDeRodas) {
        super.numeroDeRodas = numeroDeRodas;
        super.numeroDePortas = 2;
        System.out.println("Hello World");
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
    
}
