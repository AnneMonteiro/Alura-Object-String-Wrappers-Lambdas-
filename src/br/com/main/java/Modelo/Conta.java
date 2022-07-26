package Modelo;

/**
 *
 * Classe que representa a moldura de uma conta
 * @author Anne
 *
 */

public abstract class Conta extends Object implements Comparable<Conta> {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    private static int total = 0;


    /**
     * Construtor para inicializar o objeto a partir da agencia e numero.
     *
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero) {
        total++;
        System.out.println("O total de contas é " + total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0;
        System.out.println("estou criando uma conta " + this.numero + " Agencia: " + this.agencia);
    }

    public abstract void deposita(double valor);

    /**
     * @param valor
     * @throws SaldoInsuficienteException
     */

    public void saca(double valor) throws SaldoInsuficienteException {

        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo " + this.saldo + ", Valor: " + valor);
        }
        this.saldo -= valor;

    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia >= 0) {
            System.out.println("nao pode valor menor ou igual a 0 ");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("nao pode numero <= 0");
            return;
        }
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
    }

    public String toString() {
        return "Numero: " + this.numero + " Agencia: " + this.agencia + " Saldo: " +this.saldo;
    }

    public boolean equals(Object ref) {

        Conta outra = (Conta) ref; //Cast
        if (this.agencia != outra.agencia) {
            return false;

        }

        if (this.numero != outra.numero) {
            return false;
        }

        return true;

        }

    @Override
    public int compareTo(Conta outra) {
        return Double.compare(this.saldo, outra.saldo);
    }

}

