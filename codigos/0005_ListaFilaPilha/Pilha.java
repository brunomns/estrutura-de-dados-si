public class Pilha {
    
    //Last in First Out - O Ultimo a entrar e o primeiro a sair

    static Pessoa pilha[] = new Pessoa[5];
    static int topo = -1;

    //insercao no topo da pilha
    public void empilha(Pessoa p){
        //insere no vetor
        if (topo == -1 || topo < (pilha.length-1)){
            //vetor vazio
            topo++;
            pilha[topo] = p;
        }
    }

    //imprime pilha
    public void imprimePilha(){
        System.out.println("-----IMPRIME Pilha-------");
        for (int i = 0; i <= topo; i++) {
            System.out.println(" Pos: "+i+ " Elemento: "+ pilha[i].toString());
        }
    }

    //remove do topo da pilha
    public Pessoa desempilha(){
        int r = topo;
        Pessoa aux = pilha[r];
        pilha[topo] = null;
        topo--;
        return aux;
    }
}
