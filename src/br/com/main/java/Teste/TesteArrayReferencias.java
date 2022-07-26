package Teste;

import Modelo.Cliente;
import Modelo.Conta;
import Modelo.ContaCorrente;
import Modelo.ContaPoupanca;

/*package br.com.bytebank.banco.test;

public class TestArrayReferencias {

        public static void main(String[] args) {

                //int[] idades = new int[5];
                ContaCorrente[] contas = new ContaCorrente[5];
                ContaCorrente cc1 = new ContaCorrente(22, 11);
                contas[0] = cc1;

                ContaCorrente cc2 = new ContaCorrente(22, 22);
                contas[1] = cc2;

                //System.out.println(cc2.getNumero());

                System.out.println(contas[1].getNumero());

                ContaCorrente ref = contas[1];
                System.out.println(cc2.getNumero());
                System.out.println(ref.getNumero());
        }
}*/
public class TesteArrayReferencias {

    public static void main(String[] args) {
        //int [] idades = new int [5]; // inicia o array com valores padrão.

        Object[] contas = new Object[5];

        Object[] referencias = new Object[5];

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        referencias[1] = cc2;

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        //System.out.println(cc2.getNumero());

        //Object referenciaGenerica = contas[1];

        //System.out.println( referenciaGenerica.getNumero() );

        ContaPoupanca ref = (ContaPoupanca) contas[1]; //type cast
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());

        // Type Cast que é nada mais do que a conversão de um tipo para outro.

        int numero = 3;
        double valor = numero; //cast implícito

        int numero1 = 3;
        double valor1 = (double) numero1; //cast explícito

        double valor2 = 3.56;
        int numero2 = (int) valor2; //cast explicito é exigido pelo compilador

        }

}




