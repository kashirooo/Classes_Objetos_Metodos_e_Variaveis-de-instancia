//fiura 3.14 do livro
//entrada e saída de números de ponto flutuante com objetos do Account
import java.util.Scanner;

public class AccountTeste{

    //método main inicia a execução do aplicativo Java
    public static void main(String[] arg){

        Account conta1 = new Account(50.00); //Cria o Objeto Account
        Account conta2 = new Account(10.00); //Cria o Objeto Account

        //exibe o saldo inicial de cada objeto
        System.out.printf("O saldo inicial da conta1: $%.2f \n", conta1.getbalanco());
        System.out.printf("O saldo inicial da conta2: $%.2f \n\n", conta2.getbalanco());

        try (//cria Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in)) {
            double depositoQuantia; //A quantia de depósito lida a partir do usuário
            double sacarQuantia; //A quantia de depósito lida a partir do usuário

            System.out.print("Entre com a quantia do depósito da conta1: ");
            depositoQuantia = input.nextDouble(); //entrada do usuario
            System.out.printf("\nAdicionado %.2f no saldo da conta1.\n", depositoQuantia);
            conta1.creditar(depositoQuantia);

            //exibe o saldo
            System.out.printf("\nO saldo inicial da conta1: $%.2f \n", conta1.getbalanco());
            System.out.printf("O saldo inicial da conta2: $%.2f \n\n", conta2.getbalanco());

            //conta2 agora
            System.out.print("Entre com a quantia do depósito da conta2: ");
            depositoQuantia = input.nextDouble(); //entrada do usuario
            System.out.printf("\nAdicionado %.2f no saldo da conta2.\n", depositoQuantia);
            conta2.creditar(depositoQuantia); //adiciona saldo na conta2

            //exibe os saldos
            System.out.printf("conta1 saldo: $%.2f \n", conta1.getbalanco());
            System.out.printf("conta2 saldo: $%.2f \n", conta2.getbalanco());

            //testando o método debito
            System.out.print("Digite o saldo que deseja debitar da conta1: ");
            sacarQuantia = input.nextDouble();
            if(sacarQuantia <= conta1.getbalanco()){
            System.out.printf("\nSacando %.2f do saldo da conta1.\n", sacarQuantia);
            }
            conta1.debitar(sacarQuantia);
        }
        //exibe o saldo da conta1
        System.out.printf("conta1 saldo: $%.2f \n\n", conta1.getbalanco());

    }//fim da classe main   
}