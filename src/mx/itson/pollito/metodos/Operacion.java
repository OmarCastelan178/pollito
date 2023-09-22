/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pollito.metodos;

/**
 * 
 *
 * @author IcelOmar
 */
public class Operacion {
    /**
     * verificar si una cadena de texto se lee de derecha a izquiera o de izquierda a derecha de igual forma.
     * @param frase
     * @return Si la frase es un palindromo o no lo es.
     */
    public static boolean palindromoValidacion (String frase){
        int longitud = frase.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (frase.charAt(i) != frase.charAt(longitud - i - 1)) {
                    return false;
        }
    }
    return true;
    }
    
}
