/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturasi_vetor;

/**
 *
 * @author bmnso
 */
public class EstruturaSI_Vetor {
    Pessoa vetPessoa[] = new Pessoa[10];
    //ponteiro que armazena a ultima posicao vazia
    int ultimo=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EstruturaSI_Vetor ev = new EstruturaSI_Vetor();
        ev.insere(new Pessoa("Joao",1,"joao@joao.com.br"));
        ev.imprimeLista();
        System.out.println("------- Mais inserções----");
        ev.insere(new Pessoa("Jacque",2,"ja@ja.com"));
        ev.insere(new Pessoa("Marco",3,"marco@ja.com"));
        ev.insere(new Pessoa("Maria",4,"maria@jak.com"));
        ev.imprimeLista();
        
        int pos = ev.busca("Maria");
        System.out.println(" Maria está na posição: "+pos);
        
        System.out.println("Removendo Marco");
        ev.remove("Marco");
        ev.imprimeLista();
        
        
        
    }
    //metodo para cadastrar uma pessoa no vetor
    public void insere(Pessoa p){
        //verifica se a lista nao esta cheia
        if(ultimo < vetPessoa.length){
            vetPessoa[ultimo] = p;
            ultimo++;
        }
        else{
            System.out.println("===Lista cheia!===");
        }
    }
    public void imprimeLista(){
        System.out.println("===Lista===");       
        for (int i = 0; i < ultimo; i++) {
            System.out.println(vetPessoa[i].toString());            
        }
    }
    public int busca(String n){
        for (int i = 0; i < ultimo; i++) {
            if(vetPessoa[i].nome.contains(n)){
              return i;  
            }            
        }
        return -1;
    }
    public void remove (String s){
        //busca a posicao do elemento a ser removido
        int r = busca(s);
        if(r!=-1){
            for(int i=r; i<(ultimo-1);i++){
                //desloca os elementos a partir da posicao
                //a ser removida para uma posicao anterior
                vetPessoa[i] = vetPessoa[i+1];
            }
            System.out.println("Removido...");
            ultimo--;
        }
        else{
            System.out.println("Elemento nao encontrado...");
        }
    }
    
    
}
