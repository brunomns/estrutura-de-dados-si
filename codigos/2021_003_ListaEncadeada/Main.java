class Main {
  public static void main(String[] args) {

    Lista li = new Lista();

    String a = "A";
    String b = "B";
    String c = "C";

    li.insere(new No(a));
    li.insere(new No(b));
    li.insere(new No("Dado"));
    li.imprimeLista();
    li.insereInicio(new No(c));

    li.insereMeio(new No("meio"), "B");

    li.imprimeLista();
    li.remove("C");
    //li.limpaLista();

    //li.insere(new No(c));
    li.imprimeLista();
    li.remove("Dado");
    li.imprimeLista();
    
    System.out.println(" ---- LISTA de carros----");
    Lista listaCarros = new Lista();

    CarroF1 c1 = new CarroF1();
    c1.cadastra("Mercedes", "Mercedes 1.6 V6", "Pirelli", "Preto", "Hamilton", "Bottas", 650.0f);

    listaCarros.insere(new No(c1));


    CarroF1 c2 = new CarroF1();
    c2.cadastra("Aston Martin", "Mercedes 1.6 V6", "Pirelli", "Verde", "Vettel", "Stroll", 655);

    listaCarros.insere(new No(c2));

    listaCarros.imprimeLista();


  }
}
