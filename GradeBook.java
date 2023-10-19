//Figura 5.9 do livro
//Com uma nova versão agora do Switch Case
//introduzindo o conteudo   

import java.util.Scanner;

public class GradeBook{

    private String courseName; // nome do curso para esse GradeBook
    private int total, gradeCounter, aCount, bCount, cCount, dCount, eCount;

    //o construtor inicializa courseName com o argumento String
    //aumentando o parametro para fins de teste
    public GradeBook(String name){

        courseName = name; // inicializa courseName
    }// fim do construtor

    //método para configurar o nome do curso
    public void setCourseName(String name){
        courseName = name; //armazena o nome do curso
        
    } // fim do método setcourseName

    //metodo para recuperar o nome do curso
    //continuando com o teste adicionando mais um return (o que sem a documentação me deu um trabalhao)
    public String getCourseName(){

        return courseName;

    }// fim do metodo getcourseName

    //exibe uma mensagem de boas vindas para o usuario GradeBook
    public void displayMessage(){

        //chama getcourseName para obter o nome do curso que essa GradeBook representa
        System.out.println("Bem vindo ao Livro de notas do " + getCourseName());
    }//fim do metodo displayMessage

    public void inputGrades(){
        try (Scanner input = new Scanner (System.in)) {
            int grade; // nota inserida pelo usuario
            System.out.printf("%s\n%s\n    %s\n    %s\n",
            "Entre com o numero da nota no raio de 0-100",
            "digite o fim-da-linha indicado para terminar de inserir: ",
            "No UNIX/Linux/MAC OS x digite <Ctrl> d e então pressione Enter",
            "No Windows digite <Ctrl> z e entao pressione Enter");

            //faz um loop até usuario inserir o indicador de fim do arquivo
            while(input.hasNext()){
                grade = input.nextInt(); // e a nota inserida
                total += grade; // adiciona nota inserida a total
                ++gradeCounter; // incremento

                //chama método para incrementar o contador adequado
                incrementLetterGradeCounter(grade);
            } //fim do while
        }
    } // fim do metodo inputGrades

    //adiciona 1 ao contador adequado da nota especifica
    private void incrementLetterGradeCounter(int grade){
        switch(grade / 10){
            case 9: //a nota estava entre 90
            case 10: //e 100 inclusivo
            ++aCount; //incrementa aCount
            break; //necessário para sair do switch

            case 8: // nota estava entre 80 e 89
            ++bCount;
            break;

            case 7: //a nota estava entr 70 e 79
            ++cCount;
            break;

            case 6: //a nota estava entre 60 e 69
            ++dCount;
            break;

            default: //a nota era menor que 60
            ++eCount;
            break;
        } //fim do switch
    }//fim do metodo incrementLetterGradeCounter

    public void displayGradeReport(){
        System.out.println("\nGrade Report:");

        //se o usuario inseriu pelo menos uma nota
        if (gradeCounter != 0){

            double media = (double) total / gradeCounter;

            //gera a saida de resumo de resultados
            System.out.printf( "Total de %d notas inseridas foi de %d\n", gradeCounter, total);
            System.out.printf("média da classe é %.2f\n", media);
            System.out.printf( "%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
            "Número de estudantes que receberam cada nota:",
            "A: ", aCount, 
            "B: ", bCount,
            "C: ", cCount,// EXIBE AS NOTAS A,B,C,D E E DE ACORDO COM CADA VARIAVEL DE INSTANCIA
            "D: ", dCount,
            "E: ", eCount);
        } //Fim do if
        else
        System.out.println("Nenhuma nota inserida!");
    }// fim do método displayGradeReport
} // fim da classe GradeBook