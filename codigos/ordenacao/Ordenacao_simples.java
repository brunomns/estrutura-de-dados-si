/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacao_simples;

/**
 * Métodos de ordenacao simples, ordenando vetores de inteiros gerados de forma aleatória
 * @author bmnso
 */
public class Ordenacao_simples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here     
        int max = 150000; 
        int min = 1; 
        int range = max - min + 1; 
        int tamVet = 10;
        
        int vet[] = new int[tamVet];
        
        for (int i = 0; i < tamVet; i++) {
            vet[i] = (int)(Math.random() * range) + min;            
        }  
        for (int i = 0; i < tamVet ; i++) {
             vet[i] = tamVet -i;            
        }
        imprimeVet(vet);
        Ordenacao_simples ordena = new Ordenacao_simples();
        //vet = ordena.bublesort(vet);
        //vet = ordena.selectionSort(vet);
        vet = ordena.insertionSort(vet);
    }
    public static void imprimeVet(int vet[]){
        System.out.println("");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(""+vet[i]+"|");            
        }        
    }
    public int[] bublesort(int vet[]){
        System.out.println("\n ...Buble Sort...");
        //inicia da ultima posicao ate a segunda...
        int tam = vet.length;
        int numeroTrocas = 0;
        for (int out = (tam-1); out > 0; out--) {
            for (int in = 0; in < out; in++) {
                if(vet[in]>vet[in+1]){
                    //realiza a troca de lugar entre os elementos
                    int temp = vet[in];
                    vet[in] = vet[in+1];
                    vet[in+1] = temp;
                    imprimeVet(vet);
                    numeroTrocas++;
                }                
            }
            System.out.println("");
        }
        System.out.println(" <<VETOR ORDENADO>> Trocas: "+numeroTrocas);        
        return vet;
    }
    public int[] selectionSort(int vet[]){
        //seleciona o menor elemento do subvetor nao ordenado
        // e caso nao seja o 
        //elemento da primeira posicao à esquerda do subvetor ele faz a troca
        System.out.println("\n ... Selection Sort...");
        int posMin=0;
        int minimo=0;
        int trocas = 0;
        for (int out = 0; out < vet.length; out++) {
            posMin = out;
            minimo = vet[out];
            for (int in = out; in < vet.length; in++) {                
                if(vet[posMin] > vet[in]){
                    posMin = in;
                    minimo = vet[in];                    
                }                                
            }
            if(posMin!=out){
                //troca os elementos de lugar
                int temp = vet[posMin];
                vet[posMin] = vet[out];
                vet[out] = temp;
                trocas++;
                imprimeVet(vet);
            }                
        }
        System.out.println(" << Vetor Ordenado >> Trocas: "+trocas);
        return vet;
    }
    public int[] insertionSort(int vet[]){
        System.out.println(" \n ...Insertion Sort...");
        int trocas = 0;
        for (int out = 1; out < vet.length; out++) {            
            for (int in = out; in > 0; in--) {
                if(vet[in] < vet[in-1]){
                    int temp = vet[in];
                    vet[in] = vet[in-1];
                    vet[in-1] = temp;
                    trocas++;
                    imprimeVet(vet);
                }
                else
                    break; 
                    // se o elemento inserido for maior q o anterior...
                    //entao sai do for                
            }            
        }
        System.out.println(" << Vetor Ordenado >> Trocas: "+trocas);
        return vet;
    }
    
    
    
}
