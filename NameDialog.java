// figura 3.18 do livro 
//entrada básica com caixa de dialogo
import javax.swing.JOptionPane;

public class NameDialog{

    public static void main(String[] args){

        //solicita ao usuario inserir seu nome
        String name = JOptionPane.showInputDialog("Qual é o seu nome ?");

        //Cria a mensagem 
        String message = String.format("bem vindo, %s , a Linguagem JAVA", name);

        //exibe a mensagem para cumprimentar o usuário pelo nome
        JOptionPane.showMessageDialog(null, message);
        }// fim da main
}