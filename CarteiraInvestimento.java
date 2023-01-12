public class CarteiraInvestimento extends Conta {
    private Integer prazoMinimoDeSaque;

    public CarteiraInvestimento() {
    }

    public CarteiraInvestimento(Integer numero) {
        setNumero(numero);
        setSaldo(0.0);
        this.prazoMinimoDeSaque = 100;
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
    public void depositar(Double valor) {
        if (valor > 0.0) {
            setSaldo(getSaldo()+valor);
        }
    }

    public void depositar(Double valor, Integer prazo) {
        depositar(valor);
        this.prazoMinimoDeSaque = prazo;
    }


}
