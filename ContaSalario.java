public final class ContaSalario extends ContaCorrente {

    public ContaSalario() {
    }

    public ContaSalario(Integer numero) {
        super(numero);
    }

    public void transferir(Double valor) {
        if (getSaldo() > valor) {
            super.depositar(valor);
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Não foi possível realizar a transferência.");
        }
    }
}
