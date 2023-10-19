//Aqui irei demonstrar a capacidade da classe Invoice.

import java.util.Scanner;

public class InvoiceTeste {
    public static void main(String[] args){
        try (//le o que o usuario vai digitar
        Scanner input = new Scanner(System.in)) {
            Invoice produto1 = new Invoice("1","vazio",1,1);
            String nomeProduto;
            String numeroProduto;
            int quantidadeProduto;
            double valorProduto;

            //trocar o numero
            System.out.printf("Insira o numero do produto:");
            numeroProduto = input.next();
            produto1.setnumero(numeroProduto);

            //trocar a descrição
            System.out.printf("Insira o nome do produto:");
            nomeProduto = input.next();
            produto1.setproduto(nomeProduto);

            //trocar a quantidade
            System.out.printf("Insira a quantidade: ");
            quantidadeProduto = input.nextInt();
            produto1.setquantidade(quantidadeProduto);

            //trocar o valor do produto
            System.out.printf("Insira o valor do produto:");
            valorProduto = input.nextDouble();
            produto1.setvalor(valorProduto);

            System.out.printf("o Produto cadastrado com sucesso:\nNº %s\ndescrição: %s\nquantidade: %d\nvalor: %.2f\n\n",
            produto1.getnumero(),
            produto1.getproduto(),
            produto1.getquantidade(),
            produto1.getvalor()); // fim da exibição do produto cadastrado

            //Inicio do calculo da fatura
            produto1.getInvoiceAmount(quantidadeProduto, valorProduto);
            System.out.printf("O Valor da fatura do(a) %s é de R$ %.2f", produto1.getproduto(), produto1.showInvoiceAmount());
        }


    } // fim da classe main
}
