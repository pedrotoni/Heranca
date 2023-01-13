/*
 * Grupo: José Guilherme, Pedro Vitor e Luciana*/

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111);
        ContaCorrente cc2 = new ContaCorrente(123);
        ContaCorrente cc3 = new ContaCorrente(111);
        ContaPoupanca cp = new ContaPoupanca(123);
        System.out.println(cc.equals(cc));
        System.out.println(cc.equals(cc2));
        System.out.println(cc.equals(cc3));
        System.out.println(cc2.equals(cp));

        cc.depositar(100.0);
        System.out.println(cc.getSaldo());
        cc.sacar(50.0);
        System.out.println(cc.getSaldo());
        cc.sacar(100.0);
        System.out.println(cc.getSaldo());
        cp.depositar(1000.0);
        System.out.println(cp.getSaldo());
        cp.sacar(100.0);
        System.out.println(cp.getSaldo());
        cp.sacar(1000.0);
        System.out.println(cp.getSaldo());

        CarteiraInvestimento ci = new CarteiraInvestimento(123);

        ci.depositar(500.0,13);
        System.out.println(ci.getSaldo());
        ci.sacar(300.0);
        System.out.println(ci.getSaldo());
        ci.sacar(3000.0);
        System.out.println(ci.getSaldo());

        ContaSalario cs = new ContaSalario(123, cc);
        cs.transferir(300.0);
        cs.setSaldo(1000.0);
        cs.transferir(300.0);
        System.out.println(cs.getSaldo());
        System.out.println(cc.getSaldo());
        cs.sacar(100.0);
        System.out.println(cs.getSaldo());
        cs.depositar(1000.0);

    }
}
