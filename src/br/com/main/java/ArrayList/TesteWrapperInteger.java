package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
    public static void main(String[] args) {

        int[] idades = new int[5];
        String[] nome = new String[5];

        int idade = 29; //integer
        Integer idadeRef = Integer.valueOf(29); //autoboxing

        System.out.println("Idade em Double: "+idadeRef.doubleValue());

        System.out.println("Valor maximo: " +Integer.MAX_VALUE);
        System.out.println("Valor minimo: " +Integer.MIN_VALUE);
        System.out.println("BYTES: " +Integer.BYTES);
        System.out.println("TAMANHO: " +Integer.SIZE);

        int valor = idadeRef.intValue(); //unboxing

        String s = args [0]; //"10"

        //Integer numero = Integer.valueOf(s);
        int numero = Integer.parseInt(s);
        System.out.println("PARAMETROS:"+numero);

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); //Autoboxing


    }
}
