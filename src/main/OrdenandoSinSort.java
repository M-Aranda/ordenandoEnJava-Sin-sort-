package main;

import java.util.ArrayList;
import java.util.List;

public class OrdenandoSinSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList();

        numeros.add(-3);
        numeros.add(6);
        numeros.add(10);
        numeros.add(55);
        numeros.add(2);
        numeros.add(-33);

        int i = 0;
        boolean hayCambios = true;

        while (i < numeros.size() - 1 && hayCambios) {
            hayCambios = false;
            for (int j = 1; j < numeros.size() - i; j++) {
                if (numeros.get(j - 1) < numeros.get(j)) {//cambiar el simbolo por mayor a, lo ordena ascendentemente
                    int a = numeros.get(j - 1);
                    numeros.set(j - 1, numeros.get(j));
                    numeros.set(j, a);
                    hayCambios = true;
                }
            }
            if (!hayCambios) {
                break;
            }
            i++;
        }
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
