package org.poo;

/**
 * Clase Suplente que extiende de Docente
 */
public class Suplente extends Docente{

    private String zona_rural;
    public Suplente(){

    }
    public Suplente(int numLegajo, int nacimiento, int edad, int salario, String nombre, String apellido, String zona_rural) {
        super(numLegajo, nacimiento, edad, salario, nombre, apellido);
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
