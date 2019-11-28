/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinaria;

/**
 *
 * @author bmnso
 */
public class No {
    int valor;
    No filhoEsq;
    No filhoDir;
    No pai;
    
    public No (int val){
        valor = val;
    }
    public String toString(){
        if(pai!=null)
            return Integer.toString(valor)+" - filho de : "+pai.getValor();
        else
            return Integer.toString(valor);
    }
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getFilhoEsq() {
        return filhoEsq;
    }

    public void setFilhoEsq(No filhoEsq) {
        this.filhoEsq = filhoEsq;
    }

    public No getFilhoDir() {
        return filhoDir;
    }

    public void setFilhoDir(No filhoDir) {
        this.filhoDir = filhoDir;
    }

    public No getPai() {
        return pai;
    }

    public void setPai(No pai) {
        this.pai = pai;
    }
    
    
}
