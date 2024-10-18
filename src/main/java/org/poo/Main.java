package org.poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        menuOperaciones();
    }

    /**
     * Metodo para seleccionar con que docente realizar operaciones
     */
    public static void menuOperaciones(){
        Titular titular = new Titular(0, 0 , 0 , 0 , "" , "" , 0);
        Scanner scanner = new Scanner(System.in);
        int respuesta;

        System.out.println("Ingrese la operacion que quiere realizar");
        System.out.println("1 - Realizar operaciones sobre un docente titular");
        System.out.println("2 - Realizar operaciones sobre un docente suplente");
        System.out.println("0 - No realizar ninguna operacion y salir del programa");

        System.out.print("Ingrese su eleccion: ");
        respuesta = scanner.nextInt();

        switch (respuesta){
            case 1:
                System.out.println("Has seleccionado docente titular!");
                System.out.println();
                System.out.println("Ingrese la operacion a realizar");
                System.out.println("1- ingresar datos");
                System.out.println("0 - salir");
                System.out.print("Operacion a realizar: ");
                respuesta = scanner.nextInt();
                switch (respuesta){
                    case 1:
                        System.out.print("Ingrese el nombre: ");
                        titular.setNombre(scanner.next());

                        System.out.print("Ingrese el apellido: ");
                        titular.setApellido(scanner.next());

                        System.out.print("Ingrese la edad: ");
                        titular.setEdad(scanner.nextInt());

                        System.out.print("Ingrese el numero de legajo: ");
                        titular.setNumLegajo(scanner.nextInt());

                        System.out.print("Ingrese el anio de nacimiento: ");
                        titular.setNacimiento(scanner.nextInt());

                        System.out.print("Ingrese el salario: ");
                        titular.setSalario(scanner.nextInt());

                        System.out.print("Ingresar los anios de antiguedad: ");
                        titular.setAntiguedad(scanner.nextInt());

                        if(titular.calcular_plus_salarial() == titular.getSalario()){
                            System.out.println("Malas noticias!, no se ha aplicado el plus salarial");
                            System.out.println();
                            System.out.println("El salario es de " + titular.getSalario()
                                    + " pesos");
                        }else{
                            System.out.println("Felicitaciones!, se ha aplicado el plus salarial");
                            System.out.println();
                            System.out.println("El salario es de " +
                                    titular.calcular_plus_salarial() + " pesos");
                        }
                        break;
                    case 0:
                        break;
                }
                break;
            case 2:
                System.out.println("Has seleccionado docente suplente!");
                System.out.println();
                System.out.println("Ingrese la operacion a realizar");
                System.out.println("1- ingresar datos");
                System.out.println("0 - salir");
                System.out.print("Operacion a realizar: ");
                respuesta = scanner.nextInt();
                switch (respuesta){
                    case 1:
                        break;
                    case 0:
                        break;
                }
                break;
            case 0:
                System.out.println("No va a realizar ninguna operacion");
                System.out.println("saliendo del programa...");
                break;
        }
    }
}