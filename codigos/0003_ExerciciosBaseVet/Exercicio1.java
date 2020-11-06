import java.util.Scanner;
class Exercicio1 {
  //public static void main(String[] args) {
    public void teste(){
    System.out.println("Exercicio 1 - Diferença");

    int idadeP =0;
    int idadePai =0;
    int idadeMae =0;

    Scanner tec = new Scanner(System.in);

    System.out.println(" Qual o seu ano de nascimento: ");
    idadeP = tec.nextInt();

    System.out.println(" Qual o seu ano de nascimento do seu Pai: ");
    idadePai = tec.nextInt();

    System.out.println(" Qual o seu ano de nascimento da sua mae: ");
    idadeMae = tec.nextInt();

    int diffP_pai = idadeP - idadePai;
    int diffP_mae = idadeP -idadeMae;

    int diffPai_mae = idadeMae - idadePai;
    
    if (diffPai_mae < 0){
      diffPai_mae = diffPai_mae*(-1); 
    }

    System.out.println("Diff pai e pessoa = "+diffP_pai);
    System.out.println("Diff mae e pessoa = "+diffP_mae);
    System.out.println("Diff pai e mae = "+diffPai_mae);

  }
}
