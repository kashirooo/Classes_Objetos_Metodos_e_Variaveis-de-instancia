//Figura 3.7 do livro
//Com uma nova versão agora, anteriormente com a imagem 3.4
//adiciona vários métodos a classe tambem uma variável de instância com um modificador de acesso (private).

public class GradeBook{

    private String courseName; // nome do curso para esse GradeBook

    //metodo para configurar o nome do curso
    public void setcourseName (String name){

        courseName = name; // armazena o nome do curso
    }// fim do metodo setCourseName

    //metodo para recuperar o nome do curso
    public String getcourseName(){

        return courseName;
    }// fim do metodo getcourseName

    //exibe uma mensagem de boas vindas para o usuario GradeBook
    public void displayMessage(){

        //chama getcourseName para obter o nome do curso que essa GradeBook representa
        System.out.println("Bem vindo ao Livro de notas do " + getcourseName());
    }//fim do metodo displayMessage
}