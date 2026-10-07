/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablamultiplicacion;

/**
 *
 * @author jocab
 */

import java.util.Scanner;
        
public class TablaMultiplicacion {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero para multiplicar");
        int numero = sc.nextInt();
        for (int i=1; i<=10; i++) {
            int resultado = numero * i;
            System.out.println(numero + "x" + i + "=" + resultado);
        }
    
    }
    
}
