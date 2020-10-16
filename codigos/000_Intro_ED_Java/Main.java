class Main {

  //método para somar dois elementos inteiros
  public static int somar(int va, int vb){
    return va+vb;
  }
  
  public static void main(String[] args) {
    System.out.println("Olá Estrutura de Dados!");

    int a=10;
    int b=20;    
    
    int s = somar(a,b);
    

    System.out.println("A soma e: "+ s);

    s = somar(s,b);
    System.out.println("A soma e: "+ s);

    s = somar(s,A);
    System.out.println("A soma e: "+ s);
  }

}
