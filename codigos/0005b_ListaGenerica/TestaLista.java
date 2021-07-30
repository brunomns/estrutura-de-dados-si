public class TestaLista {

  public static void main (String[] args) {

    Lista<Integer> lista = new Lista<Integer>(100);
    Integer vetor[] = new Integer[100];
    Integer n = null;

    int i, j, k, max;

    java.util.Random random = new java.util.Random();
    max = 10;
    try {
      // Gera uma permutacao aleatoria de chaves entre 0 e max - 1
      for (i = 0; i < max; i++)
        vetor[i] = i;
      for (i = 0; i < max; i++) {
        k = Math.abs(random.nextInt()) % max;
        j = Math.abs(random.nextInt()) % max;
        n = vetor[k];
        vetor[k] = vetor[j];
        vetor[j] = n;
      }
      // Insere cada chave na lista
      for (i = 0; i < max; i++) {
        lista.insere(vetor[i]);
        System.out.println("Inseriu " + vetor[i].toString());
      }
      lista.imprime();
      // Pesquisa cada chave da lista
      for (i = 0; i < max; i++) {
        System.out.println("Pesquisando pelo valor: "+vetor[i]);
        n = (Integer) lista.pesquisa(vetor[i]);
        System.out.println("Item: " + n.toString());
      }
      // Pesquisa sem sucesso
      int ch = 100;
      Object item = lista.pesquisa(ch);
      if (item == null)
        System.out.println("Item "+ch+" nao encontrado");
      // Retira cada chave da lista
      for (i = 0; i < max-2; i++) {
        n = (Integer) lista.retira(vetor[i]);
        System.out.println("Retirou: " + n.toString());
      }
      lista.imprime();
      n = (Integer) lista.retiraPrimeiro();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    lista.imprime();
  }
}
