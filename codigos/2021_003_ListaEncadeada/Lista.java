
public class Lista{
  
  No inicio = null;
  No fim = null;

  public void insere(No n){
    if (inicio == null){
      this.inicio = n;
      this.fim = n;
    }
    else{
      fim.proximo = n;
      fim = n;
    }

  }

  public void imprimeLista(){
    No aux = inicio;
    if (aux == null){
      System.out.println("Lista Vazia");
    }   
    while(aux!=null){
      System.out.println(aux+" Objeto: "+ aux.obj.toString()+ " PROXIMO: " + aux.proximo);
      aux = aux.proximo;
    }

  }

  public void limpaLista(){
    inicio = null;
    fim = null;
    System.out.println("Lista limpa!");
  }

}
