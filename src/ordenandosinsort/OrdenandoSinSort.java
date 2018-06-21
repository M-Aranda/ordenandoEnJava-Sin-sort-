package ordenandosinsort;

import java.util.ArrayList;
import java.util.List;

public class OrdenandoSinSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList(); //crear nueva lista de integers.

        numeros.add(-3);
        numeros.add(6);
        numeros.add(10);
        numeros.add(55);
        numeros.add(2);
        numeros.add(-33);
        //las 6 lineas anteriores agregan numeros



        int a=0;//una variable en donde pueda guardar el valor del indice antes de cambiarlo

        for (int i = 0; i < numeros.size(); i++) { //ciclo superior ejecuta un ciclo por cada elemento en la lista
            for (int j = 1; j < numeros.size()-1; j++) {//ciclo interior que compara cada valor
                if((numeros.get(j-1))< (numeros.get(j))){// if que determina si el valor del indice actual, de este ciclo es mayor al siguiente
                    a=numeros.get(j-1);//variable guarda valor de variable 
                    numeros.set(j-1,numeros.get(j));//cambiar el primero por el segundo
                    numeros.set(j,a);//darle al segundo indice, el valor del primero
                
            }
                
            }
            
            
            
        }
        
        for (Integer i : numeros) {// ciclo for para mostrar los numeros ya ordenados
            System.out.println(i);
            
        }


    }

//    private static void bubbleSort(int[] arr) {
//       
//            int n = arr.length;
//            int temp = 0;
//            for (int i = 0; i < n; i++) {
//                for (int j = 1; j < (n - i); j++) {
//                    if (arr[j - 1] < arr[j]) {
//                        //swap elements  
//                        temp = arr[j - 1];
//                        arr[j - 1] = arr[j];
//                        arr[j] = temp;
//                    
//        
//
//    }
    
    

    
}
            
    
    

