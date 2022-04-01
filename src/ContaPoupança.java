public class ContaPoupança extends Conta {

    public ContaPoupança(Cliente cliente) {super(cliente);}

    @Override
    public void imprimirContaPoupança() {
        System.out.println(">>>Extrato Conta Poupança<<<");
        super.imprimirContaPoupança();
    }

}

