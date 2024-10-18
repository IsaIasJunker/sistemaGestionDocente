package org.poo;

/**
 * Clase Suplente que extiende de Docente
 */
public class Suplente extends Docente{
    private String zona_rural;

    public Suplente(String nombre, String apellido, int numLegajo, int edad, int salario, int nacimiento, String zona_rural) {
        super(nombre, apellido, numLegajo, edad, salario, nacimiento);
        this.zona_rural = zona_rural;
    }

    public String getZona_rural() {
        return zona_rural;
    }

    public void setZona_rural(String zona_rural) {
        this.zona_rural = zona_rural;
    }

    @Override
    public int calcular_plus_salarial(){
        if(super.getEdad() < 25 && this.zona_rural == "Zona Rural A"){
            return super.getSalario() + super.getPLUS_RURALIDAD();
        }else{
            return super.getSalario();
        }
    }
}
