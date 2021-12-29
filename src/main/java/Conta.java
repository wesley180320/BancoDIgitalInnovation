public abstract class Conta {

    private static  final int AGENCIA_PADRAO = 1;
    private static int CONTA_PADRAO = 1;

    private Integer agencia;
    private Integer conta;
    private Double saldo = 0.0;

    private Banco banco;

    private Cliente cliente;


    public Conta (Cliente cliente, Banco banco){

        this.cliente=cliente;
        this.banco = banco;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = CONTA_PADRAO++;

    }

    public void depositar(Double valor){

        saldo += valor;

    }

    public void sacar(Double valor){

        saldo -= valor;
    }


    public void transferir(Double valor, Conta contaDestino){

        this.sacar(valor);

        contaDestino.depositar(valor);

    }


    public Integer getAgencia() {
        return agencia;
    }

    public Integer getConta() {
        return conta;
    }


    public Double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia = " + agencia +
                ", conta = " + conta +
                ", saldo = " + saldo +"," +
                " Cliente = " + cliente +
                " Banco = " + banco +
                '}';

    }

    public abstract void imprimirExtrato();
}
