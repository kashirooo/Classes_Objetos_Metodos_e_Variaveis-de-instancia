//figura 3.5 do livro
//Com uma nova versao dio livro, anteriormente da imagem 3.2
//Cria um objeto GradeBook e passa uma String para seu metodo displayMessage.
import java.util.Scanner;

public class GradeBookTeste{

    //metodo main inicia a execucao de programa
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        //cria um objeto GradeBook e o atribui a myGradeBook
        GradeBook myGradeBook = new GradeBook();

        //Prompt para a entrada do nome do curso
        System.out.print("Por favor, entre com o nome do Curso: ");
        String nameOfCourse = input.nextLine(); // le uma linha de texto
        System.out.println(); // gera saida de uma linha de texto

        //chama metodo displayMessage de myGradeBook
        //e passa nameOfCourse como um argumento
        myGradeBook.displayMessage(nameOfCourse);
    } //fim da main
}