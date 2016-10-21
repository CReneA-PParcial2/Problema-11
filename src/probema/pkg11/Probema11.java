/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probema.pkg11;
import java.util.*;
/**
 *
 * @author Samsung
 */
public class Probema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONVERTIR UN NUMERO DADO EN UN NUMERO ROMANO
        int numero;
        numero = solicitarNumero();
        calcularRomano(numero);
    }
    
    public static int solicitarNumero(){
        int numero;
        System.out.println("Ingresa el numero que deseas convertir a romano:");
        Scanner entradaNumero = new Scanner(System.in);
        numero = entradaNumero.nextInt();
        return numero;
    }
    
    public static void calcularRomano(int numero){
        int letras;
        int [] arreglo = new int[] {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
        String [] arregloRomano = new String [] {"I","IV","V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        for (int i=arreglo.length-1; numero>=0; --i){
            letras = (numero/arreglo[i]);
            numero = numero%arreglo[i];
            for (int j=letras; letras!=0; letras--){
                System.out.print(arregloRomano[i]);
            }
        }
        
        
    }
}
