public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }
    @Override
    public void sacar(double valor) {

        saldo -= valor;
    }
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }

    public void imprimirContaCorrente() {
        System.out.println(String.format("*".repeat(22) + " Titular: %s " + "*".repeat(22), this.cliente.getNome()));
        System.out.println(String.format( "\n" +  " ".repeat(25) + "Conta Corrente"));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero Conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f\n", this.saldo));
    }

    public void imprimirContaPoupança() {
        System.out.println(String.format(" ".repeat(25) + "Conta Poupança"));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero Conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
