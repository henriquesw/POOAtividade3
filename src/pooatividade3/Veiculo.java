package pooatividade3;

public class Veiculo {

    String marca;
    int numeroDeRodas;
    int numeroDePortas;
    int velocidadeAtual;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroDeRodas() {
        return numeroDeRodas;
    }

    public void setNumeroDeRodas(int numeroDeRodas) {
        this.numeroDeRodas = numeroDeRodas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }
    
    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void acelera(int velocidade) {
        this.velocidadeAtual = velocidade;
    }

    public void frear() {
        this.velocidadeAtual = 0;
    }
    
}
