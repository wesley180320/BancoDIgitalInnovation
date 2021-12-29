import java.util.Arrays;

public class Executavel {


    public static void main(String [] args){

        Cliente cliente = new Cliente("Wesley");

        Banco banco = new Banco("Inter");

        Conta c1 = new ContaCorrente(cliente,banco);

        Conta c2 = new ContaPoupanca(cliente, banco);


        c1.depositar(100.00);
        c2.depositar(500.00);

        banco.getContas().addAll(Arrays.asList(c1,c2));

        banco.ImprimirBanco();

        c1.imprimirExtrato();
        c2.imprimirExtrato();
    }

}
