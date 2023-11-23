/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Infraestructura.DbManagment.contactos;

import Infraestructura.Coneciones.ConeccionDB;
import Infraestructura.Modelos.Cliente_modelo;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class Cliente {
     
    private final ConeccionDB conexion;

    public Cliente(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        conexion = new ConeccionDB(userBD, passDB, hostDB, portDB, dataBase);
    }
    
    
    public String registrarCliente(Cliente_modelo cliente){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("INSERT INTO cliente("+ 
                    "id_cliente , " +
                    "id_persona , " +
                    "fecha_ingreso,"+
                    "calificacion ,"+
                    "estado)" +
                    "values('" +
                    cliente.getIdCliente()+ "' , '"+
                    cliente.getIdPersona()  + "' , '" +
                    cliente.getFechaIngreso() +"' , '" +
                    cliente.getCalificacion()+  "' , '"+
                    cliente.getEstado() + "')");
            conexion.conexionDB().close();
            return "La Cliente " + cliente.getIdCliente() + " fue registrada exitosamente";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
     public String modificarCliente(Cliente_modelo cliente){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE cliente SET " +
                    
                    "fecha_ingreso  =' " +cliente.getFechaIngreso()+ "', " +
                    "calificacion  =' " + cliente.getCalificacion()+ "', " +
                    "estado = '" + cliente.getEstado()+ "'"
                    + " Where cliente.id_cliente = " + cliente.getIdCliente());
            conexion.conexionDB().close();
            return "Los datos de la cliente con id " + cliente.getIdCliente() + " fue modificado exitosamente";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
     
     public Cliente_modelo consultarCliente(int id){
        Cliente_modelo cliente = new Cliente_modelo();
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("Select * from cliente where id_cliente = " + id));
            if(conexion.getResultadoQuery().next()){
                cliente.setIdCliente(conexion.getResultadoQuery().getString("id_cliente"));
                cliente.setIdPersona(conexion.getResultadoQuery().getString("id_persona"));
                cliente.setFechaIngreso(conexion.getResultadoQuery().getDate("fecha_ingreso"));
                cliente.setCalificacion(conexion.getResultadoQuery().getString("calificacion"));
                cliente.setEstado(conexion.getResultadoQuery().getString("estado"));
                
                return cliente;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
       public String eliminarcliente(int id){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("DELETE FROM cliente" +
                    " Where id_cliente = '" + id+ "'");
            conexion.conexionDB().close();
            return "Los datos del cliente fueron eliminados correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }}
    
}
