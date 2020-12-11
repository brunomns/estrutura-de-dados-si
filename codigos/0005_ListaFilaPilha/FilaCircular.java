public class FilaCircular {

        static Pessoa fila[] = new Pessoa[5];
        static int fim = -1;
        static int inicio = -1;


        public int proximo(int pont){
            if (pont+1 == fila.length){
                return 0;
            }
            else
                return pont+1;
        }

        //insercao no final da fila
        public void insere(Pessoa p){
            int proxFim = proximo(fim);
            if (fila[proxFim] == null) {
                //insere no vetor

                if (inicio == -1)
                    inicio = 0;
                fim = proxFim;
                fila[fim] = p;
            }
            else{
                System.out.println("Fila cheia...");
            }
        }

        //imprime fila
        public void imprimeVet(){
            System.out.println("-----IMPRIME fila-------");
            int p_aux = inicio;
            if(inicio!=fim) {
                while (p_aux != fim) {
                    System.out.println(" Pos: " + p_aux + " Elemento: " + fila[p_aux].toString());
                    p_aux = proximo(p_aux);
                }
                System.out.println(" Pos: " + p_aux + " Elemento: " + fila[p_aux].toString());
            }
            else if (inicio!=-1){
                System.out.println(" Pos: " + p_aux + " Elemento: " + fila[p_aux].toString());
            }
            else{
                System.out.println("Fila vazia...");
            }
        }


        //remove do inicio
        public Pessoa remove(){

            int r = inicio;
            Pessoa aux = fila[r];
            fila[r] = null;
            inicio = proximo(inicio);
            System.out.println("Removendo... "+aux.toString());
            return aux;
        }




}
