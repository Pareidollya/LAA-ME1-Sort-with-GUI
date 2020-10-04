package model;

public class insertion {
    private int [] numeros;
    
    public insertion(int[]vetor){
        this.numeros = vetor;
    }

    public int[] Numeros() {
        return numeros;
    }
    
    public int [] ordenarInsertion (int[] numeros){
        for (int i = 1; i < numeros.length;i++ ){
            
            int j = i;
            int pos = numeros[i];
            
            while((j>0) && (numeros[j-1]>pos)){
            numeros[j] = numeros[j-1];
            j--;
        }
            numeros[j] = pos;
        }
        this.numeros = numeros;
        return this.numeros;
    }
    
}
