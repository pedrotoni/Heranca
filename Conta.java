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
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        if (this == conta) return true;
        return numero.equals(conta.getNumero()) && saldo.equals(conta.getSaldo());
        //return numero.equals(conta.numero) && saldo.equals(conta.saldo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, saldo);
    }
}
