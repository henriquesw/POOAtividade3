package pooatividade3;

public class Moto extends Veiculo{

    boolean bauleto;
    
    public Moto() {
        super.numeroDePortas = 0;
        super.numeroDeRodas = 2;
    }

    public void colocarBauleto() {
        this.bauleto = true;
    }

    public void tirarBauleto() {
        this.bauleto = false;
    }
    
    public boolean temBauleto() {
        return bauleto;
    }
    
}
