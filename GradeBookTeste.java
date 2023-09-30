//figura 3.8 do livro
//Com uma nova versao dio livro, anteriormente da imagem 3.5
//Criando e manipulando um objeto GradeBook.
import java.util.Scanner;

public class GradeBookTeste{

    //metodo main inicia a execucao de programa
    public static void main(String[] args){

        //cria Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        //cria um objeto GradeBook e o atribui a myGradeBook
        GradeBook myGradeBook = new GradeBook();

        //exibe valor inicial de courseName
        System.out.println("o nome do curso inicialmente é: " + myGradeBook.getcourseName());

        //solicita e lê o nome do curso 
        System.out.println("por favor entre com o nome do curso: ");
        String theName = input.nextLine(); //lê uma linha de texto.
        myGradeBook.setcourseName(theName); // configura o nome do curso
        System.out.println(); //gera saida de uma linha em branco
        // exibe uma mensagem de boas vindas, após especificar o nome do curso
        myGradeBook.displayMessage();
    } //fim da main
}