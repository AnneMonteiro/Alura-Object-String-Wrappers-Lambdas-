package ArrayList;

public class TesteWrapper {
    public static void main(String[] args) {

        Integer ref = Integer.valueOf("3");
        String diaComoTexto = "29";
        //int dia = Integer.valueOf(diaComoTexto);
        int dia = Integer.parseInt(diaComoTexto); //parsing
        System.out.println("Dia Como Texto: "+Integer.valueOf(diaComoTexto)); //parsing



         //autoboxing e unboxing na linha 11 "ref++"
        //int valor = ref.intValue();
        //valor = valor + 1;
        //ref= Integer.valueOf(valor);*/
        ref++;
        System.out.println(ref);
    }
}
