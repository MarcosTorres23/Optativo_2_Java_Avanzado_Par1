/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Infraestructura.Modelos.Persona_modelo;
import Infraestructura.DbManagment.contactos.Personas;

/**
 *
 * @author User
 */
public class Personas_servicios {
    
    Personas personasDB;
    public Personas_servicios(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        personasDB = new Personas(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarPersona(Persona_modelo persona){
        if(validarDatos(persona)){
           return personasDB.registrarPersona(persona);
        }
        return "Ocurrió algún error, contactese con el Administrador";
    }

    public String modificarPersona(Persona_modelo persona){
        if(validarDatos(persona)){
            return personasDB.modificarPersona(persona);
        }
        return "Ocurrió algún error, contactese con el Administrador";
    }


    public Persona_modelo consultarPersonaPorId(int id){
        return  personasDB.consultarPersona(id);
    }
    public Persona_modelo consultarPersonaPorDocumento(int documento){
        return  personasDB.consultarPersonaPorDocumento(documento);
    }

    
    private boolean validarDatos(Persona_modelo persona) {
        try {
        if(persona.Nombre.trim().isEmpty())
            throw new Exception("El nombre no debe estar vacío");
        else if (persona.Nombre.trim().length() < 3) {
            throw new Exception("El nombre no tiene la longitud necesaria");
        }

    } catch (Exception e) {
        throw new RuntimeException(e);
    }
        return true;
    }

}