package org.poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menuDocentes();
    }

    public static void menuDocentes(){
        Scanner scanner = new Scanner(System.in);
        Titular titular = new Titular();
        Suplente suplente = new Suplente();
        int respuesta;

        System.out.println("Bienvenido al programa de gestion de docentes");
        System.out.println("Ingrese a que docente desea calcular el plus salarial: ");
        System.out.println("[1] - Titular");
        System.out.println("[2] - Suplente");
        System.out.print("Respuesta: ");
        respuesta = scanner.nextInt();

        //Compruebo que la respuesta sea valida
        while (respuesta != 1 && respuesta != 2){
            System.out.println("Respuesta invalida");
            System.out.print("Respuesta: ");
            respuesta = scanner.nextInt();
        }
        while (respuesta != 0){
            if(respuesta == 1){
                titular.pedirDatos();
            }else{
                suplente.pedirDatos();
            }
            System.out.println("Desea calcular el plus salarial de otro docente?");
            System.out.println("[1] - Titular");
            System.out.println("[2] - Suplente");
            System.out.println("[0] - Salir");
            System.out.print("Respuesta: ");
            respuesta = scanner.nextInt();
            while (respuesta != 1 && respuesta != 2 && respuesta != 0){
                System.out.println("Respuesta invalida");
                System.out.print("Respuesta: ");
                respuesta = scanner.nextInt();
            }
        }
    }
}