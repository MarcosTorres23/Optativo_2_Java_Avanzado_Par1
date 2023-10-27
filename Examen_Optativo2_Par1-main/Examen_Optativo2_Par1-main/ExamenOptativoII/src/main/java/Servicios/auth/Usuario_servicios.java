/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios.auth;

import Infraestructura.Coneciones.ConeccionDB;
import Infraestructura.DbManagment.auth.Authentication;
import Infraestructura.DbManagment.contactos.Personas;
import Infraestructura.Modelos.Usuarios_modelo;


/**
 *
 * @author User
 */
public class Usuario_servicios {
    
     private Authentication  usuariosDB;
    public Usuario_servicios(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        usuariosDB = new Authentication(userBD, passDB, hostDB, portDB, dataBase);
    }
    
    public Usuarios_modelo autenticar(String usuario){
        return usuariosDB.Autenticar(usuario);
    }
    
}
