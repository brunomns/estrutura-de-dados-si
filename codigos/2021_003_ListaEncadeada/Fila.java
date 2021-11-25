public class Fila{

  No inicio;
  No fim;

  //insere no fim
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


  //remove no inicio
  public No remove(){
    if (inicio!=null){
      No remover = inicio;
      inicio = inicio.proximo;
      remover.proximo = null;
      return remover;
    }
    else
      return null;
  }

  public void imprimeFila(){
      No aux = inicio;
      System.out.println("---Imprimindo a FILA---");
      while (aux!=null){
        System.out.println(aux.toString());
        aux = aux.proximo;
      }
    }
}
