//Figura 3.10 do livro
//Com uma nova versão agora, anteriormente com a imagem 3.7
//cria agora um objeto com construtor

public class GradeBook{

    private String courseName; // nome do curso para esse GradeBook
    private String instructor; // mais uma variavel de instancia para teste

    //o construtor inicializa courseName com o argumento String
    //aumentando o parametro para fins de teste
    public GradeBook(String name, String instructorName){

        courseName = name; // inicializa courseName
        instructor = instructorName;
    }// fim do construtor

    //método para configurar o nome do curso
    public void setcourseName(String name){
        courseName = name; //armazena o nome do curso
        
    } // fim do método setcourseName

    //metodo para recuperar o nome do curso
    //continuando com o teste adicionando mais um return (o que sem a documentação me deu um trabalhao)
    public String getcourseName(){

        return courseName + instructor;

    }// fim do metodo getcourseName

    //exibe uma mensagem de boas vindas para o usuario GradeBook
    public void displayMessage(){

        //chama getcourseName para obter o nome do curso que essa GradeBook representa
        System.out.println("Bem vindo ao Livro de notas do " + getcourseName());
    }//fim do metodo displayMessage
}