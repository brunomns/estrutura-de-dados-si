public class Fila {

    static Pessoa fila[] = new Pessoa[5];
    static int fim = -1;
    static int inicio = -1;

    //insercao no final da fila
    public void insere(Pessoa p){
        //insere no vetor
        if(inicio==-1)
            inicio=0;
        if (fim == -1 || fim < (fila.length-1)){
            //vetor vazio
            fim++;
            fila[fim] = p;
        }
    }

    //imprime fila
    public void imprimeVet(){
        System.out.println("-----IMPRIME fila-------");
        for (int i = 0; i <= fim; i++) {
            System.out.println(" Pos: "+i+ " Elemento: "+ fila[i].toString());
        }
    }


    //remove do inicio
    public Pessoa remove(){
        int r = inicio;
        Pessoa aux = fila[r];
        for(int i = r; i < fim ; i++) {
            fila[i] = fila[i+1];
        }
        fila[fim] = null;
        fim--;
        return aux;
    }
}
