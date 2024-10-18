package org.poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }


    public static void menu(){
Scanner scanner = new Scanner(System.in);
boolean exit = false;

while (!exit) {
    System.out.println("Menu principal:");
    System.out.println("1. Submenu 1");
    System.out.println("2. Submenu 2");
    System.out.println("3. Salir");
    System.out.print("Seleccione una opción: ");
    int option = scanner.nextInt();

    switch (option) {
        case 1:
            boolean exitSubmenu1 = false;
            while (!exitSubmenu1) {
                System.out.println("Submenu 1:");
                System.out.println("1. Opción 1");
                System.out.println("2. Opción 2");
                System.out.println("3. Volver al menu principal");
                System.out.print("Seleccione una opción: ");
                int subOption1 = scanner.nextInt();

                switch (subOption1) {
                    case 1:
                        System.out.println("Has seleccionado Opción 1 del Submenu 1");
                        break;
                    case 2:
                        System.out.println("Has seleccionado Opción 2 del Submenu 1");
                        break;
                    case 3:
                        exitSubmenu1 = true;
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            }
            break;
        case 2:
            boolean exitSubmenu2 = false;
            while (!exitSubmenu2) {
                System.out.println("Submenu 2:");
                System.out.println("1. Opción 1");
                System.out.println("2. Opción 2");
                System.out.println("3. Volver al menu principal");
                System.out.print("Seleccione una opción: ");
                int subOption2 = scanner.nextInt();

                switch (subOption2) {
                    case 1:
                        System.out.println("Has seleccionado Opción 1 del Submenu 2");
                        break;
                    case 2:
                        System.out.println("Has seleccionado Opción 2 del Submenu 2");
                        break;
                    case 3:
                        exitSubmenu2 = true;
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            }
            break;
        case 3:
            exit = true;
            break;
        default:
            System.out.println("Opción no válida");
    }
}
    }
}