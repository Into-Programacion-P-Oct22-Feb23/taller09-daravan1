/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int elementosArribaMedia;
        int elementosAbajoMedia;
        int suma = 0;
        float media;
        int abajo = 0;
        int arriba = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            
            suma = suma + arreglo[i];   
        }
        
        media = suma / arreglo.length;
        
        for (int i = 0; i < arreglo.length; i++) {
            
            if (arreglo[i] > media ) {
                
                arriba = arriba + 1;
            }
           
            else {
                
                abajo = abajo + 1;
                
            }
        }
        
        System.out.printf("Elementos arriba de la media: %d\nElementos abajo "
                + "de la media: %d\n", arriba, abajo);
    }

}
