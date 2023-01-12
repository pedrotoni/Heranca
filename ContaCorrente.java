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
            System.out.println("Não foi possível realizar a transferência.");
        }
    }

    @Override
    public final void depositar(Double valor) {
        if (valor > 0.0) {
            setSaldo(getSaldo()+valor);
        }
    }

}
