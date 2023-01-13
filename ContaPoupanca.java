public class ContaPoupanca extends Conta {
    private Double taxaDeRendimento;

    public ContaPoupanca() {
    }

    public ContaPoupanca(Integer numero) {
        setSaldo(0.0);
        setNumero(numero);
        this.taxaDeRendimento = 5.4;
    }

    public Double getTaxaDeRendimento() {
        return this.taxaDeRendimento;
    }

    public void setTaxaDeRendimento(Double taxa) {
        this.taxaDeRendimento = taxa;
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
    public void depositar(Double valor) {
        if (valor > 0.0) {
            setSaldo(getSaldo()+valor);
        }
    }
}
