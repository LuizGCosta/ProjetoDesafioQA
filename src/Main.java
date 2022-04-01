public class Main {

    public static void main(String[] args){
        Cliente Luiz = new Cliente();
        Luiz.setNome("Luiz Guilherme");

        Cliente Carol = new Cliente();
        Carol.setNome("Carolina Costa");

        Cliente Afonso = new Cliente();
        Afonso.setNome("Afonso Ferreira");

        Cliente Lilia = new Cliente();
        Lilia.setNome("Lilia Chaves");

        Cliente Maria = new Cliente();
        Maria.setNome("Maria Luiza");

        Conta cc1= new ContaCorrente(Luiz);
        Conta poupanca1= new ContaPoupança(Luiz);

        Conta cc2= new ContaCorrente(Carol);
        Conta poupanca2= new ContaPoupança(Carol);

        Conta cc3= new ContaCorrente(Afonso);
        Conta poupanca3= new ContaPoupança(Afonso);

        Conta cc4= new ContaCorrente(Lilia);
        Conta poupanca4= new ContaPoupança(Lilia);

        Conta cc5= new ContaCorrente(Maria);
        Conta poupanca5= new ContaPoupança(Maria);

//Conta Luiz
        cc1.depositar(4632);
        cc1.transferir(1600, poupanca1);
        cc1.imprimirContaCorrente();
        poupanca1.imprimirContaPoupança();

//Conta Carol
        cc2.depositar(3500);
        cc2.transferir(500, poupanca2);
        cc2.imprimirContaCorrente();
        poupanca2.imprimirContaPoupança();

//Conta Afonso
        cc3.depositar(3450);
        cc3.transferir(400, poupanca3);
        cc3.imprimirContaCorrente();
        poupanca3.imprimirContaPoupança();


//Conta Lilia
        cc4.depositar(2500);
        cc4.transferir(300, poupanca4);
        cc4.imprimirContaCorrente();
        poupanca4.imprimirContaPoupança();

//Conta Maria
        cc5.depositar(2000);
        cc5.transferir(1000, poupanca5);
        cc5.imprimirContaCorrente();
        poupanca5.imprimirContaPoupança();
    }
}
