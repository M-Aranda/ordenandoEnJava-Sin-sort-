/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenandosinsort;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marce
 */
public class OrdenandoSinSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList();

        numeros.add(-3);
        numeros.add(6);
        numeros.add(10);
        numeros.add(5);
        numeros.add(2);
        numeros.add(-9);
        

        // busco que devuuelva 10, 6, 5, 2, -3, -9
        boolean hayCambios = true;

        while (hayCambios) {

            for (int i = 0; i < numeros.size(); i++) {

                if (i + 1 < numeros.size()) {

                    if (numeros.get(i) < numeros.get(i + 1)) {

                        int n1 = numeros.get(i);
                        int n2 = numeros.get(i + 1);

                        numeros.set(i, n2);
                        numeros.set(i + 1, n1);
                        hayCambios = true;
                    } else if (numeros.get(i) > numeros.get(i + 1)) {
                        hayCambios = false;
                    }

                }

            }

        }


        for (Integer numero : numeros) {
            System.out.println(numero);

        }

    }
}
