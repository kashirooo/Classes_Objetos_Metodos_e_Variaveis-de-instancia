//figura 3.11 do livro
//Com uma nova versao dio livro, anteriormente da imagem 3.8
//Construtor é utilizado para especificar o nome do curso na hora que cada objeto é criado  

public class GradeBookTeste{

    //metodo main inicia a execucao de programa
    public static void main(String[] args){

        //cria um objeto GradeBook 
    GradeBook myGradeBook1 = new GradeBook ("Hamburgueria de Heróis ", null);
    GradeBook myGradeBook2 = new GradeBook ("Esmalteria da Ju ", null);
    GradeBook myGradeBook3 = new GradeBook ("JAVA Teste ", "Paulo"); //Este último foi para fins de teste


    //exibe valor inicial de courseName para cada GradeBook
    System.out.println("O nome da lista de notas 1 é: " + myGradeBook1.getcourseName());
    System.out.println("O nome da lista de notas 2 é: " + myGradeBook2.getcourseName());
    System.out.println("O nome da lista de notas 3 é: " + myGradeBook3.getcourseName());


        
    } //fim da main
}