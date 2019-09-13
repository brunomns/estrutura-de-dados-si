/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaduplaencadsi;

/**
 *
 * @author bmnso
 */
public class ListaDuplaEncadSI {
    
    No inicio; //ponteiro para o inicio da lista
    No fim; //ponteiro para o fim da lista
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDuplaEncadSI lista = new ListaDuplaEncadSI();
        
        No val1 = new No();
        val1.setValor("Joao");
        
        No val2 = new No();
        val2.setValor("Joana");
        
        No val3 = new No();
        val3.setValor("Juca");
        
        No val4 = new No();
        val4.setValor("Pedro");
        
        lista.insere(val1);
        lista.insere(val2);
        lista.insere(val3);
        lista.insere(val4);
        lista.imprimeLista();
        

        lista.remove("Joao");
        lista.imprimeLista();

        lista.remove("Joana");
        lista.imprimeLista();
        
        
        
    }
    
    public void insere(No n){
        if(inicio == null){
            inicio = n;
            fim  = n;
        }
        else{
            //insercao no final da lista
            fim.setProx(n);
            n.setAnt(fim);
            fim = n;
        }        
    }
    public void imprimeLista(){
        System.out.println("----IMPRESSAO----");
        No aux = inicio;
        if(inicio==null)
            System.out.println("====LISTA VAZIA===");        
        while(aux!=null){
            System.out.println(aux +" : ANT: "+aux.getAnt()+" VAL: "+ aux.getValor()+ " PROX: "+aux.getProx());
            aux = aux.getProx();
        }
    }
    
    public No busca(String s){
        No aux = inicio;
        if(inicio==null)
            return null;
        else{
            while(aux!=null){
                if(aux.getValor().contains(s))
                    return aux;
            aux = aux.getProx();
            }
            return null;
        }
    }
    public void remove(String r){
        System.out.println("Removendo..."+r);
        No rem = busca(r);
        if(rem!=null){
            //verificar se nao é o inicio ou o fim da lista
            if(rem.equals(inicio)){
                No proximo = rem.getProx();
                proximo.setAnt(null);
                rem.setProx(null);
                inicio = proximo;
            }
            else if(rem.equals(fim)){
                No anterior = rem.getAnt();
                anterior.setProx(null);
                rem.setAnt(null);
                fim = anterior;
            }
            else{
                No anterior = rem.getAnt();
                No proximo = rem.getProx();
                anterior.setProx(rem.getProx());
                rem.setProx(null);
                proximo.setAnt(rem.getAnt());
                rem.setAnt(null);
            }
        }
    }
    
}
