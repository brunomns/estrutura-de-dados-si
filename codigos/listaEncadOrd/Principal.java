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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaOrd lista = new ListaOrd();
        
        No n1 = new No("Adalto",1);
        No n2 = new No("Bethoven",2);
        No n3 = new No("Zulmira",4);
        No n4 = new No("Joana",3);
        No n5 = new No("Camila",5);
        
        lista.insere(n1);
        lista.insere(n2);
        lista.imprimeLista();
        lista.insere(n3);
        lista.imprimeLista();
        lista.insere(n4);
        lista.imprimeLista();
        lista.insere(n5);
        lista.imprimeLista();
        
        lista.remove("Bet");
        lista.imprimeLista();
        
        lista.remove("Joana");
        lista.imprimeLista();
        
    }
    
}
