
package model;

/**
 *
 * @author jj
 */
public class selection {
    
    private int [] numeros;
    
    public selection(int[]vetor){
        this.numeros = vetor;
    }
    public int[] Numeros() {
        return numeros;
    }
    
    public int[] ordenarSelection(int [] numeros){
        for (int i = 0; i<numeros.length;i++){
            int Indexmin = i;
            for (int j = i+1; j < numeros.length;j++){
                if(numeros[Indexmin]>numeros[j]){
                    Indexmin = j;
                }
            }    
        }
        this.numeros = numeros;
        return this.numeros;
    }
   
}
