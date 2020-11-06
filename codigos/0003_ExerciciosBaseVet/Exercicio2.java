import java.util.Scanner;

class Exercicio2 {

  public static float volume_c(float altura, float raio){
      float pi = 3.14159f;
      float area;
      area = pi*altura*raio;
      System.out.println(" O Volume da Lata e: " + area);

      System.out.printf("\n %.2f \n", area);
      return area;
  }

  public static void main (String[] args){
      Scanner tec = new Scanner(System.in);
      float raioL;
      float alturaL;
      
      System.out.println(" Qual o raio da lata: ");
      raioL = tec.nextFloat();
      
      System.out.println(" Qual a altura da lata: ");
      alturaL = tec.nextFloat();

      float area = volume_c(alturaL,raioL);

      System.out.println(" Altura da 2a lata");
      float altura2L = tec.nextFloat();

      float area2 = volume_c(altura2L,raioL);

      
  }


}
