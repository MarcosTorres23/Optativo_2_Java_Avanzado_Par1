/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Infraestructura.DbManagment.contactos;

import Infraestructura.Coneciones.ConeccionDB;
import Infraestructura.Modelos.Ciudad_modelo;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class Ciudad {
    
    private final ConeccionDB conexion;

    public Ciudad(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        conexion = new ConeccionDB(userBD, passDB, hostDB, portDB, dataBase);
    }
    
    
    public String registrarCiudad(Ciudad_modelo ciudad){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("INSERT INTO ciudades("+
                    " id_ciudad ,"+
                    " ciudad , " +
                    "departamento , " +
                    "code_postal )" +
                    "values('" +
                    ciudad.getIdciudad()+ "' , '" +
                    ciudad.getNombre_ciudad() +  "' , '" +
                    ciudad.getDepartamento() +  "' , '" +
                    ciudad.getCodigopostal()  +"' )");
            conexion.conexionDB().close();
            return "La Ciudad " + ciudad.getNombre_ciudad() + " fue registrada exitosamente";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
     public String modificarPersona(Ciudad_modelo ciudad){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE ciudades "
                    + "SET " +
                    "ciudad = '" + ciudad.getNombre_ciudad() + "'," +
                    " departamento = '" + ciudad.getDepartamento()+ "'," +
                    "code_postal = '" + ciudad.getCodigopostal() + "'" +
                    " Where ciudades.id_ciudad = " + ciudad.getIdciudad());
            conexion.conexionDB().close();
            return "Los datos de la ciudad " + ciudad.getIdciudad()+ " fue modificado exitosamente";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
      public Ciudad_modelo consultarCiudad(int id){
        Ciudad_modelo ciudad = new Ciudad_modelo();
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("Select * from ciudades where id_ciudad = " + id));
            if(conexion.getResultadoQuery().next()){
                ciudad.setIdciudad( conexion.getResultadoQuery().getString("id_ciudad"));
                ciudad.setNombre_ciudad(conexion.getResultadoQuery().getString("ciudad"));    
                ciudad.setDepartamento(conexion.getResultadoQuery().getString("departamento"));
                ciudad.setCodigopostal(conexion.getResultadoQuery().getString("code_postal"));
                
/*                ciudad.Codigopostal = conexion.getResultadoQuery().getInt("codigo_postal"); Definido como numeric
*/
                return ciudad;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
       public String eliminarciudad(int id){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("DELETE FROM ciudades" +
                    " Where id_ciudad = '" + id+ "'");
            conexion.conexionDB().close();
            return "Los datos del cliente fueron eliminados correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }}
      
     
}
