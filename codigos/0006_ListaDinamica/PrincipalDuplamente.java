public class PrincipalDuplamente {

    public static void main(String[] args)  {
        Lista_duplamente l = new Lista_duplamente();

        No_duplo n1 = new No_duplo('A');
        No_duplo n2 = new No_duplo('B');
        No_duplo n3 = new No_duplo('C');
        No_duplo n4 = new No_duplo('D');
        No_duplo n5 = new No_duplo('E');
        No_duplo n6 = new No_duplo('F');

        l.insere(n1);
        l.insere(n2);

        l.imprimeLista();


        l.insere(n3);
        l.insere(n4);

        l.imprimeLista();

        l.insereInicio(n5);
        l.insereMeio(n6,'B');

        l.imprimeLista();


    }
    
}
