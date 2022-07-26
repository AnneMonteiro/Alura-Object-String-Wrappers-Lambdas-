package Teste;

import Modelo.Cliente;
import Modelo.ContaCorrente;
import Modelo.ContaPoupanca;

public class TesteObject {
    public static void main(String[] args) {
        /*System.out.println("x");
        System.out.println("3");
        System.out.println(false);
*/
        Object cc= new ContaCorrente(22,33);
        Object cp = new ContaPoupanca(33,44);
        Object cliente = new Cliente();
        System.out.println(cc);
        System.out.println(cp);

        //println(cliente);
    }


    static void println(){
    }

    static void println(int a){
    }

    static void println(boolean valor){
    }

    static void println(Object referencia){
    }
}
