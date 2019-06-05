/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaencadord;

/**
 *
 * @author bmnso
 */
public class ListaOrd {
    private int primeiro = -1;
    private int ultimo = -1;
    //definicao de uma constante
    private final int TAM=10;
    
    //Declara a estrutura lista do tipo No
    No listaOrd[] = new No[TAM];
    
    public void insere(No n){
        if(primeiro == -1){
            //lista vazia...inserir
            primeiro = 0;
            ultimo = 0;
            listaOrd[primeiro] = n;
        }
        else if((ultimo+1)<TAM){
            //insere na lista...            
            int posIns = -1;
            //localizar posição de inserção...
            for (int i = primeiro; i <= ultimo; i++) {
                if(listaOrd[i].toString().compareTo(n.toString()) > 0){
                    posIns = i;
                    break; //força a saída do FOR!
                }                
            }
            if( posIns == -1) 
                posIns = ultimo+1;
            
            for (int i = ultimo; i >= posIns; i--) {
                listaOrd[i+1] = listaOrd[i];                
            }
            //insere na posição de inserção o elemento novo
            listaOrd[posIns] = n;
            //atualiza ponteiro ultimo
            ultimo = ultimo +1;
            System.out.println("===Inserido com sucesso!===");
        }
        else
            System.out.println("===Lista cheia===");        
    }
    public void imprimeLista(){
        if(primeiro!=-1){
            System.out.println("=== IMPRIME LISTA ===");
            for (int i = primeiro; i <= ultimo; i++) {
                System.out.println(i+" : "+listaOrd[i].toString());            
            }
        }
        else
            System.out.println("== LISTA VAZIA ==");
    }
    public int busca(String b){
        System.out.println("==BUSCA==");
        for (int i = primeiro; i <= ultimo; i++) {
            if(listaOrd[i].toString().contains(b))
                return i;            
        }
        return -1;
    }
    public void remove(String rem){
        System.out.println("==Remocao==");
        int posRem = busca(rem);
        //desloca os elementos uma posicao anterior
        if(posRem!=-1){
            for (int i = posRem; i < ultimo; i++) {
                listaOrd[i] = listaOrd[i+1];                
            }
            ultimo = ultimo - 1;
        }
    }
    public void limpalista(){
        System.out.println("===Limpando a lista===");
        primeiro = -1;
        ultimo = -1;
    }
    
}
