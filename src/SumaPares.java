/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * < >
 */

import java.util.Scanner;

/**
 * Programa que suma los numeros pares comprendidos entre n1 y n2
 * @author Luis Hernández
 */
public class SumaPares {
    public static void main(String[] args) {
        //delcaracion de variables
        int n1,n2;
        int suma=0;
        int mayor, menor;
        Scanner sc=new Scanner(System.in);
        //pedir datos al usuario
        System.out.println("introduzca un numero entero");
        n1=sc.nextInt();
        System.out.println("introduzca otro numero");
        n2=sc.nextInt();
        //validacion de numero mayor
        if (n1>n2){
            mayor=n1;
            menor=n2;
        }else{
            mayor=n2;
            menor=n1;
        }
        //hacer un ciclo del menor hasta el mayor
        for (int i = menor; i <= mayor; i++) {
            //validacion si es par para sumar
            if (i%2==0) {
                suma+=i;
            }
        }
        //imprime el resultado
        System.out.println("El resultado de la suma de los numeros pares de n1 a n2 es: "+suma);
        sc.close();
    }
}
