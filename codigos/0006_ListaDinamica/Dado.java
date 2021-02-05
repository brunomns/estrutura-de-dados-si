
public class Dado{

    char caractere;

    public Dado(char c){
        this.caractere = c;
        System.out.println("...Dado com o caractere "+c+" criado...");
    }

    public String toString(){
        return " Char: "+ this.caractere;
    }

}
