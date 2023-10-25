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
                    "'id_movimiendo', " +
                    "'id_cuenta', " +
                    "'fecha_movimiento', " +
                    "'tipo_movimiento', " +
                    "'saldo_anterior', " +
                    "'saldo_actual', " +
                    "'monto_movimiento' " +
                    "'cuenta_origen', " +
                    "'cuenta_destino', " +
                    "'canal', )" +
                    "values('" +
                    movimiento.IdMovimiento+ "','"+
                    movimiento.IdCuenta  + "','" +
                    movimiento.FechaMovimiento +"'" + 
                    movimiento.TipoMovimiento + "','"+
                    movimiento.Saldoanterior + "','"+
                    movimiento.Saldoactual + "','"+
                    movimiento.Montomovimiento  + "','"+
                    movimiento.CuentaOrigen  + "','"+
                    movimiento.CuentaDestino + "','"+
                    movimiento.Canal+ "')");
            conexion.conexionDB().close();
            return "El movimiento " + movimiento.IdMovimiento + " fue registrada exitosamente";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
     public String modificarMovimiento(Movimientos_models movimiento){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE cuentas SET " +
                    "'id_cuenta = '" + movimiento.IdCuenta + "', '" +
                    "' fecha_movimiento = ' " + movimiento.FechaMovimiento + " ', ' " +
                    "' tipo_movimiento = ' " + movimiento.TipoMovimiento + " ' , ' " +
                    " 'saldo_anterior = '" + movimiento.Saldoanterior+ " ' , ' " +
                    "'saldo_actual = ' " + movimiento.Saldoactual + " ', ' " +
                    "'monto_movimiento  = '" + movimiento.Montomovimiento + " ',' " +
                    "'cuenta_origen = '" + movimiento.CuentaOrigen + " ', ' " +
                    "'cuenta_destino = '" + movimiento.CuentaDestino+ "  ',' " +
                    "'canal = '" + movimiento.Canal+ "', '"
                  + " ' Where cliente.id_cliente = '" + movimiento.IdMovimiento);
            conexion.conexionDB().close();
            return "Los datos del movimient con id,  " + movimiento.IdMovimiento + " fue modificado exitosamente";
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
                movimiento.IdCuenta = conexion.getResultadoQuery().getInt("id_cuenta");
                movimiento.FechaMovimiento = conexion.getResultadoQuery().getDate("fecha_movimiento");
                movimiento.TipoMovimiento = conexion.getResultadoQuery().getString("tipo_movimiento");
                movimiento.Saldoanterior = conexion.getResultadoQuery().getString("saldo_anterior");
                movimiento.Saldoactual = conexion.getResultadoQuery().getString("saldo_actual");
                movimiento.Montomovimiento = conexion.getResultadoQuery().getString("monto_movimiento");
                movimiento.CuentaOrigen = conexion.getResultadoQuery().getString("cuenta_origen");
                movimiento.CuentaDestino = conexion.getResultadoQuery().getString("cuenta_destino");
                movimiento.Canal= conexion.getResultadoQuery().getString("canal");
                
                return movimiento;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    
}

    

