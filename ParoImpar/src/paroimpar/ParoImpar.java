/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paroimpar;
import java.util.Scanner;
/**
 *
 * @author jocab
 */
public class ParoImpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero para determinar si es par o impar");
        int numero = sc.nextInt();
        if(numero % 2 == 0){
            System.out.println("el numero: " + numero + " es par");
        }else{
            System.out.println("el numero: " + numero + " es impar");
        }
    }
}
