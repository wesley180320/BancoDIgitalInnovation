public class ContaPoupanca extends Conta{

    Conta conta;

    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente,banco);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("extrato da conta Poupanca " + super.toString());

    }

}
