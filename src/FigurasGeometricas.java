/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * import java.util.Scanner esta libreria es necesaria para guardar datos desde el teclado
 */
import java.util.Scanner;

/**
 * Programa que calcula el area de una figura geometrica dependiendo la opcion
 * seleccionada por el usuario en un menu que se repite hasta seleccionar la opcion salir
 * @author Luis Hernández
 */
public class FigurasGeometricas {
    public static void main(String[] args) {
        float area=0;
        int op;
        final float pi=3.14159f;//va ser una constante
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Elige una opcion");
            System.out.println("1- area de circulo");
            System.out.println("2- area de triangulo");
            System.out.println("3- area de cuadrado");
            System.out.println("4- salir");
            op= sc.nextInt();
            switch (op) {
                case 1:
                    //circulo
                    System.out.println("selecciono el area del circulo");
                    float radio=15;
                    area=pi*radio*radio;               
                    break;
                case 2:
                    //triangulo
                    System.out.println("selecciono el area del triangulo");
                    float base=8, altura=5;
                    area=(base*altura)/2;
                    break;
                case 3:
                    //cuadrado
                    System.out.println("selecciono el area del cuadrado");
                    float lado=10;
                    area=lado*lado;
                    break;
                case 4:
                    //salir
                    System.out.println("Adios :)");
                    continue;
                default:
                    //ninguno de los anteriores
                    System.out.println("su seleccion no fue correcta");
                    continue;
            }
            System.out.println("El area es: "+area);
        }while(op!=4);
        sc.close();
    }
}
