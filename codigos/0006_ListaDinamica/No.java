public class No {
    Dado d;
    No proximo;

    public No(char d_char){
        Dado f = new Dado(d_char);
        this.d = f;
    }

    public void setProximo(No prox){
        this.proximo = prox;
    }

    public No getProximo(){
        return this.proximo;
    }

    public String toString(){
         if (proximo != null)
            return this.hashCode()+" - "+d.toString()+" Prox-> "+ proximo.hashCode();
         else
             return this.hashCode()+" - "+d.toString()+" Prox-> nao tem";
    }
}
