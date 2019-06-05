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
public class No {
    //Dados para serem manipulados
    private String nome;
    private int id;
    
    public No(String n, int ch){
        nome = n;
        id = ch;
    }    
    @Override
    public String toString(){
        return nome+" "+id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
