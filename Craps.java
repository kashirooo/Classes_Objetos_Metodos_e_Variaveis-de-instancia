// figura 6.9 Craps.java
// a classe simula  o jogo de dados Craps

import java.util.Random;

public class Craps {

    //gera numeros aleatórios para o uso no metodo
    private static final Random randomNumbers = new Random();

    //enumeração de constantes que representam o status do jogo
    private enum Status {CONTINUE, WON, LOST};

    //constantes que representam lançamentos comuns dos dados
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_ELEVEN = 11;
    private static final int BOX_CARS = 12;

    //joga uma partida de craps
    public void play(){

        int myPoint = 0; // pontosse nao ganhar ou perder na 1ª rolagem
        Status gameStatus; //pode conter os status criados acima

        int sumOfDice = rollDice(); // primeria rolagem de dados

        //determina o status do jogo ou a pontuação com base no status do jogo
        switch (sumOfDice){

            case SEVEN: //caso a soma dos numero seja 7
            case YO_ELEVEN: //caso a soma dos numeros seja 11
            gameStatus = Status.WON;
            break;
            
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
            gameStatus = Status.LOST;
            break;

            default:
            gameStatus = Status.CONTINUE;
            myPoint = sumOfDice;
            System.out.printf("Sua pontuação é %d\n", myPoint);
            break;
            
        } //fim do switch

        //enquanto o jogo não estiver completo
        while(gameStatus == Status.CONTINUE){
            sumOfDice = rollDice(); // lança os dados novamente

            // determina o status do jogo
            if (sumOfDice == myPoint) //vitoria por pontuação
                gameStatus = Status.WON;
            else  if (sumOfDice == SEVEN) //obtendo 7 antes de alncaçar a pontuação
                gameStatus = Status.LOST;

        } // fim do while

        //exibe uma mensagem se ganhou ou perdeu 
        if (gameStatus == Status.WON)
            System.out.println("Você ganhou, Jogador(a)!!!");
        else
        System.out.println("Você perdeu, Jogador(a) :( ");
    } // fim do metodo play

    public int rollDice(){

        int dice1 = 1 + randomNumbers.nextInt(6); //primeiro lançamento de dados
        int dice2 = 1 + randomNumbers.nextInt(6); // segundo lançamento de dados

        int soma = dice1 + dice2; //soma os valores de dados

        //exibe o resultado desses lançamentos
        System.out.printf("Jogador rolou %d + %d = %d\n", dice1, dice2, soma);

        return soma; //retorna a soma
    } //fim do metodo rollDice
} // fim da classe Craps
