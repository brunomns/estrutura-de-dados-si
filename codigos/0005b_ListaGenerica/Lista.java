public class Lista<T> {

  private T[] items;


  //private T items[];
  //ponteiros prim, ultimo e pos.
  private int primeiro, ultimo, pos;

  // Operacoes lista
  public Lista () {
    this.items = (T[]) new Comparable[1000];
    this.pos = -1;
    this.primeiro = 0;
    this.ultimo = this.primeiro;
  }

  public Lista (int maxTam) {
    this.items = (T[]) new Comparable[maxTam];
    this.pos = -1;
    this.primeiro = 0;
    this.ultimo = this.primeiro;
  }

  public T pesquisa (T chave) {
    if (this.vazia () || chave == null) return null;
    for (int p = 0; p < this.ultimo; p++)
      if (this.items[p].equals (chave)) {
        System.out.println("items localizado na posicao: "+p);
        return this.items[p];
      }
    return null;
  }

  public void insere (T x) throws Exception {
    if (this.ultimo >= this.items.length)
      throw new Exception ("Erro: A lista esta cheia");
    else {
      this.items[this.ultimo] = x;
      this.ultimo = this.ultimo + 1; }
  }

  public T retira (T chave) throws Exception { 
    if (this.vazia () || chave == null)
      throw new Exception ("Erro : A lista esta vazia");
    int p = 0;
    while (p < this.ultimo && !this.items[p].equals (chave))
      p++;
    if (p >= this.ultimo)
      return null; // chave nao encontrada

    T items = this.items[p];
    this.ultimo = this.ultimo - 1;

    for (int aux = p; aux < this.ultimo; aux++)
      this.items[aux] = this.items[aux + 1];
    return items;
  }

  public T retiraPrimeiro () throws Exception {
    if (this.vazia ())
      throw new Exception ("Erro : A lista esta vazia");
    T items = this.items[0];
    this.ultimo = this.ultimo - 1;
    for (int aux = 0; aux < this.ultimo; aux++)
      this.items[aux] = this.items[aux + 1];
    System.out.println("Elemento primeiro removido!");
    return items;
  }

  public boolean vazia () {
    return (this.primeiro == this.ultimo);
  }

  public void imprime () {
    for (int aux = this.primeiro; aux < this.ultimo; aux++)
      System.out.println ("items "+aux+" : "+this.items[aux].toString ());
  }


  public T primeiro () {
    this.pos = -1;
    return this.proximo ();
  }

  public T proximo () {
    this.pos++;
    if (this.pos >= this.ultimo)
      return null;
    else
      return this.items[this.pos];
  }

}
