package org.poo;

/**
 * Clase Titular que extiende de Docente
 */
public class Titular extends Docente{
    private int antiguedad;

    public Titular(int numLegajo, int nacimiento, int edad, int salario, String nombre, String apellido, int antiguedad) {
        super(numLegajo, nacimiento, edad, salario, nombre, apellido);
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public int calcular_plus_salarial(){
        int salarioBasico =0;
        if(super.getEdad() >= 30 && this.antiguedad >= 6){
            salarioBasico = super.getSalario() + super.getPLUS_RURALIDAD();
        }else{
            salarioBasico = super.getSalario();
        }
        return salarioBasico;
    }
}
