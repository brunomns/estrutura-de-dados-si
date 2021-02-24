public class Lista_duplamente {

    No_duplo inicio;
    No_duplo fim;

    //insere no final
    public void insere(No_duplo n){
        if (inicio == null){
            //O endereco do No n sera copiado para o ponteiro inicio
            inicio = n;
            //O endereco do No n sera copiado para o ponteiro fim
            fim = n;
        }
        else{
            //insercao no final
            n.setAnt(fim);
            fim.setProximo(n);
            //atualizo o fim para ser o novo No
            fim = n;
        }
    }

    public void insereInicio(No_duplo n){
        if (inicio == null){
            //O endereco do No n sera copiado para o ponteiro inicio
            inicio = n;
            //O endereco do No n sera copiado para o ponteiro fim
            fim = n;
        }
        else{
            //insercao no final
            n.setProximo(inicio);
            inicio.setAnt(n);
            //atualizo o inicio para ser o novo No
            inicio = n;
        }
    }

    public void insereMeio(No_duplo nIns, char prev){
        if (inicio == null){
            //O endereco do No n sera copiado para o ponteiro inicio
            inicio = nIns;
            //O endereco do No n sera copiado para o ponteiro fim
            fim = nIns;
        }
        else{
            No_duplo aux = inicio;
            while (aux.getChar() != prev){
                aux = aux.getProximo();
                if (aux == null)
                   break;
            }
            if (aux!=null){
                No_duplo proxAux = aux.getProximo();
                proxAux.setAnt(nIns);
                nIns.setAnt(aux);
                aux.setProximo(nIns);
                nIns.setProximo(proxAux);
            }
        }
    }



    public void imprimeLista() {
        System.out.println("------------ IMPRIME LISTA ---------");
        No_duplo aux = inicio;
        while (aux != null) {
            System.out.println(aux.toString());
            aux = aux.getProximo();
        }
    }
}
