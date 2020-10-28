public class Principal {

    public static void main(String[] args) {
        //vetor de tipo primitivo
        char vetor[] = new char[12];
        vetor[0] = 'c';
        vetor[5] = 'd';

        //Vetor de tipo abstrato
        Pessoa vetPessoa[] = new Pessoa[5];

        vetPessoa[0] = new Pessoa();
        vetPessoa[0].nome = "Rafa";
        vetPessoa[0].id = 5;

        Pessoa p = new Pessoa("Joao",10);
        vetPessoa[1] = p;
        p.nome = "Joaquim";


        vetPessoa[2] = new Pessoa();
        vetPessoa[2].nome = "Dia";
        vetPessoa[2].id = 10;

        vetPessoa[3] = new Pessoa("Julia",8);

    }
}
