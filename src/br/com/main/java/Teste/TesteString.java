package Teste;

import java.util.Locale;

public class TesteString {

    public static void main(String[] args) {

        String vazio = "Anne";
        String outroVazio = vazio.trim();

        System.out.println(vazio.contains("An"));
        System.out.println(outroVazio);



        //replace
        String nome = "Anne"; //object literal
        nome = nome.replace('e', 'a');
        System.out.println(nome);

        char c = nome.charAt(0);
        System.out.println(c);

        int posicao = nome.indexOf("a");
        System.out.println(posicao);

        String outra = nome.toLowerCase();

        System.out.println(outra);

        String st = nome.toUpperCase();
        System.out.println(st);

        String sub = nome.substring(0);
        System.out.println(sub);

        System.out.println(nome.length());
        for (int i = 0 ; i < nome.length(); i++){
            System.out.println(nome.charAt(i));
        }



    }
}
