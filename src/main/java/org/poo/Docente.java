package org.poo;
/**
 * Clase abstracta Docente
 */
public abstract class Docente {


    private String nombre , apellido;
    private int numLegajo , edad , salario,nacimiento;
    final int PLUS_RURALIDAD = 80000;

    public Docente(String nombre, String apellido, int numLegajo, int edad, int salario, int nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numLegajo = numLegajo;
        this.edad = edad;
        this.salario = salario;
        this.nacimiento = nacimiento;
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

    public int getNumLegajo() {
        return numLegajo;
    }

    public void setNumLegajo(int numLegajo) {
        this.numLegajo = numLegajo;
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

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getPLUS_RURALIDAD() {
        return PLUS_RURALIDAD;
    }

    abstract int calcular_plus_salarial();
}
