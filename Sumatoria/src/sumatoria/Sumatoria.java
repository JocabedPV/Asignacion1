/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumatoria;

/**
 *
 * @author jocab
 */
public class Sumatoria {

    public static void main(String[] args) {
        int suma = 0;
        int numero = 1;
        do{
            System.out.println(numero);
            suma = numero + suma;
            numero++;
          } while (numero <=50);
            System.out.println("La sumatoria de los numeros es: " + suma);
    }
}
