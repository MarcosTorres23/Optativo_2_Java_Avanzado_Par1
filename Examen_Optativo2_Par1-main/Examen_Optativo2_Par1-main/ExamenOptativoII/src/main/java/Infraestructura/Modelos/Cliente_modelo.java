/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Infraestructura.Modelos;

import java.util.Date;

/**
 *
 * @author User
 */
public class Cliente_modelo {
 private String IdCliente;
    private String IdPersona;
    private Date FechaIngreso;
    private String Calificacion;
    private String Estado;
    /**
     * @return the IdCliente
     */
    public String getIdCliente() {
        return IdCliente;
    }

    /**
     * @param IdCliente the IdCliente to set
     */
    public void setIdCliente(String IdCliente) {
        this.IdCliente = IdCliente;
    }

    /**
     * @return the IdPersona
     */
    public String getIdPersona() {
        return IdPersona;
    }

    /**
     * @param IdPersona the IdPersona to set
     */
    public void setIdPersona(String IdPersona) {
        this.IdPersona = IdPersona;
    }

    /**
     * @return the FechaIngreso
     */
    public Date getFechaIngreso() {
        return FechaIngreso;
    }

    /**
     * @param FechaIngreso the FechaIngreso to set
     */
    public void setFechaIngreso(Date FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    /**
     * @return the Calificacion
     */
    public String getCalificacion() {
        return Calificacion;
    }

    /**
     * @param Calificacion the Calificacion to set
     */
    public void setCalificacion(String Calificacion) {
        this.Calificacion = Calificacion;
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
