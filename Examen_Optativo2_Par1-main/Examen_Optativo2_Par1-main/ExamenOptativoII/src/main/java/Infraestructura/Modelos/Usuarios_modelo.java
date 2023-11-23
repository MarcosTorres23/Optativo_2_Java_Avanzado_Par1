/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Infraestructura.Modelos;

/**
 *
 * @author User
 */

public class Usuarios_modelo {

    /**
     * @return the IDUsuario
     */
    private String IDUsuario;
    private Persona_modelo Personas;
    private String Usuario;
    private String Contraseña;
    private String Estado;
    
    public String getIDUsuario() {
        return IDUsuario;
    }

    /**
     * @param IDUsuario the IDUsuario to set
     */
    public void setIDUsuario(String IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    /**
     * @return the Personas
     */
    public Persona_modelo getPersonas() {
        return Personas;
    }

    /**
     * @param Personas the Personas to set
     */
    public void setPersonas(Persona_modelo Personas) {
        this.Personas = Personas;
    }

    /**
     * @return the Usuario
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario the Usuario to set
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    /**
     * @return the Contraseña
     */
    public String getContraseña() {
        return Contraseña;
    }

    /**
     * @param Contraseña the Contraseña to set
     */
    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    /**
     * @return the Estado
     */
    public String getEstado() {
        return Estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    

}
