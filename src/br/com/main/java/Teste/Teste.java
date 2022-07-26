package Teste;

import Modelo.Conta;
import Modelo.ContaCorrente;
import Modelo.GuardadorDeContas;

public class Teste {

    public static void main(String[] args) {

        GuardadorDeContas guardador = new GuardadorDeContas();
        Conta cc = new ContaCorrente(22, 33);

        guardador.adiciona(cc);

        Conta cc1 = new ContaCorrente(44,66);
        guardador.adiciona(cc1);


        int tamanho = guardador.getquantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(0);
        System.out.println(ref.getNumero());


    }
}
