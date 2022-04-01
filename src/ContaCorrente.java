public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {super(cliente);}

    @Override
    public void imprimirContaCorrente() {
        System.out.println(">>>Extrato Conta Corrente<<<");
        super.imprimirContaCorrente();
    }


}