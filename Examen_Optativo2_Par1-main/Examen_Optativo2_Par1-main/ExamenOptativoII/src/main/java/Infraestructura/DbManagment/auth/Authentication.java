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
                usuariomodelo.IDUsuario = conexion.getResultadoQuery().getInt("idusuario");
                usuariomodelo.Contraseña = conexion.getResultadoQuery().getString("contrasena");
                usuariomodelo.Persona = persona.consultarPersona(conexion.getResultadoQuery().getInt("idpersona"));
                usuariomodelo.Estado = conexion.getResultadoQuery().getString("estado");
                
                return usuariomodelo;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
        
    }
}
