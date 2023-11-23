/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Infraestructura.DbManagment.contactos.Cuentas;
import Infraestructura.Modelos.Cuentas_modelo;

/**
 *
 * @author User
 */
public class Cuentas_servicios {
     Cuentas cuentasDB;
    public Cuentas_servicios(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        cuentasDB = new Cuentas(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarCuenta(Cuentas_modelo cuenta){
        if(validarDatos(cuenta)){
           return cuentasDB.registrarCuentas(cuenta);
        }
        return "Ocurrió algún error, contactese con el Administrador";
    }

    public String modificarCuenta(Cuentas_modelo cuenta){
        if(validarDatos(cuenta)){
            return cuentasDB.modificarCuenta(cuenta);
        }
        return "Ocurrió algún error, contactese con el Administrador";
    }
    public String eliminarcuentaporId(int id){
       
            return cuentasDB.eliminarcuentaporid(id);
        
    }


    public Cuentas_modelo consultarCuentaPorId(int id){
        return  cuentasDB.consultarCuentas(id);
    }

    private boolean validarDatos(Cuentas_modelo cuenta) {
        try {
        if(cuenta.getEstado().trim().isEmpty())
            throw new Exception("El Estado no debe estar vacío");
        else if (cuenta.getEstado().trim().length() < 3) {
            throw new Exception("El Estado no tiene la longitud necesaria");
        }

    } catch (Exception e) {
        throw new RuntimeException(e);
    }
        return true;
    }

}
