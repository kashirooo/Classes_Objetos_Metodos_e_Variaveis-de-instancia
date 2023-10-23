import java.util.Scanner;

/**
 * figura 6.e do Livro 
 * método para descobrir o maior valores do tipo double
 * inseridos pelo usuario
 */
public class MaximumFinder {

    public void determineMaximun(){
        Scanner input = new Scanner(System.in); // insere o que usuario digitar

        System.out.print("Digite três valores números flutuantes separado por espaços: ");
            double num1 = input.nextDouble(); //lê o primeiro Double
            double num2 = input.nextDouble(); //lê o segundo Double
            double num3 = input.nextDouble(); //lê o terceiro Double

           // determina o maximo valor
           double result = maximum(num1, num2, num3);

           System.out.println("O valor máximo é " + result);
    } // fim do metodo determineMaximun


    //retorna o máximo  dos seus três parâmetros de double
    public double maximum(double x, double y, double z){

        double maximumValue = x; // supõe que x é o maior número

        // determina se y é maior que maximumValue
        if (y > maximumValue)
        maximumValue = y;

        if (z > maximumValue)
        maximumValue = z;

        return maximumValue;

    } // fim do método maximum
} // fim da classe MaximumFinder