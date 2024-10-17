package org.poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        menuOperaciones();
    }

    public static void menuOperaciones(){
        Scanner scanner = new Scanner(System.in);
        Suplente suplente = new Suplente(0 , 0, 0 , 0 , "" , "" , "");
        Titular titular = new Titular(0 , 0 , 0, 0 , "" , "" , 0);
        int opcion;

        System.out.println("Con que quieres trabajar: ");
        System.out.println("1 - Docente titular");
        System.out.println("2 - Docente suplente");
        System.out.println("3 - Salir");
        System.out.print("Ingrese su eleccion:" );
        opcion = scanner.nextInt();

        while(opcion != 0){
            switch (opcion){
                case 1:
                    System.out.println("Vas a trabajar con un docente titular");
                    System.out.println("1 - Ingresar datos del docente");
                    System.out.println("2 - Corroborar si aplica plus al sueldo");
                    System.out.println("0 - Salir del submenu");
                    System.out.print("Ingrese la accion que desea realizar ");
                    opcion = scanner.nextInt();
                    while (opcion !=0){
                        switch (opcion){
                            case 1:
                                System.out.print("Ingrese el nombre:");
                                titular.setNombre(scanner.next());
                                System.out.print("Ingres el apellido: ");
                                titular.setApellido(scanner.next());
                                System.out.print("Ingrese la edad: ");
                                titular.setEdad(scanner.nextInt());
                                System.out.print("Ingrese el numero de legajo: ");
                                titular.setNumLegajo(scanner.nextInt());
                                System.out.println("Ingrese el salario: ");
                                titular.setSalario(scanner.nextInt());
                                System.out.println("Ingresar la antiguedad: ");
                                titular.setAntiguedad(scanner.nextInt());
                                System.out.println("Ingrese el anio de nacimiento: ");
                                titular.setNacimiento(scanner.nextInt());
                            case 2:
                                if(titular.calcular_plus_salarial() != titular.getSalario()){
                                    System.out.print("Se ha aplicado el plus salarial");
                                    System.out.println("El salario aumenta a " + titular.calcular_plus_salarial()
                                            + " pesos");
                                }else{
                                    System.out.println("No se ha aplicado el plus salarial");
                                    System.out.println("El salario es de: " + titular.getSalario() + " pesos");
                                }
                        }
                        System.out.print("Ingrese la proxima accion a realizar: ");
                        opcion = scanner.nextInt();
                    }
                case 2:
                case 0:
            }
            System.out.println("Desea ingresar un nuevo docente? : ");
            opcion = scanner.nextInt();
        }
    }
}