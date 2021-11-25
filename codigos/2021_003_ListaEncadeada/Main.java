class Main {
  
  
  public static void main(String[] args) {
    System.out.println("Hello world!");

    int vetor1[] = new int[10];
    int vetor2[] = new int[10];

    for(int i=0; i<vetor1.length; i++){
      vetor1[i] = i*7;      
      System.out.print(vetor1[i]+" | ");
    }
    System.out.println();

    for(int i=0; i<vetor1.length; i++){
      vetor2[i] = vetor1[i];
      System.out.print(vetor2[i]+ " | ");
    }
    System.out.println();

  int cont = 0;
  for(int i=(vetor2.length-1); i>=0; i--){      
      vetor2[i] = vetor1[cont];
      //System.out.print(vetor1[cont]+ " | ");
      cont++;      
    }
    //System.out.println();
  for(int i=0; i<vetor2.length; i++){      
      System.out.print(vetor2[i]+ " | ");
  }
  System.out.println();
  
  System.out.println(" ---- LISTA----");
  Lista listaCarros = new Lista();

  CarroF1 c1 = new CarroF1();
  c1.cadastra("Mercedes", "Mercedes 1.6 V6", "Pirelli", "Preto", "Hamilton", "Bottas", 650.0f);

  listaCarros.insere(new No(c1));


  CarroF1 c2 = new CarroF1();
  c2.cadastra("Aston Martin", "Mercedes 1.6 V6", "Pirelli", "Verde", "Vettel", "Stroll", 655);

  listaCarros.insere(new No(c2));

  listaCarros.imprimeLista();



  System.out.println(" ---- FILA----");
  Fila filaCarros = new Fila();
  filaCarros.insere(new No(c1));
  filaCarros.insere(new No(c2));
  filaCarros.imprimeFila();
  filaCarros.remove();
  filaCarros.imprimeFila();


  System.out.println(" ---- PILHA----");
  Pilha pilhaCarros = new Pilha();
  pilhaCarros.push(new No(c1));
  pilhaCarros.push(new No(c2));
  pilhaCarros.imprimePilha();
  pilhaCarros.pop();
  pilhaCarros.imprimePilha();
  }


  


  


}
