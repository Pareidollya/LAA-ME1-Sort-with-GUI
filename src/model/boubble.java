
package model;

/**
 *
 * @author jj
 */
public class boubble {
    private int [] numeros;
    
    public boubble(int[]vetor){
        this.numeros = vetor;
    }
    public int[] Numeros() {
        return numeros;
    }
    
    public int [] ordenarBoubble(int[]numeros){
        for (int i = 0 ;i < numeros.length-1; i++){
            for (int j = 0; j< (numeros.length-1)-i;j++){
                if (numeros[j] > numeros[j+1]){
                    int aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
        this.numeros = numeros;
        return numeros;
    }
}

