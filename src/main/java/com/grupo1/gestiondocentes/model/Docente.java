package com.grupo1.gestiondocentes.model;

/**
 * Clase Docente 
 */
public class Docente {

    //Variables 
    final int PLUS_SALARIAL = 80000;
    private String nombre , apellido, cargo , zonaRural;
    private int  antiguedad,edad , anio_nacimiento, legajo , salario;

    //Getters and Setters
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

    public int getAnio_nacimiento() {
        return anio_nacimiento;
    }

    public void setAnio_nacimiento(int anio_nacimiento) {
        this.anio_nacimiento = anio_nacimiento;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getZonaRural() {
        return zonaRural;
    }

    public void setZonaRural(String zonaRural) {
        this.zonaRural = zonaRural;
    } 
}
