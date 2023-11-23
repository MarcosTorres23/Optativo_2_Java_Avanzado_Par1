/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Infraestructura.DbManagment.auth;

import Infraestructura.Coneciones.ConeccionDB;
import Infraestructura.DbManagment.contactos.Personas;
import Infraestructura.Modelos.Persona_modelo;
import Infraestructura.Modelos.Usuarios_modelo;

import java.sql.SQLException;

/**
 *
 * @author User
 */
public class Authentication {
    private  ConeccionDB conexion;
    private Personas persona;

    public Authentication(String userBD, String passDB, String hostDB, String portDB, String dataBase) {
        this.conexion = new ConeccionDB(userBD, passDB, hostDB, portDB, dataBase);
        this.persona = new Personas(userBD, passDB, hostDB, portDB, dataBase);
    }
    public Usuarios_modelo Autenticar(String usuario){
        
        try {
            Usuarios_modelo usuariomodelo = new Usuarios_modelo();
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("Select * from usuarios  where usuario = '" + usuario +"'" ));
            if(conexion.getResultadoQuery().next()){
                usuariomodelo.setIDUsuario  (conexion.getResultadoQuery().getString("idusuario"));
                usuariomodelo.setContraseña  (conexion.getResultadoQuery().getString("contrasena"));
                usuariomodelo.setPersonas (persona.consultarPersona(conexion.getResultadoQuery().getInt("idpersona")));
                usuariomodelo.setEstado (conexion.getResultadoQuery().getString("estado"));
                
                return usuariomodelo;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
        
    }
    
    public String registrarUsuario(Usuarios_modelo usuario){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("INSERT INTO usuarios("+
                    
                    "idpersona, " +
                    "usuario, " +
                    "contrasena, " +
                    "estado)"  +
                    "values(" + usuario.getPersonas().getIdPersona() +",'" + usuario.getUsuario() + "',' " + usuario.getContraseña() + "','ACTIVO')");
            conexion.conexionDB().close();
            return "La persona " + usuario.getUsuario() + " fue registrada exitosamente";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
     public Usuarios_modelo editatCiudad(int id){
        Usuarios_modelo  usuario = new Usuarios_modelo();
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("Select * from ciudades where id_ciudad = " + id));
            if(conexion.getResultadoQuery().next()){
                usuario.setUsuario(conexion.getResultadoQuery().getString("usuario"));
                usuario.setContraseña(conexion.getResultadoQuery().getString("contrasena"));    
                usuario.setIDUsuario(conexion.getResultadoQuery().getString("idusuario"));
                usuario.setEstado(conexion.getResultadoQuery().getString("estado"));
                
/*                ciudad.Codigopostal = conexion.getResultadoQuery().getInt("codigo_postal"); Definido como numeric
*/
                return usuario;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
      public String modificarPersona(Usuarios_modelo ciudad){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE ciudades "
                    + "SET " + 
                     " estado = '" + ciudad.getEstado()+ "'," +
                    " usuario = '" + ciudad.getUsuario()+ "'," +
                    "contrasena = '" + ciudad.getContraseña()+ "'" +
                    " Where ciudades.id_ciudad = " + ciudad.getIDUsuario());
            conexion.conexionDB().close();
            return "Los datos de la ciudad " + ciudad.getIDUsuario()+ " fue modificado exitosamente";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
}
}
