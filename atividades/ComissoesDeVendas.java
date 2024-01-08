/**
 * Utilize um array unidimensional para resolver o seguinte problema: uma empresa paga seu pessoal de vendas por comissão. 
- O pessoal de vendas recebe R$ 200 por semana mais 9% de suas vendas brutas durante essa semana.
    - Por exemplo, um vendedor que vende R$ 5.000 brutos em uma semana recebe R$ 200 mais 9% de R$ 5.000 ou um total de R$ 650.
- Escreva um aplicativo (utilizando um array de contadores) que determina quanto o pessoal de vendas ganhou em cada um dos seguintes intervalos (assuma que o salário de cada vendedor foi truncado para uma quantia inteira)
- Resuma os resultados em formato tabular
a) $200–299
b) $300–399
c) $400–499
d) $500–599
e) $600–699
f) $700–799
g) $800–899
h) $900–999
i) R$ 1.000 e acima
 */

public class ComissoesDeVendas {
    
    public static void main(String[] args) {

        final int [] contador = new int[10];
        int x = 200;

        System.out.printf("%10s %5s\n", "Comissão", "Valor"); // cabeçalho

        for (int counter = 0; counter < contador.length; counter++){
            
            if (counter == 10)
                System.out.printf("$%9s", "1000+");
            else
            
            System.out.printf("$%3s-$%4s $%5s\n", counter * x , counter * x + 99, x);
        } // fim do for

        

    } //fim do main
}
