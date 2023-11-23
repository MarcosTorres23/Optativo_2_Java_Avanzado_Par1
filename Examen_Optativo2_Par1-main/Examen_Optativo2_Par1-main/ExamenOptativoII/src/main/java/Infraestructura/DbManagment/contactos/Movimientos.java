/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Infraestructura.DbManagment.contactos;

import Infraestructura.Coneciones.ConeccionDB;
import Infraestructura.Modelos.Movimientos_models;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class Movimientos {
    
       
    private final ConeccionDB conexion;

    public Movimientos(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        conexion = new ConeccionDB(userBD, passDB, hostDB, portDB, dataBase);
    }
    
    public String registrarMovimiento(Movimientos_models movimiento){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("INSERT INTO movimientos(" +
                    "id_movimiento, " +
                    "id_cuenta, " +
                    "fecha_movimiento, " +
                    "tipo_movimiento, " +
                    "saldo_anterior, " +
                    "saldo_actual, " +
                    "monto_movimiento, " +
                    "cuenta_origen, " +
                    "cuenta_destino, " +
                    "canal )" +
                    "values('" +
                    movimiento.getIdMovimiento()+ "' , '"+
                    movimiento.getIdCuenta()  + "' , '" +
                    movimiento.getFechaMovimiento() +"' , '" + 
                    movimiento.getTipoMovimiento() + "' , '"+
                    movimiento.getSaldoanterior() + "' , '"+
                    movimiento.getSaldoactual() + "' , '"+
                    movimiento.getMontomovimiento()  + "' , '"+
                    movimiento.getCuentaOrigen()  + "' , '"+
                    movimiento.getCuentaDestino() + "' , '"+
                    movimiento.getCanal()+ "')");
            conexion.conexionDB().close();
            return "El movimiento " + movimiento.getIdMovimiento() + " fue registrada exitosamente";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
     public String modificarMovimiento(Movimientos_models movimiento){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE movimientos SET " +
                   
                    "fecha_movimiento = ' " + movimiento.getFechaMovimiento() + " ',  " +
                    "tipo_movimiento = ' " + movimiento.getTipoMovimiento() + " ' ,  " +
                    "saldo_anterior = " + movimiento.getSaldoanterior()+ " ,  " +
                    "saldo_actual =  " + movimiento.getSaldoactual() + " , " +
                    "monto_movimiento  = " + movimiento.getMontomovimiento() + " , " +
                    "cuenta_origen = " + movimiento.getCuentaOrigen() + ", " +
                    "cuenta_destino = " + movimiento.getCuentaDestino()+ "," +
                    "canal = " + movimiento.getCanal()
                  + "  Where movimientos.id_movimiento = " + movimiento.getIdMovimiento());
            conexion.conexionDB().close();
            return "Los datos del movimient con id,  " + movimiento.getIdMovimiento() + " fue modificado exitosamente";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
     
     public Movimientos_models consultarMovimiento(int id){
        Movimientos_models movimiento = new Movimientos_models();
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("Select * from movimientos where id_movimiento= " + id));
            if(conexion.getResultadoQuery().next()){
                movimiento.setIdMovimiento (conexion.getResultadoQuery().getString("id_movimiento"));
                movimiento.setIdCuenta(conexion.getResultadoQuery().getString("id_cuenta"));
                movimiento.setFechaMovimiento (conexion.getResultadoQuery().getDate("fecha_movimiento"));
                movimiento.setTipoMovimiento (conexion.getResultadoQuery().getString("tipo_movimiento"));
                movimiento.setSaldoanterior (conexion.getResultadoQuery().getString("saldo_anterior"));
                movimiento.setSaldoactual (conexion.getResultadoQuery().getString("saldo_actual"));
                movimiento.setMontomovimiento(conexion.getResultadoQuery().getString("monto_movimiento"));
                movimiento.setCuentaOrigen(conexion.getResultadoQuery().getString("cuenta_origen"));
                movimiento.setCuentaDestino(conexion.getResultadoQuery().getString("cuenta_destino"));
                movimiento.setCanal( conexion.getResultadoQuery().getString("canal"));
                
                return movimiento;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
     public String eliminarmovimiento(int id){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("DELETE FROM movimientos" +
                    " Where id_movimiento = '" + id+ "'");
            conexion.conexionDB().close();
            return "Los datos de la persona fueron eliminados correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }}
    
}

    

