
public class Lista{
  
  No inicio = null;
  No fim = null;

  //insercao no final da lista
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


//insercao no inicio da lista
  public void insereInicio(No n){
    if (inicio == null){
      this.inicio = n;
      this.fim = n;
    }
    else{
      n.proximo = inicio;
      inicio = n;
    }

  }

  //insercao no meio da estrutura
  //apos objeto que contenha a String
  public void insereMeio(No n, String apos){
    //realizar a busca do elemento que sera anterior
    // ao novo elemento n;
    No anterior = this.busca(apos);
    if (inicio == null){
      this.inicio = n;
      this.fim = n;
    }
    else{
      n.proximo = anterior.proximo;
      anterior.proximo = n;
      if (anterior == fim){
          fim = n;
      }
    }

  }


  public void imprimeLista(){
    No aux = inicio;
    System.out.println("=== Imprimindo Lista ===");
    if (aux == null){
      System.out.println("Lista Vazia");
    }   
    
    while(aux!=null){
      System.out.println(" Objeto: "+ aux.toString()+ " PROXIMO: " + aux.proximo);
      aux = aux.proximo;
    }

  }

   public No busca(String search){
    No aux = inicio;
    if (aux == null){
      System.out.println("Lista Vazia");
    }   
    while(aux!=null){
      //System.out.println(aux+" Objeto: "+ aux.obj.toString()+ " PROXIMO: " + aux.proximo);
      if (aux.toString().contains(search)){
        return aux;
      }
      aux = aux.proximo;
    }
    System.out.println("Elemento nao encontrado : "+search);
    return null;

  } 


  public No buscaAnterior(String search){
    No aux = inicio;
    if (aux == null){
      System.out.println("Lista Vazia");
    }   
    while(aux!=null){
      //System.out.println(aux+" Objeto: "+ aux.obj.toString()+ " PROXIMO: " + aux.proximo);
      if (aux.proximo.toString().contains(search)){
        return aux;
      }
      aux = aux.proximo;
    }
    System.out.println("Elemento nao encontrado : "+search);
    return null;

  } 

  public void remove(String remover){
    No rem = this.busca(remover);
    if (rem == inicio && rem == fim){
      //so tem um elemento na lista
      inicio = null;
      fim = null;
      System.out.println("Lista Limpa");
    }
    else if(rem ==inicio){
      No proxR = rem.proximo;
      inicio = proxR;
      rem.proximo = null;
      rem = null;
      System.out.println("Elemento removido inicio");
    }
    else if (rem==fim){
      No antR = buscaAnterior(remover);
      antR.proximo = null;
      fim = antR;
      rem = null;
      System.out.println("Elemento removido final");
    }
    else{
      No antR = buscaAnterior(remover);
      No proxR = rem.proximo;
      antR.proximo = proxR;
      rem.proximo = null;
      rem = null;
      System.out.println("Elemento removido");
    }

  }

  public void limpaLista(){
    inicio = null;
    fim = null;
    System.out.println("Lista limpa!");
  }

}
