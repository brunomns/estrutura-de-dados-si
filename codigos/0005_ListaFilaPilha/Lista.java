public class Lista {

    static Pessoa lista[] = new Pessoa[5];
    static int fim = -1;

    //insercao no final da lista
    public void cadastra(Pessoa p){
        //insere no vetor
        if (fim == -1 || fim < (lista.length-1)){
            //vetor vazio
            fim++;
            lista[fim] = p;
        }
    }

    //imprime lista
    public void imprimeVet(){
        System.out.println("-----IMPRIME LISTA-------");
        for (int i = 0; i <= fim; i++) {
            System.out.println(" Pos: "+i+ " Elemento: "+ lista[i].toString());
        }
    }

    //busca na lista
    public int busca(String nome){
        for (int i = 0; i <= fim ; i++) {
            if (lista[i].nome.contains(nome)){
                return i;
            }
        }
        return -1;
    }

    //remove
    public Pessoa remove(String n){
        int r = busca(n);
        Pessoa aux = lista[r];
        for (int i = r; i < fim ; i++) {
            lista[i] = lista[i+1];
        }
        lista[fim] = null;
        fim--;
        return aux;
    }
}
