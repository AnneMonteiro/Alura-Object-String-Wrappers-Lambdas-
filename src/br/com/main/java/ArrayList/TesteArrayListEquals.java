package ArrayList;

import Modelo.Conta;
import Modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 22);
        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc);

        boolean existe = lista.contains(cc2); //novo

        System.out.println("já existe? " +existe);

        boolean igual = cc.equals(cc2);
        System.out.println(igual); //deve imprimir true

        for (Conta conta : lista) {
            System.out.println(conta);
        }

    }
}

