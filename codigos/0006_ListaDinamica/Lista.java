public class Lista {
    
    No inicio;
    No fim;
    
    public void insere(No n){
        if (inicio == null){
            //O endereco do No n sera copiado para o ponteiro inicio
            inicio = n;
            //O endereco do No n sera copiado para o ponteiro fim
            fim = n;
        }
        else{
            //insercao no final
            fim.setProximo(n);
            //atualizo o fim para ser o novo No
            fim = n;
        }
    }

    public void imprimeLista(){
        System.out.println("------------ IMPRIME LISTA ---------");
        No aux = inicio;
        while (aux!=null){
            System.out.println(aux.toString());
            aux = aux.getProximo();
        }
    }
    
    
}
