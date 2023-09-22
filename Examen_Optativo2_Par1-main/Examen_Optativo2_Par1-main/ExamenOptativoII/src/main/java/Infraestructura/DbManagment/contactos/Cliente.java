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
            boolean execute = conexion.getQuerySQL().execute("INSERT INTO cliente("+ "id_cliente , " +
                    "departamento , " +
                    "codigo_postal  )" +
                    "values(" +
                    cliente.IdCliente+ " , "+
                    cliente.IdPersona  + " ," +
                    cliente.FechaIngreso +" , " +
                    cliente.Calificacion  +  " , "+
                    cliente.Estado + ")");
            conexion.conexionDB().close();
            return "La Cliente " + cliente.IdCliente + " fue registrada exitosamente";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
     public String modificarCliente(Cliente_modelo cliente){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE cliente SET " +
                    "id_persona' = '" + cliente.IdPersona + "'," +
                    "fecha_ingreso ' = '" +cliente.FechaIngreso + "'," +
                    "calificacion ' = '" + cliente.Calificacion+ "'," +
                    "estado = '" + cliente.Estado+ "'," 
                    + "' Where cliente.id_cliente = " + cliente.IdCliente);
            conexion.conexionDB().close();
            return "Los datos de la cliente con id " + cliente.IdCliente + " fue modificado exitosamente";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
     
     public Cliente_modelo consultarCliente(int id){
        Cliente_modelo cliente = new Cliente_modelo();
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("Select * from c liente where id_cliente = " + id));
            if(conexion.getResultadoQuery().next()){
                cliente.IdCliente = conexion.getResultadoQuery().getInt("id_cliente");
                cliente.IdPersona = conexion.getResultadoQuery().getInt("id_persona");
                cliente.FechaIngreso= conexion.getResultadoQuery().getDate("fecha_ingreso");
                cliente.Calificacion= conexion.getResultadoQuery().getString("calificacion");
                cliente.Estado = conexion.getResultadoQuery().getString("estado");
                
                return cliente;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    
}
