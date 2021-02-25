package vetor;
import java.util.Iterator;

public class Iterador<T> implements Iterator {

    T[] itens;
    int posicao = 0;
    int posiçãoF;
    
    public Iterador(T[] itens) {
        this.itens = itens;
        int posiçãoF = itens.length -1;
    }

    public boolean hasNext() {
        if (posicao < 0 || posicao >= itens.length) {
            return false;
        } else {
            return true;
        }
    }

    public Object next() {
        Object item = itens[posicao];
        posicao++;
        return item;
    }
    
    public boolean hasBack(){
        if (posiçãoF < itens.length || posiçãoF > itens.length) {
            return false;
        } 
        else {
            return true;
      }

    }
    public Object back() {
        Object item = itens[posiçãoF];
        posiçãoF--;
        return item;
    }
}   
    

