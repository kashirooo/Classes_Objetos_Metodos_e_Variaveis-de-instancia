package Aulas_Praticas;
//Atividade do livro 3.13
//Fatura
//para essa Classe, toda variavel de instancia irei colocar com o final "I"

public class Invoice {
    private String numeroI; //numero do produto
    private String produtoI; //descrição do produto
    private int quantidadeI; //Quantidade do produto
    private double valorI; //Valor do produto

    private double total; //para calcular o valor total da fatura

    //construtor
    public Invoice(String numero, String produto, int quantidade, double valor){
        numeroI = numero;
        produtoI = produto;
        quantidadeI = quantidade;
        valorI = valor;
    } //fim do construtor
    
    //seção set de cada variavel de instancia
    public void setnumero(String numero){
        numeroI = numero;
    }
    public void setproduto(String produto){
        produtoI = produto;
    }
    public void setquantidade(int quantidade){
        if(quantidade > 0 ){   //para se iniciar com a quantidade padrão de 0
            quantidadeI = quantidade;
        }
    }
    public void setvalor(double valor){
        if(valor > 0.0 ){   //para se iniciar com a quantidade padrão de 0
        valorI = valor;
        }
    }
    //fim da seção de set de variaveis de instancia

    //inicio da seção get de variaveis de instancia
    public String getnumero(){
        return numeroI;
    }
    public String getproduto(){
        return produtoI;
    }
    public int getquantidade(){
        return quantidadeI;
    }
    public double getvalor(){
        return valorI;
    }
    //fim da seção get de variaveis de instancia

    //calcular o valor da fatura
    public void getInvoiceAmount(int quantidadeI, double valorI){
        total = quantidadeI * valorI;
    }
    public double showInvoiceAmount(){
        return total;
    }
    
}
