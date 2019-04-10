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
public class Pessoa {
    String nome;
    int numero;
    String email;
    
    public Pessoa(String n, int num, String mail){
        nome = n;
        numero = num;
        email = mail;
    }
    @Override
    public String toString(){
        return "Nome: "+nome+" num: "+numero+" email: "+email;
    }
    
}
