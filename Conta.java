import java.util.Objects;

public abstract class Conta {
    private Integer numero;
    private Double saldo;

    public abstract void sacar(Double valor);
    public abstract void depositar(Double valor);

    public Double getSaldo() {
        return this.saldo;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        //Guilherme, Luciana, Pedro - continuar equals
        return numero.equals(conta.numero) && saldo.equals(conta.saldo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, saldo);
    }
}
