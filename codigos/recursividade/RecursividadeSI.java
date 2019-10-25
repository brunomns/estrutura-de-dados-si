/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividadesi;

/**
 *
 * @author bmnso
 */
public class RecursividadeSI {

    /**
     * @param args the command line arguments
     */
    static String S;
    public static void main(String[] args) {
        // TODO code application logic here
        RecursividadeSI rsi = new RecursividadeSI();
        //rsi.contRecursivo(1);
        //System.out.println("Triangular de 10 é "+ rsi.triangular(20));
        S = "raio";
        rsi.anagrama(S.length());
    }
    
    public void contRecursivo(int i){
        System.out.println("Valor: "+i);
        if(i==10)
            System.out.println("Caso Base: "+ i);
        else
            contRecursivo(i+1);
        System.out.println("Volta da Recursao: "+i);        
    }
    
    public int triangular(int x){
        System.out.println(""+x);
        // t(x) = t(x-1)+t
        // t(1) = 1;
        if(x == 1)
            return 1;
        else{
            int rec = triangular(x-1); 
            System.out.println(" Triangular de : "+x+ " : "+(x+rec));            
            return x+rec; 
        }
    }
    public String rotaciona(String s, int tam){
        int tamS = s.length();
        char ch[] = new char[tamS];
        ch = s.toCharArray();
        int pos = tamS - tam;
        char temp = ch[pos];
        for (int i = (pos+1); i < tamS; i++) {
            ch[i-1] = ch[i];            
        }
        ch[tamS-1] = temp;
        String result = String.copyValueOf(ch);
        System.out.print(" -- "+result);
        return result;
    }
    
    public void anagrama(int tam){
        if(tam==1)
            return;
        for(int i =0; i< tam; i++){
            anagrama(tam-1);
            if(tam==2)
                System.out.println(S);
            S = rotaciona(S, tam);
        }
    }
    
}
