public class ContaCorrente extends Conta {

    public ContaCorrente() {
    }

    public ContaCorrente (Integer numero) {
        setSaldo(0.0);
        setNumero(numero);
    }

    @Override
    public void sacar(Double valor) {
        if (getSaldo() > valor) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Não foi possível realizar o saque.");
        }
    }

    @Override
    public final void depositar(Double valor) {
        ContaCorrente cc = new ContaCorrente();

        if (this.getClass().equals(cc.getClass())) {
            if (valor > 0.0) {
                setSaldo(getSaldo()+valor);
            }
        } else {
            System.out.println("Tipo de conta não suporta essa operação.");
        }
    }
}
