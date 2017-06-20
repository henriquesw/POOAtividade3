package pooatividade3;

public class Veiculo {

    String marca;
    int numeroDeRodas;
    int numeroDePortas;
    int velocidadeAtual;
    static int num;
    private int id;

    public Veiculo() {
        this.id = ++num;
    }

    public static int getNum() {
        return num;
    }
    
    public int getId() {
        return id;
    }
    
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

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelera(int velocidade) {
        this.velocidadeAtual = velocidade;
    }

    public void frear() {
        this.velocidadeAtual = 0;
    }
    
    public void comparaVelocidade(Veiculo veiculo){
        if (this.velocidadeAtual > veiculo.getVelocidadeAtual())
            System.out.println("O veículo "+this.id+" está mais rápido.");
        else
            if (this.velocidadeAtual == veiculo.getVelocidadeAtual())
                System.out.println("Os veículos possuem a mesma velocidade.");
            else
                System.out.println("O veículo "+veiculo.getId()+" está mais rápido.");
    }
    
}
