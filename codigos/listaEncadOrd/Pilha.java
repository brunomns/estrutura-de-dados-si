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
public class Pilha {
    /*    
    Características de uma Pilha    
    Ponteiros: 
        Topo -> Administra o topo da pilha    
    Operacoes
        Insercao (push) -> Insere no topo da pilha
        Remocao (pop) -> Remove do topo da pilha
    */
    static final int TAM = 10;
    int topo = -1;
    
    No pilhaVet[] = new No[TAM];
    
    //insercao na pilha
    public void push(No n){
        if(topo == -1){
            topo = 0;
            pilhaVet[topo] = n;
        }            
        else if((topo+1)<TAM){ 
            //verificar se tem espaço disponivel
            topo = topo+1;
            pilhaVet[topo] = n;
        }
        else{
            System.out.println("====PILHA CHEIA====");            
        }
    }
    
    //remocao da pilha
    public No pop(){
        No temp = null;
        if(topo!=-1){
            temp = pilhaVet[topo];
            pilhaVet[topo]=null;
            topo = topo-1;
        }        
        return temp;
    }
    
}
