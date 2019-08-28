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
public class Fila {
    /*    
    Características de uma Fila    
    Ponteiros: 
        primeiro -> Administra o inicio da fila
        ultimo -> Administra o final da fila
    Operacoes
        Insercao  -> Insere na ultima posição da fila
        Remocao -> Remove do inicio da fila
    */
    static final int TAM = 10;
    int primeiro = -1;
    int ultimo = -1;
    
    No filaVet[] = new No[TAM];
    
    //insercao na fila
    public void insere(No n){
        if(ultimo == -1){
            ultimo = 0;
            primeiro = 0;
            filaVet[ultimo] = n;
        }            
        else if((ultimo+1)<TAM){ 
            //verificar se tem espaço disponivel
            ultimo = ultimo+1;
            filaVet[ultimo] = n;
        }
        else{
            System.out.println("====FILA CHEIA====");            
        }
    }
    
    //remocao da fila
    public No remove(){
        //remove no inicio da fila
        No temp = null;
        if(primeiro!=-1){
            temp = filaVet[primeiro];
            for (int i = primeiro; i < ultimo; i++) {
                //desloca os elementos da fila
                filaVet[i] = filaVet[i+1];                
            }
            //diminui o numero de elementos da fila
            ultimo = ultimo-1;
        }
        
        return temp;
    }
}
