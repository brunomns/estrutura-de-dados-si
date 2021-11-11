class Main {
  public static void main(String[] args) {

    
    Lista li = new Lista();


    String a = "A";
    String b = "B";
    String c = "C";

    li.insere(new No(a));
    li.insere(new No(b));
    li.insere(new No("Dado"));
    li.insere(new No(c));
    
    li.imprimeLista();
    li.limpaLista();

    li.insere(new No(c));
    li.imprimeLista();
  }
}
