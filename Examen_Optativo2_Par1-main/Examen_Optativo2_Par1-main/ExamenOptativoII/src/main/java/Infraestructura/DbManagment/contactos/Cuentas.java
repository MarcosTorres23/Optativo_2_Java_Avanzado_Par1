/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Infraestructura.DbManagment.contactos;

import Infraestructura.Coneciones.ConeccionDB;
import Infraestructura.Modelos.Cuentas_modelo;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class Cuentas {
    
      
    private final ConeccionDB conexion;

    public Cuentas(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        conexion = new ConeccionDB(userBD, passDB, hostDB, portDB, dataBase);
    }
    
    public String registrarCuentas(Cuentas_modelo cuentas) throws RuntimeException {

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("INSERT INTO cuentas(" +
                    "id_cuenta, " +
                    "id_cliente, " +
                    "nrocuenta, " +
                    "fecha_alta, " +
                    "tipo_cuenta, " +
                    "estado,  " +
                    "saldo , " +
                    "nrocontrato, " +
                    "costo_mantenimiento,  " +
                    "promedio_acreditacion, " +
                    "moneda )" +
                    "values('" +
                    cuentas.getIdCuenta()+ "' , '"+
                    cuentas.getIdCliente()  + "' , '" +
                    cuentas.getNroCuenta() +" ' , ' " +
                    cuentas.getFechaAlta() + "' , '"+
                    cuentas.getTipoCuenta()  + "' , '"+
                    cuentas.getEstado() + "' , '"+
                    cuentas.getSaldo()  + "' , '"+
                    cuentas.getNroContrato() + "' , '"+
                    cuentas.getCostoMantenimiento() + "' , ' "+
                    cuentas.getPromedioAcreditacion()  + " ',' "+
                    cuentas.getMoneda()+ "')");
            conexion.conexionDB().close();
            return "La Cuenta " + cuentas.getIdCuenta() + " fue registrada exitosamente";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
     public String modificarCuenta(Cuentas_modelo cuenta){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE cuentas "
                    + "SET " +
                    "nrocuenta = '" + cuenta.getNroCuenta()+ "'," +
                    "fecha_alta = '" + cuenta.getFechaAlta() + "'," +
                    "tipo_cuenta = '" + cuenta.getTipoCuenta()+ "'," +
                    "estado = '" + cuenta.getEstado() + "'," +
                    "saldo = " + cuenta.getSaldo() + "," +
                    "nrocontrato  = '" +cuenta.getNroContrato() + "'," +
                    "costo_mantenimiento = " + cuenta.getCostoMantenimiento()+ "," +
                    "promedio_acreditacion = '" + cuenta.getPromedioAcreditacion()+ "'," +
                    "moneda = '" + cuenta.getMoneda() +"'" +
                   " Where cuentas.id_cuenta = " + cuenta.getIdCuenta());
            conexion.conexionDB().close();
            return "Los datos de la cuenta con id,  " + cuenta.getIdCuenta() + " fue modificado exitosamente";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
     
     
     public Cuentas_modelo consultarCuentas(int id){
        Cuentas_modelo cuenta = new Cuentas_modelo();
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("Select * from cuentas where id_cuenta = " + id));
            if(conexion.getResultadoQuery().next()){
                cuenta.setIdCuenta(conexion.getResultadoQuery().getString("id_cuenta"));
                cuenta.setIdCliente(conexion.getResultadoQuery().getString("id_cliente"));
                cuenta.setNroCuenta(conexion.getResultadoQuery().getString("nrocuenta"));
                cuenta.setFechaAlta(conexion.getResultadoQuery().getDate("fecha_alta"));
                cuenta.setTipoCuenta(conexion.getResultadoQuery().getString("tipo_cuenta"));
                cuenta.setEstado(conexion.getResultadoQuery().getString("estado"));
                cuenta.setSaldo(conexion.getResultadoQuery().getString("saldo"));
                cuenta.setNroContrato(conexion.getResultadoQuery().getString("nrocontrato"));
                cuenta.setCostoMantenimiento(conexion.getResultadoQuery().getString("costo_mantenimiento"));
                cuenta.setPromedioAcreditacion(conexion.getResultadoQuery().getString("promedio_acreditacion"));
                cuenta.setMoneda(conexion.getResultadoQuery().getString("moneda"));
                
                return cuenta;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
     public String eliminarcuentaporid(int id){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("DELETE FROM cuentas" +
                    " Where id_cuenta = '" + id+ "'");
            conexion.conexionDB().close();
            return "Los datos de la persona fueron eliminados correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }}
    
}
