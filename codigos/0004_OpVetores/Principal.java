public class Principal {
    static Pessoa vetPessoa[] = new Pessoa[5];
    static int fim = -1;


    public static void cadastra(Pessoa p){
        //insere no vetor
        if (fim == -1 || fim < (vetPessoa.length-1)){
            //vetor vazio
            fim++;
            vetPessoa[fim] = p;
        }
    }

    public static void imprimeVet(){
        System.out.println("-----IMPRIME VETOR-------");
        for (int i = 0; i <= fim; i++) {
            System.out.println(" Pos: "+i+ " Elemento: "+ vetPessoa[i].toString());
        }
    }

    public static int busca(String nome){
        for (int i = 0; i <= fim ; i++) {
            if (vetPessoa[i].nome.contains(nome)){
                return i;
            }
        }
        return -1;
    }

    public static Pessoa remove(String n){
        int r = busca(n);
        Pessoa aux = vetPessoa[r];
        for (int i = r; i < fim ; i++) {
            vetPessoa[i] = vetPessoa[i+1];
        }
        vetPessoa[fim] = null;
        fim--;
        return aux;
    }

    public static void main(String[] args) {

       Pessoa p1 = new Pessoa("Bruno", 37);
       Pessoa p2 = new Pessoa("Joao",33);
       Pessoa p3 = new Pessoa("Maria", 25);
       cadastra(p1);
       imprimeVet();

       cadastra(p2);
       cadastra(p3);
       imprimeVet();

        Pessoa p4 = new Pessoa("Luzia", 35);
        cadastra(p4);
        imprimeVet();

        int ele = busca("Lu");
        System.out.println(" Lu esta na posicao "+ele);

        Pessoa rm = remove("Bru");
        System.out.println(rm.toString());
        imprimeVet();

        Pessoa rm2 = remove("Maria");
        System.out.println(rm.toString());
        imprimeVet();



    }
}
