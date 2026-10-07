/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayormenor;
import java.util.Scanner;
/**
 *
 * @author jocab
 */
public class MayorMenor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese num1");
        int num1 = sc.nextInt();
        System.out.println("ingrese num2");
        int num2 = sc.nextInt();
        if (num1 > num2){
            System.out.println("el numero mayor es:" + num1);
            System.out.println("el numero menor es:" + num2);
        }else if(num2 > num1){
            System.out.println("el numero mayor es:" + num2);
            System.out.println("el numero menor es:" + num1);
        }else{
            System.out.print("los numeros son iguales");
        }
    }
}
