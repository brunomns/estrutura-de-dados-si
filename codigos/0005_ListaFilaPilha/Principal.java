public class Principal {
    public static void main(String[] args) {
        Pilha p = new Pilha();
        Fila f = new Fila();
        Lista l = new Lista();

        Pessoa p1 = new Pessoa("Paulo",40);
        Pessoa p2 = new Pessoa("Giovana",30);
        Pessoa p3 = new Pessoa("Paula",25);
        Pessoa p4 = new Pessoa("Junior",15);
        Pessoa p5 = new Pessoa("Camila",45);

        p.empilha(p1);
        p.empilha(p2);
        p.imprimePilha();
        p.empilha(p3);
        p.empilha(p4);
        p.empilha(p5);
        p.imprimePilha();

        l.cadastra(p1);
        l.cadastra(p2);
        l.imprimeVet();
        l.cadastra(p3);
        l.cadastra(p4);
        l.cadastra(p5);
        l.imprimeVet();

        f.insere(p1);
        f.insere(p2);
        f.imprimeVet();
        f.insere(p3);
        f.insere(p4);
        f.insere(p5);
        f.imprimeVet();

        p.desempilha();
        f.remove();

        p.imprimePilha();
        f.imprimeVet();

        l.remove("Giovana");
        l.imprimeVet();

    }
}
