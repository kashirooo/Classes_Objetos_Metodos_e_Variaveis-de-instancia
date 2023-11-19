//figura 5.10 do livro
//Com uma nova versao do livro, que utiliza todo o pontecial da classe GradeBook
//e exibe as notas inseridas no relatório de notas

public class GradeBookTeste{

    //metodo main inicia a execução de programa
    public static void main(String[] args){

        int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        //criando o objeto myGradeBook da classe GradeBook
        //passa o nome do curso para o construtor
        GradeBook myGradeBook = new GradeBook("Introdução ao curso de Java", gradesArray);
        myGradeBook.displayMessage();
        myGradeBook.processGrades();
        
    } //fim da Main
} // fim da classe GradeBookTeste