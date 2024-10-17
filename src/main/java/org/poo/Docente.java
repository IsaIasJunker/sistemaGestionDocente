package org.poo;
/**
 * Clase abstracta Docente
 */
public abstract class Docente implements Calculo_salarial {

    private int numLegajo , nacimiento , edad , salario;
    private String nombre , apellido;
    final int PLUS_RURALIDAD = 80000;

    //Constructor
    public Docente(int numLegajo, int nacimiento, int edad, int salario, String nombre, String apellido) {
        this.numLegajo = numLegajo;
        this.nacimiento = nacimiento;
        this.edad = edad;
        this.salario = salario;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Getters and setters
    public int getNumLegajo() {
        return numLegajo;
    }

    public void setNumLegajo(int numLegajo) {
        this.numLegajo = numLegajo;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
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

    public int getPLUS_RURALIDAD() {
        return PLUS_RURALIDAD;
    }
}
