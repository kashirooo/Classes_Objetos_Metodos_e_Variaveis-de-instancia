// figura 3.3 do livro
// classe "Account" com um construto para valores do tipo flot e double


public class Account{

    private double balanco; // variavel de instancia que armazena o saldo

    //construtor
    public Account(double balancoInicial){

        //valida que balancoInicial é maior que 0,0
        // se não, o saldo é inicializado como o valor padrao 0.0;
        if(balancoInicial > 0.0){
            balanco = balancoInicial;
            }
        } // fim do contrutor

        //credita (adiciona) uma quantia à conta
        public void creditar(double quantia){
            balanco = balanco + quantia; //adiciona quantia ao saldo
        } //fim do método creditar

        //retorna o saldo da conta
        public double getbalanco(){
            return balanco; // fornece o calor de saldo ao método chamador
        } // fim do método getbalanco

}