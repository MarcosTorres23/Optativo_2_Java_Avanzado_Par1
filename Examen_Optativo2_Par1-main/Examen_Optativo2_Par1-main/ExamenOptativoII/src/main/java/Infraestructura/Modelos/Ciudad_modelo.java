/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Infraestructura.Modelos;

/**
 *
 * @author User
 */
public class Ciudad_modelo {

    /**
     * @return the Idciudad
     */
    public String getIdciudad() {
        return Idciudad;
    }

    /**
     * @param Idciudad the Idciudad to set
     */
    public void setIdciudad(String Idciudad) {
        this.Idciudad = Idciudad;
    }

    /**
     * @return the Nombre_ciudad
     */
    public String getNombre_ciudad() {
        return Nombre_ciudad;
    }

    /**
     * @param Nombre_ciudad the Nombre_ciudad to set
     */
    public void setNombre_ciudad(String Nombre_ciudad) {
        this.Nombre_ciudad = Nombre_ciudad;
    }

    /**
     * @return the Departamento
     */
    public String getDepartamento() {
        return Departamento;
    }

    /**
     * @param Departamento the Departamento to set
     */
    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    /**
     * @return the Codigopostal
     */
    public String getCodigopostal() {
        return Codigopostal;
    }

    /**
     * @param Codigopostal the Codigopostal to set
     */
    public void setCodigopostal(String Codigopostal) {
        this.Codigopostal = Codigopostal;
    }
    
    private String Idciudad;
    private String Nombre_ciudad;
    private String Departamento;
    private String Codigopostal;
   
}
