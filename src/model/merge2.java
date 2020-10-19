
package model;

/**
 *
 * @author jj
 */
public class merge2 {
    private int [] vetor;
    private int inicio, fim;

    public merge2(int[] vetor, int inicio, int fim) {
        this.vetor = vetor;
        this.inicio = inicio;
        this.fim = fim;
    }
    
    public int[] Numeros(){
        return vetor;
    }
    
    public int[] Merge(int []vetor, int tamanho){ //separar o vetor 
        
        if(tamanho < 2 ){
            this.vetor = vetor;
            return vetor;
        }
        int meio = (int) tamanho/2;
        
        int []esquerda = new int [meio];
        int []direita = new int [tamanho - meio];    
        for (int i = 0; i < meio; i++){
            esquerda[i] = vetor[i];
        }
        for (int i = meio; i < tamanho; i++){
            direita[i-meio] = vetor[i];
        }
        Merge(esquerda,meio);
        Merge(direita,(tamanho-meio));
        Sort(vetor,esquerda,direita,meio);
        
        this.vetor = vetor;
        return vetor;            
    }
    public static void Sort(int[]vetor, int[]esquerda, int[]direita,int meio){
        int inicio = meio;
        int fim = vetor.length - meio;
        int i =0,j=0,k=0;
        
        while(i < inicio && j < fim){
            if (esquerda[i] <= direita[j]){
                k++;
                j++;
                vetor[k] = esquerda[j];
            }
            else{
                k++;
                j++;
                vetor[k] = direita[j];
            }          
        }
        while (i < inicio){
            k++;
            i++;
            vetor[k] = esquerda[i]; 
        }
        while (j < fim){
            k++;
            j++;
            vetor[k] = direita[j];
        }
    }
  }
    
            
        
        
