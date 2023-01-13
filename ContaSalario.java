public final class ContaSalario extends ContaCorrente {

    private ContaCorrente cc;

    public ContaSalario() {
    }

    public ContaSalario(Integer numero, ContaCorrente conta) {
        super(numero);
        this.cc = conta;
    }

    public void transferir(Double valor) {
        if (getSaldo() > valor) {
            cc.depositar(valor);
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Não foi possível realizar a transferência.");
        }
    }
}
