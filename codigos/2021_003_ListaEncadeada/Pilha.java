public class Pilha{
    //ponteiro que indica o topo da pilha;
    No topo;

    //empilha / insere
    public void push (No newNode){
      if (topo == null){
          //pilha vazia
          topo = newNode;
      }
      else{
        //inserir logo após o topo 
        //atualizar o ponteiro topo
        newNode.proximo = topo;
        topo = newNode;

      }
    }

    //desempilha / remove
    public No pop(){
      //remove do topo
      if (topo!=null){
        No aux = topo;
        topo = aux.proximo;
        aux.proximo = null;
        return aux;
      }
      else
        return null;
    }

    public void imprimePilha(){
      No aux = topo;
      System.out.println("---Imprimindo a PILHA---");
      while (aux!=null){
        System.out.println(aux.toString());
        aux = aux.proximo;
      }
    }

  
}
