package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Ciclo for
        /* for(contados = 0; contador < numeroVeces; contador++){
            //codigo que se repite
        } */

        //Ejemplo
    /*

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un Numero");
        int numero = sc.nextInt();
        sc.close();

        for(int i = 1; i <=10; i++){
            System.out.println(numero + " x " + i + " = " + (numero*i));
        }
     */
        //Ejercicio
        /*

        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingresa el numero a cual detener el Ribonbachi");
        int numeroDetener = escaner.nextInt();

        int numeroEmpezar = 0;
        int numeroSiguiente = 1;

        for(int i = 1; i <= numeroDetener; i++){

            if( i%2 == 0){
                continue;
            }

            int sumador = numeroEmpezar + numeroSiguiente;
            System.out.println("Vuelta No. "+ i + "  Tribonachi: " + sumador);
            numeroEmpezar = numeroSiguiente;
            numeroSiguiente = sumador;

            if(i == 8){
                break; // Sirve para detener el ciclo
            }


        }
        */

        //Cliclo while, mientras la condicion se cumpla, se va a repetir el codigo
        /*
        while(condicion){

        }
         */

        //Ejercicio
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina el numero secreto");
        int numero = sc.nextInt();
        int numeroSecreto = 33;

        while(numero != numeroSecreto){
            System.out.println("Numero equivocado, vuelvelo a escribir");
            numero = sc.nextInt();
        }
        System.out.println("Felicidades, adivinaste el numero secreto!");
        sc.close();

         */

        //Ciclo do while
        /*
        do{

        } while(condicion);
         */

        //ejercicio
        /*
        Scanner sc = new Scanner(System.in);

        int numero;
        int numeroSecreto = 33;

        do{
            System.out.println("Adivina el numero secreto, ingresa un Numero");
            numero = sc.nextInt();
        } while(numero != numeroSecreto);

        System.out.println("Felicidades, adivinaste el numero secreto!");
        sc.close();

         */

        //Pedir al usuario un numero y calcular el factorial de ese numero

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero a obtener el factorial");
        int numeroFactoria = sc.nextInt();
        int producto = 1;

        while(numeroFactoria >= 1){
            producto = (producto * numeroFactoria--);
        }
        System.out.println("Su factorial es "+ producto);
    }
}
