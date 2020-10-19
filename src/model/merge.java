
package model;

/**
 *
 * @author jj
 */
public class merge {
    private int [] vetor;
        public merge(int[]vetor){
        this.vetor = vetor;
    }
    
    public int[] Numeros() {
        return vetor;
    }
    
    public int[]  ordenarMerge(int []numeros , int inicio,int fim){
    int tamanho = numeros.length;
    
    if (tamanho < 2){
            this.vetor = numeros;
            return this.vetor;
        }
    
    if(inicio < fim - 1) {
        
      int meio = (inicio + fim) / 2;
      
      ordenarMerge(numeros,inicio, meio);
      ordenarMerge(numeros,meio, fim);    
      intercala(vetor, inicio, meio, fim);
    }
        this.vetor = numeros;
        return this.vetor;
     
      }
    
   private static void intercala(int[] numeros, int inicio, int meio, int fim) {
    int novoVetor[] = new int[fim - inicio];
    int i = inicio;
    int m = meio;
    int pos = 0;
    
    while(i < meio && m < fim) {
      if(numeros[i] <= numeros[m]) {
        novoVetor[pos] = numeros[i];
        pos = pos + 1;
        i = i + 1;
      } else {
        novoVetor[pos] = numeros[m];
        pos = pos + 1;
        m = m + 1;
      }
    }
    
    while(i < meio) {
      novoVetor[pos] = numeros[i];
      pos = pos + 1;
      i = i + 1;
    }
    
    while(m < fim) {
      novoVetor[pos] = numeros[m];
      pos = pos + 1;
      m = m + 1;
    }
 
    for(pos = 0, i = inicio; i < fim; i++, pos++) {
      numeros[i] = novoVetor[pos];
    }
  }
}
        

    

