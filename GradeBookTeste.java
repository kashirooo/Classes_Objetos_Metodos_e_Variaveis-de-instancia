//figura 5.10 do livro
//Com uma nova versao do livro, que utiliza todo o pontecial da classe GradeBook
//e exibe as notas inseridas no relatório de notas

public class GradeBookTeste{

    //metodo main inicia a execução de programa
    public static void main(String[] args){

        int[][] gradesArray = {
            {87, 96 , 70},
            {68, 87 , 90},
            {94, 100 , 90},
            {100, 81 , 82},
            {83, 65 , 85},
            {78, 87 , 65},
            {85, 75 , 83},
            {91, 94 , 100},
            {76, 72 , 84},
            {87, 93 , 73}
        };

        //criando o objeto myGradeBook da classe GradeBook
        //passa o nome do curso para o construtor
        GradeBook myGradeBook = new GradeBook("Introdução ao curso de Java", gradesArray);
        myGradeBook.displayMessage();
        myGradeBook.processGrades();
        
    } //fim da Main
} // fim da classe GradeBookTeste