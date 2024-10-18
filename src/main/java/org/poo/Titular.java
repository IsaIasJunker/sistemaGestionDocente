package org.poo;
import java.util.Scanner;
public class Titular implements Plus_Salarial{

    final int PLUS_SALARIAL = 80000;

    String nombre , apellido;
    int  antiguedad,edad , fechaNacimiento, numeroLegajo , salario;
    public Titular() {
    }
    public int getPLUS_SALARIAL() {
        return PLUS_SALARIAL;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getAntiguedad() {
        return antiguedad;
    }
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public int getNumeroLegajo() {
        return numeroLegajo;
    }
    public void setNumeroLegajo(int numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

    /**
     * Metodo que calcula el plus salarial dependiendo de la edad y la antiguedad
     * @return el salario mas el plus salarial
     */
    @Override
    public int calulaPlusSalarial() {
        if(this.edad >= 30 && this.antiguedad >= 6){
            return this.salario + PLUS_SALARIAL;
        }else{
            return this.salario;
        }
    }

    /**
     * Metodo que solicita los datos al usuario, luego al final calcula el plus salarial
     * e indica si se ha aplicado el plus sarial y luego mostrando el salario por pantalla
     */
    public void pedirDatos(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        this.nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        this.apellido = scanner.nextLine();

        System.out.print("Ingrese la antiguedad, en años: ");
        this.antiguedad = scanner.nextInt();

        System.out.print("Ingrese la edad: ");
        this.edad = scanner.nextInt();

        System.out.print("Ingrese su fecha de nacimiento: ");
        this.fechaNacimiento = scanner.nextInt();

        System.out.print("Ingrese su numero de legajo: ");
        this.numeroLegajo = scanner.nextInt();

        System.out.print("Ingrese su salario: ");
        this.salario = scanner.nextInt();

        if(calulaPlusSalarial() == this.salario){
            System.out.println();
            System.out.println("No se ha aplicado el plus salarial!");
            System.out.println("Su salario es de " + this.salario + " pesos");
        }else{
            System.out.println("Se ha aplicado el plus salarial");
            System.out.println("Su salario es de " + calulaPlusSalarial() + " pesos");
        }
    }
}
