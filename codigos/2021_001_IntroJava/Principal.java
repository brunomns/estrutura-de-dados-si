import java.util.Scanner;

/**
 *
 * Implemente um algoritmo em JAVA que possua uma classe Principal e uma classe Aluno. - ok
 *
 * A classe aluno deve ser capaz de armazenar os seguintes dados dos alunos: nome, médiaNotas. - ok
 *
 *
 *
 * O método principal (main()) deverá ser implementado dentro da classe Principal.java. -> ok
 * int main(){
 *
 * }
 *
 * Crie 5 instâncias do objeto aluno dentro do método principal e atribua valores para o nome e a média de notas do aluno.
 * ok
 *
 *
 * Receba dos dados do teclado a informação para preenchimento de 2 alunos (pelo menos).
 *
 * Imprima os dados de cada um dos alunos.
 *
 *
 */

public class Principal {
    public static void main(String[] args) {
        //criando 5 instancias de Objetos do tipo Aluno
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();

        //atribuindo valores para o objeto  do tipo Aluno
        a1.nome = "Luke";
        a1.mediaNotas = 8f;

        a2.nome = "Joao";
        a2.mediaNotas = 8.5f;

        a3.nome = "Joana";
        a3.mediaNotas = 9.5f;

        // abre instancia do teclado para receber os dados digitados pelo usuario
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite o nome do aluno 4");
        //nextLine lê uma string e o "enter"
        a4.nome = tec.nextLine();
        System.out.println("Digite a nota do aluno 4");
        //nextFloat le um numero Real (Float)
        a4.mediaNotas = tec.nextFloat();
        tec.nextLine();

        System.out.println("Digite o nome do aluno 5");
        //nextLine lê uma string e o "enter"
        a5.nome = tec.nextLine();
        System.out.println("Digite a nota do aluno 5");
        //nextFloat le um numero Real (Float)
        a5.mediaNotas = tec.nextFloat();


        System.out.println(" 1 Nome: "+a1.nome+" Media: "+a1.mediaNotas);
        System.out.println(" 2 Nome: "+a2.nome+" Media: "+a2.mediaNotas);
        System.out.println(" 3 Nome: "+a3.nome+" Media: "+a3.mediaNotas);
        System.out.println(" 4 Nome: "+a4.nome+" Media: "+a4.mediaNotas);
        System.out.println(" 5 Nome: "+a5.nome+" Media: "+a5.mediaNotas);

        Aluno alunoPonteiro = a1;
        alunoPonteiro.nome = "Heloisa";
        System.out.println(" 1 Nome: "+a1.nome+" Media: "+a1.mediaNotas);


    }

}
