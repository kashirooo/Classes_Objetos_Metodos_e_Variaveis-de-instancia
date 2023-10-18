//figura 5.10 do livro
//Com uma nova versao do livro, que utiliza todo o pontecial da classe GradeBook
//e exibe as notas inseridas no relatório de notas

public class GradeBookTeste{

    //metodo main inicia a execução de programa
    public static void main(String[] args){

        //criando o objeto myGradeBook da classe GradeBook
        //passa o nome do curso para o construtor
        GradeBook myGradeBook = new GradeBook("Introdução ao Programa Java!!");

        myGradeBook.displayMessage();
        myGradeBook.inputGrades();
        myGradeBook.displayGradeReport();
        
    } //fim da Main
} // fim da classe GradeBookTeste