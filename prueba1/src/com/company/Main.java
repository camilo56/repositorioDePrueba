package com.company;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author camilo
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido al programa de descifrador de contraseña a continuacion vera el menu de opciones ");
        System.out.println("*******************");
        System.out.println(" selecciona una opcion : ");
        System.out.println(" [1]ingresa una conraseña manual para el pc desifrar\n [2]Desea que el pc desifre una contreña random de 6 digitos");
        Random ran = new Random();
        System.out.println("*******************");

        int b = ran.nextInt(999999) + 1;
        int num1 = 0;
        int c = 0;
        int d = 1;
        int a = 0;
        do {
            try {
                a = teclado.nextInt();
                c = 0;
            } catch (Exception e) {
                teclado.next();
                System.out.println("[ Error] \n ingrese un correcto numero si es un numero distinto a 1 se dara por echo que eligio la opcion 2");
                c = 1;
            }
        } while (d == c);

        if (a != 1 && a != 2) {
            a = 2;
        }
        System.out.println("*******************");
        System.out.println("La opcion que eligio es:" + a);
        System.out.println("*******************");

        if (a == 1) {
            System.out.println("ingrese la contraseña solo un numero entero: ");
            System.out.println("*******************");
            do {
                try {
                    num1 = teclado.nextInt();
                    c = 0;
                } catch (Exception e) {
                    teclado.next();
                    System.out.println("[ Error] \n ingrese un correcto, un numero entero");
                    c = 1;
                }

            } while (d == c);

            while (a != num1) {

                a++;
                System.out.println(a);

            };
            System.out.println("La contraseña es:" + a);
        } else {

            do {

                a++;
                System.out.println(a);

            } while (a != b);
            System.out.println("La contraseña es:" + b);
        }

    }
}
