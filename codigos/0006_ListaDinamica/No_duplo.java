public class No_duplo {
    Dado d;
    No_duplo proximo;
    No_duplo ant;

    public No_duplo(char d_char){
        Dado f = new Dado(d_char);
        this.d = f;
    }

    public char getChar(){
        return d.caractere;
    }

    public void setProximo(No_duplo prox){
        this.proximo = prox;
    }

    public No_duplo getProximo(){
        return this.proximo;
    }

    public void setAnt(No_duplo anterior){
        this.ant = anterior;
    }

    public No_duplo getAnt(){
        return this.ant;
    }


    public String toString(){
        if (proximo != null && ant !=null)
            return this.hashCode()+" - "+d.toString()+" Prox-> "+ proximo.hashCode()+" Ant-> "+ ant.hashCode();
        else if (proximo!=null)
            return this.hashCode()+" - "+d.toString()+" Prox-> "+ proximo.hashCode();
        else if (ant!=null)
            return this.hashCode()+" - "+d.toString()+" Ant-> "+ ant.hashCode();
        else
            return this.hashCode()+" - "+d.toString()+" Prox-> nao tem";
    }
}
