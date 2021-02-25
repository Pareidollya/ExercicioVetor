package vetor;

/**
 *
 * @author jj
 */
public class vetor<T> {
    private int tamanho; 
    private  T[] vetor;
    private int elementos = 0;

    public vetor() {
    }

    public vetor(int tamanho) {
        this.tamanho = tamanho;
        vetor = (T[]) new Object[tamanho];
        
    }
    public void adiciona(T elemento,int pos){ 
        //tratar exceção tamanho

        vetor[pos] = elemento;
        elementos++;
        
    }
    public T recupera(int pos){
        if (pos>=tamanho){
            throw new IllegalArgumentException("Posição invalida!");
        }
        return vetor[pos];
        
    }
    public void adicionaInicio(T elemento){
        //tratar exceção tamanho
        Iterador Vit = new Iterador(vetor); 
        int count = 0;
        
        while (Vit.hasNext()){
            if(Vit.next() == null){
                vetor[count] = elemento;
                elementos++;
                System.out.println("Elemento adicionado inicio!");
                break;
            }
            count++;
        }  
    }
    public void adicionaFim(T elemento){ 
        //tratar exceção e usar iterator 
        int count = tamanho - 1;
        while (count >= 0){
            if (vetor[count] == null){
               vetor[count] = elemento;
               elementos++;
               System.out.println("Elemento adicionado final!");
               break;
            }
            count--;
        }
    }
    
    public boolean existeDado(int pos){
        //tratar
        if (vetor[pos] != null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean vazio(){
          Iterador vit = new Iterador(vetor);
          if (vit.next() != null){
              return false;    
          }
          else{
              return true;
          }
    }
    
   public void remove (int pos){
       if (pos>=tamanho){
            throw new IllegalArgumentException("Posição invalida!");
        }
       else if (pos < 0){
           throw new IllegalArgumentException("Posição invalida!");
       }
       if (this.existeDado(pos) == true && this.vazio() == false) {
           vetor[pos] = null;
           elementos--;
           System.out.println("removido");
           
       }
       else{
           System.out.println("O vetor ja esta vazio");
       }
       
   }
    public void RemoveInicio(){
        //tratar exceção tamanho
        Iterador Vit = new Iterador(vetor); 
        int count = 0;
        
        while (Vit.hasNext()){
            if(Vit.next() != null){
                vetor[count] = null;
                elementos--;
                System.out.println("Elemento removido do inicio!");
                break;
            }
            count++;
        }
    }
     public int Tamanho(){
        return this.getElementos();
    }
     public void Limpa(){
        //tratar exceção tamanho
        Iterador Vit = new Iterador(vetor); 
        int count = 0;
        
        while (Vit.hasNext()){
            if(Vit.next() != null){
                vetor[count] = null;
                elementos--;
            }
            count++;
        }
        System.out.println("vetor limpo");
    }
     
     public void redimencionar(){
         if (this.elementos == this.getTamanho()){
             T[] vetor2 = (T[]) new Object[this.vetor.length * 2];
            for (int i = 0; i < this.vetor.length;i++){
             vetor2[i] = this.vetor[i];
         }
        System.out.println("Tamanho redimencionado!");
        this.vetor = vetor2;
     }
    }   
     
    public int getTamanho() {
        return vetor.length;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public T[] getVetor() {
        return vetor;
    }

    public void setVetor(T[] vetor) {
        this.vetor = vetor;
    }

    public int getElementos() {
        return elementos;
    }

    public void setElementos(int elementos) {
        this.elementos = elementos;
    }
    
    
}
