/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Infraestructura.DbManagment.contactos.Movimientos;
import Infraestructura.Modelos.Movimientos_models;

/**
 *
 * @author User
 */
public class Movimientos_servicios {
      Movimientos movimientosDB;
    public Movimientos_servicios(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        movimientosDB = new Movimientos(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarMovimientos(Movimientos_models movimiento){
        if(validarDatos(movimiento)){
           return movimientosDB.registrarMovimiento(movimiento);
        }
        return "Ocurrió algún error, contactese con el Administrador";
    }

    public String modificarCuenta(Movimientos_models movimiento){
        if(validarDatos(movimiento)){
            return movimientosDB.modificarMovimiento(movimiento);
        }
        return "Ocurrió algún error, contactese con el Administrador";
    }


    public Movimientos_models consultarMovimientoPorId(int id){
        return  movimientosDB.consultarMovimiento(id);
    }

    private boolean validarDatos(Movimientos_models movimiento) {
        try {
        if(movimiento.TipoMovimiento.trim().isEmpty())
            throw new Exception("El Tipo de Movimiento no debe estar vacío");
        else if( movimiento.TipoMovimiento.trim().length() < 3) {
            throw new Exception("El Tipo de Movimiento no tiene la longitud necesaria");
        }

    } catch (Exception e) {
        throw new RuntimeException(e);
    }
        return true;
    }
    
    
}
