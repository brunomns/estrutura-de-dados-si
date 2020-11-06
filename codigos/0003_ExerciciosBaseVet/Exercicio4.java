class Main {
  public static void main(String[] args) {
    System.out.println("Ler vetor 20 posicoes");

    //1 2 3 4 5 6
    //6 5 4 3 2 1
    int vet[] = new int[20];
    for (int i=0; i<vet.length; i++){
      vet[i] = i*2;
      System.out.println("pos i: "+i+ " valor: "+vet[i]);
    }

    int vet2[] = new int[vet.length];

    int ultpos = vet.length - 1;
    System.out.println("--- VETOR INVERTIDO ---");
    for (int j=0; j<vet.length;j++){        
       vet2[j] = vet[ultpos - j];
       System.out.println("pos j: "+j+ " valor: "+vet2[j]);
    }

  }
}
