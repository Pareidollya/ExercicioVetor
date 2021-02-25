
package vetor;
/**
 *
 * @author jj
 */
public class main {

    
    public static void main(String[] args) {
        
        cavalo c = new cavalo("sim");
        cavalo c2 = new cavalo("nao");
        vetor<cavalo> v = new vetor(10);
        
        v.adicionaInicio(c);
        v.adicionaFim(c2);
        v.adiciona(c2,8);
        
        System.out.println(v.recupera(0));
        System.out.println(v.recupera(0));
        System.out.println(v.vazio());
        
        v.remove(8);
        v.RemoveInicio();
        System.out.println(v.getElementos());
 
        System.out.println(v.recupera(0));
        System.out.println(v.recupera(8));
        System.out.println(v.vazio());
        System.out.println(v.Tamanho());
        
        v.Limpa();
        System.out.println(v.Tamanho());
        System.out.println(v.getTamanho());
        
        v.setElementos(10);
        v.redimencionar();
        System.out.println(v.getTamanho());
    }
    
}
