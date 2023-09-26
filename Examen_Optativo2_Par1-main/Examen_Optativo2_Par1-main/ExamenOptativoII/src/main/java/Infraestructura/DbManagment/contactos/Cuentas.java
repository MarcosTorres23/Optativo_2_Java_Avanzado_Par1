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
                    "'id_cuentas,' " +
                    "'id_cliente,' " +
                    "'nrocuenta,' " +
                    "'fecha_alta,' " +
                    "'tipo_cuent,' " +
                    "'estado, ' " +
                    "'saldo ,' " +
                    "'nrocontrato,' " +
                    "'costo_mantenimiento, ' " +
                    "'promedio_acreditacion,' " +
                    "'modeda' )" +
                    "values(" +
                    cuentas.IdCuenta+ "','"+
                    cuentas.IdCliente  + "','" +
                    cuentas.NroCuenta +"','" +
                    cuentas.FechaAlta  + "','"+
                    cuentas.TipoCuenta  + "','"+
                    cuentas.Estado + "','"+
                    cuentas.Saldo  + "','"+
                    cuentas.NroContrato  + "','"+
                    cuentas.CostoMantenimiento  + "' ,' "+
                    cuentas.PromedioAcreditacion  + " ',' "+
                    cuentas.Moneda+ ")");
            conexion.conexionDB().close();
            return "La Cuenta " + cuentas.IdCuenta + " fue registrada exitosamente";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
     public String modificarCuenta(Cuentas_modelo cuenta){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("'UPDATE cuentas SET' " +
                    "id_cliente' = '" + cuenta.IdCliente+ "'," +
                    "nrocuenta' = '" + cuenta.NroCuenta + "'," +
                    "fecha_alta' = '" + cuenta.FechaAlta + "'," +
                    "tipo_cuenta' = '" + cuenta.TipoCuenta + "'," +
                    "estado' = '" + cuenta.Estado + "'," +
                    "saldo' = '" + cuenta.Saldo + "'," +
                    "nrocontrato ' = '" +cuenta.NroContrato + "'," +
                    "costo_mantenimiento = '" + cuenta.CostoMantenimiento+ "'," +
                    "promedio_acreditacion = '" + cuenta.PromedioAcreditacion+ "'," +
                    "moneda = '" + cuenta.Moneda+ "'," 
                    + "' Where cliente.id_cliente = " + cuenta.IdCuenta);
            conexion.conexionDB().close();
            return "Los datos de la cuenta con id,  " + cuenta.IdCuenta + " fue modificado exitosamente";
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
                cuenta.IdCuenta = conexion.getResultadoQuery().getInt("id_cuenta");
                cuenta.IdCliente = conexion.getResultadoQuery().getInt("id_cliente");
                cuenta.NroCuenta = conexion.getResultadoQuery().getString("nrocuenta");
                cuenta.FechaAlta = conexion.getResultadoQuery().getDate("fecha_alta");
                cuenta.TipoCuenta = conexion.getResultadoQuery().getString("tipo_cuenta");
                cuenta.Estado = conexion.getResultadoQuery().getString("estado");
                cuenta.Saldo = conexion.getResultadoQuery().getFloat("saldo");
                cuenta.NroContrato = conexion.getResultadoQuery().getString("nrocontrato");
                cuenta.CostoMantenimiento = conexion.getResultadoQuery().getFloat("costo_mantenimiento");
                cuenta.PromedioAcreditacion = conexion.getResultadoQuery().getString("promedio_acreditacion");
                cuenta.Moneda= conexion.getResultadoQuery().getString("moneda");
                
                return cuenta;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    
}
