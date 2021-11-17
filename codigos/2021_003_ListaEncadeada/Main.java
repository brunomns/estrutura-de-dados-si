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


  }
}
