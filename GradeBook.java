//Figura 5.9 do livro
//Com uma nova versão agora do Switch Case
//introduzindo o conteudo   


public class GradeBook{

    private String courseName; // nome do curso para esse GradeBook
    private int[] grades; // array de notas de aluno

    //construtor de dois argumentos inicializa courseName e o array de Notas
    public GradeBook(String name, int[] gradesArray){

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


        // chama método getAvarage para definir a nota média
        System.out.printf("\nMédia de notas da Classe é %.2f\n", getAvarage());

        // chama métodos getMinimum e getMaximum
        System.out.printf("A nota mais baixa é: %d\nA nota mais alta é: %d\n\n", getMinimum(),getMaximum());

        // chama outputBarChart para imprimir gráfico de distribuição de notas
        outputBarChart();

    } // fim do metodo processGrades

    // localiza a nota minima
    public int getMinimum(){
        int lowGrade = grades[0]; //assume que grades é [0] é a menor nota

        // faz um loop pelo array de notas
        for (int grade : grades){
            // se nota for mais baixa que lowGrade, essa nota é atribuída a lowGrade
            if (grade < lowGrade)
            lowGrade = grade; // nova nota mais baixa
        } // fim do for

        return lowGrade;
    } // fim do método getMinimum

    public int getMaximum(){

        int highGrade = grades [0]; // assume que grades é [0] é a maior nota

        // faz um loop pelo array de notas
        for (int grade : grades){
            // se a nota for mais alta que highGrade, essa nota é atribuída a highGrade
            if (grade > highGrade)
            highGrade = grade;
        } // fim do for

        return highGrade;

    } // fim do método getMaximum

    //  determina média para o teste
    public double getAvarage(){

        int total = 0; // inicializa o total

        // soma as notas do aluno
        for (int grade : grades)
        total += grade;

        // retorna a média de notas
        return (double) total / grades.length;

    } // fim do método getAvarage

    public void outputBarChart(){
        System.out.println("Distribuição de Notas");

        // armazena frequência de notas em cada intervalo de 10 notas
        int[] frequency = new int[11];

        // para cada nota, incrementa a frequência apropriada
        for (int grade : grades)
        ++frequency[grade /10];

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

        System.err.println("As notas são:\n");

        // gera a saída de nota de cada aluno
        for (int student = 0; student < grades.length; student++)
        System.out.printf("Estudante %2d: %3d\n", student + 1, grades [student]);
    } // fim do método outpuGrades

} // fim da classe GradeBook