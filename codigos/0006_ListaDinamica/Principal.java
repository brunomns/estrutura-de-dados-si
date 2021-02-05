public class Principal {
    public static void main(String[] args)  {
        Lista l = new Lista();

        No n1 = new No('A');
        No n2 = new No('B');
        No n3 = new No('C');
        No n4 = new No('D');
        No n5 = new No('E');
        No n6 = new No('F');

        l.insere(n1);
        l.insere(n2);

        l.imprimeLista();


        l.insere(n3);
        l.insere(n4);

        l.imprimeLista();

        l.insere(n5);
        l.insere(n6);

        l.imprimeLista();


    }
}
