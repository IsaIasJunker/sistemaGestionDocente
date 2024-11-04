package com.grupo1.gestiondocentes.controller;

import com.grupo1.gestiondocentes.model.Docente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/docente")

/**
 * Clase DocenteController, es un controlador creado para la clase Docente
 */
public class DocenteController {

    /**
     * Metodo que permite guardar los datos del docente ingresado en el formulario y mostrarlo en la pagina 
     * @param docente
     * @param model
     * @return
     */
    @PostMapping("/guardar")
    public String guardarDocente(Docente docente , Model model){
        int salarioFinal = calcularPlus(docente);
        model.addAttribute("docente", docente);
        model.addAttribute("salarioFinal", salarioFinal);
        return "resultado";
    }

    
    /**
     * Metodo para calcuar el plus salaria del docente ingresado, dependiendo del rol seleccionado 
     * @param docente , es el objeto docente
     * @return, 0 si no se selecciona ningún rol, de lo contrario
     * va a devolver el salario ingresado si no cumplió las condiciones para sumearle el plus salarial
     */
    private int calcularPlus(Docente docente){
        switch (docente.getCargo()){
            case "titular":
                if(docente.getEdad()>= 30 && docente.getAntiguedad() >= 6){
                    return docente.getSalario() + docente.getPLUS_SALARIAL();
                }else{
                    return docente.getSalario();
                }
            case "suplente":
                if(docente.getEdad() < 25 && docente.getZonaRural().equals("Zona Rural A")){
                    return docente.getSalario() + docente.getPLUS_SALARIAL();
                }else{
                    return docente.getSalario();
                }
        }
        return 0;
    }
}
