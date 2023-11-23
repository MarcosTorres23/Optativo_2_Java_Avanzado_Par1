/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Infraestructura.DbManagment.contactos.Ciudad;
import Infraestructura.Modelos.Ciudad_modelo;

/**
 *
 * @author User
 */
public class Ciudad_servicios {
     
    Ciudad ciudadDB;
    public Ciudad_servicios(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        ciudadDB = new Ciudad(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarCiudad(Ciudad_modelo ciudad){
        if(validarDatos(ciudad)){
           return ciudadDB.registrarCiudad(ciudad);
        }
        return "Ocurrió algún error, contactese con el Administrador";
    }

    public String modificarCiudad(Ciudad_modelo ciudad){
        if(validarDatos(ciudad)){
            return ciudadDB.modificarPersona(ciudad);
        }
        return "Ocurrió algún error, contactese con el Administrador";
    }
    public String eliminarciudad(int id){
       
            return ciudadDB.eliminarciudad(id);
        
    }


    public Ciudad_modelo consultarCiudadPorId(int id){
        return  ciudadDB.consultarCiudad(id);
    }

    private boolean validarDatos(Ciudad_modelo ciudad) {
        try {
        if(ciudad.getNombre_ciudad().trim().isEmpty())
            throw new Exception("El nombre de la ciudad no debe estar vacío");
        else if (ciudad.getNombre_ciudad().trim().length() < 3) {
            throw new Exception("El nombre de la ciudad no tiene la longitud necesaria");
        }

    } catch (Exception e) {
        throw new RuntimeException(e);
    }
        return true;
    }

}
