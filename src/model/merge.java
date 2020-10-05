/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class merge {
    private int [] vetor;
        public merge(int[]vetor){
        this.vetor = vetor;
    }
    
    public int[] Numeros() {
        return vetor;
    }
    public int[]  ordenarMerge(int [] numeros){
    int tamanho = numeros.length;
    int elementos = 1;

    int inicio, meio, fim;
    
    while(elementos < tamanho) {
      inicio = 0;
      
      while(inicio + elementos < tamanho) {
        meio = inicio + elementos;

        fim = inicio + 2 * elementos;
        
        if(fim > tamanho)
          fim = tamanho;
        
        intercala(vetor, inicio, meio, fim);
        
        inicio = fim;
      }
      elementos = elementos * 2;
    }
    return vetor;
  }
   private static void intercala(int[] vetor, int inicio, int meio, int fim) {
    int novoVetor[] = new int[fim - inicio];
    int i = inicio;
    int m = meio;
    int pos = 0;
    
    while(i < meio && m < fim) {
      if(vetor[i] <= vetor[m]) {
        novoVetor[pos] = vetor[i];
        pos = pos + 1;
        i = i + 1;
      } else {
        novoVetor[pos] = vetor[m];
        pos = pos + 1;
        m = m + 1;
      }
    }
    while(i < meio) {
      novoVetor[pos] = vetor[i];
      pos = pos + 1;
      i = i + 1;
    }
    
    while(m < fim) {
      novoVetor[pos] = vetor[m];
      pos = pos + 1;
      m = m + 1;
    }
    
    for(pos = 0, i = inicio; i < fim; i++, pos++) {
      vetor[i] = novoVetor[pos];
    }
  }
}
        

    

