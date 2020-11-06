class Main {
  public static void main(String[] args) {
    System.out.println("Copia de vetores");

    int vet1[] = {1,2,3,4,5,6,7,8,9,10};

    int vet2[] = new int[vet1.length];

    for(int i=0; i < vet1.length; i++){
        vet2[i] = vet1[i];

        System.out.println(" Elemento i: "+i+" valor: "+vet2[i]);
    }


  }
}
