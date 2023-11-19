//Figura 5.9 do livro
//Com uma nova versão agora do Switch Case
//introduzindo o conteudo   


public class GradeBook{

    private String courseName; // nome do curso para esse GradeBook
    private int[][] grades; // array bidimensional de notas de aluno

    //construtor de dois argumentos inicializa courseName e o array de Notas
    public GradeBook(String name, int[][] gradesArray){

        courseName = name; // inicializa courseName
        grades = gradesArray; // niveis de armazenamento
    }// fim do construtor de dois argumentos

    //método para configurar o nome do curso
    public void setCourseName(String name){

        courseName = name; //armazena o nome do curso

    } // fim do método setcourseName

    //metodo para recuperar o nome do curso
    public String getCourseName(){

        return courseName;

    }// fim do metodo getcourseName

    //exibe uma mensagem de boas vindas para o usuario GradeBook
    public void displayMessage(){

        //chama getcourseName para obter o nome do curso que essa GradeBook representa
        System.out.println("Bem vindo ao Livro de notas do " + getCourseName());
    }//fim do metodo displayMessage

    //realiza váras operações nos dados
    public void processGrades(){

        //gera saída de array de notas
        outputGrades();

        // chama métodos getMinimum e getMaximum
        System.out.printf(  "\n%s %d\n%s %d\n\n",
        "A nota mais baixa é: \n", getMinimum(),
        "A nota mais alta é: \n\n",getMaximum());

        // chama outputBarChart para imprimir gráfico de distribuição de notas
        outputBarChart();

    } // fim do metodo processGrades

    // localiza a nota minima
    public int getMinimum(){
        int lowGrade = grades[0][0]; //assume que grades é [0] é a menor nota

        // faz um loop pelas linhas do array de notas
        for (int[] studentsGrades : grades){
            
            // faz um loop pelas colunas da linha atual
            for (int grade : studentsGrades){
                // se a nota for menor que lowGrade, atribui a nota a lowGrade
                if ( grade < lowGrade)
                    lowGrade = grade;
            } // fim do for interno
        } // fim do for

        return lowGrade; //retorna nota mais baixa
    } // fim do método getMinimum

    public int getMaximum(){

        int highGrade = grades [0][0]; // assume que grades é [0] é a maior nota

        // faz um loop pelas linhas do array de notas
        for (int[] studentsGrades : grades){
            
            // faz um loop pelas colunas da linha atual
            for (int grade : studentsGrades){
                // se a nota for menor que highGrade, atribui a nota a highGrade
                if ( grade > highGrade)
                    highGrade = grade;
            } // fim do for interno
        } // fim do for

        return highGrade; // retorna a nota mais alta

    } // fim do método getMaximum

    //  determina média do conjunto particular de notas
    public double getAvarage(int[]setOfGrades){

        int total = 0; // inicializa o total

        // soma as notas do aluno
        for (int grade : setOfGrades)
        total += grade;

        // retorna a média de notas
        return (double) total / setOfGrades.length;

    } // fim do método getAvarage

    public void outputBarChart(){
        System.out.println("Distribuição de Notas");

        // armazena frequência de notas em cada intervalo de 10 notas
        int[] frequency = new int[11];

        // para cada nota no GradeBook, incrementa a frequência certa
        for (int[] studentsGrades : grades){
            for(int grade : studentsGrades)
            ++frequency [grade / 10];
        } //fim do for externo

        // para cada frequência de nota, imprime barra no gráfico
        for (int count = 0; count < frequency.length; count++){
            // imprime rótulo de barra ("00-09: ", ..., "90-99: ", "100")
            if(count == 10)
             System.out.printf("%5d: ", 100);
            else
             System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);

            //  imprime a barra de asteristicos
            for ( int stars = 0; stars < frequency[count]; stars++)
                System.out.print("*");

            System.out.println(); // inicia uma nova linha de saída
        } // fim do for
    } // fim do método outputBarChart

    // gera a saída do conteúdo do array de notas
    public void outputGrades(){

        System.out.println("As notas são:\n");
        System.out.print("              "); // alinha títulos de coluna

        // cria um titulo de coluna para cada um dos teste
        for (int test = 0; test < grades[0].length; test++)
         System.out.printf("Teste %d  ", test + 1);
         System.out.println("Média"); // título da coluna de média do aluno

        // cria linhas/colunas de testo que representam notas de array
        for (int student = 0; student < grades.length; student++){
            System.out.printf("Estudante %2d", student +1);

            for (int test : grades [student]) // gera saida de notas do aluno
             System.out.printf("%8d", test);
             
             /**
              * chama método getAvarage para calcular a média do aluno
              * passa a linha  de notas como o argumento para getAvarage
              */
              double avarage = getAvarage(grades[student]);
              System.out.printf("%9.2f\n", avarage);
            } // fim do for externo
    } // fim do método outpuGrades

} // fim da classe GradeBook