public class Pessoa {

    String nome;
    int idade;

    public Pessoa (String n, int i){
        nome = n;
        idade = i;
    }

    public String toString(){
        return "Nome: "+nome+" idade: "+idade;
    }
}
