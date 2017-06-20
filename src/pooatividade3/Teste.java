/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooatividade3;

/**
 *
 * @author a16019
 */
public class Teste {
    public static void main(String[] args){
        Caminhao caminhao = new Caminhao(6);
        caminhao.setVelocidadeAtual(80);
        Moto moto = new Moto();
        moto.setVelocidadeAtual(100);
        Carro carro = new Carro(2);
        carro.setVelocidadeAtual(85);
        moto.comparaVelocidade(carro);
        carro.comparaVelocidade(caminhao);
        caminhao.comparaVelocidade(moto);
    }
}
