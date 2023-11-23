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
public class Cuentas_modelo {
private String IdCuenta;
    private String IdCliente;
    private String NroCuenta;
    private String TipoCuenta;
    private Date FechaAlta;
    private String Estado;
    private String Saldo;
    private String NroContrato;
    private String CostoMantenimiento;
    private String PromedioAcreditacion;
    private String Moneda;  
    
    /**
     * @return the IdCuenta
     */
    public String getIdCuenta() {
        return IdCuenta;
    }

    /**
     * @param IdCuenta the IdCuenta to set
     */
    public void setIdCuenta(String IdCuenta) {
        this.IdCuenta = IdCuenta;
    }

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
     * @return the NroCuenta
     */
    public String getNroCuenta() {
        return NroCuenta;
    }

    /**
     * @param NroCuenta the NroCuenta to set
     */
    public void setNroCuenta(String NroCuenta) {
        this.NroCuenta = NroCuenta;
    }

    /**
     * @return the TipoCuenta
     */
    public String getTipoCuenta() {
        return TipoCuenta;
    }

    /**
     * @param TipoCuenta the TipoCuenta to set
     */
    public void setTipoCuenta(String TipoCuenta) {
        this.TipoCuenta = TipoCuenta;
    }

    /**
     * @return the FechaAlta
     */
    public Date getFechaAlta() {
        return FechaAlta;
    }

    /**
     * @param FechaAlta the FechaAlta to set
     */
    public void setFechaAlta(Date FechaAlta) {
        this.FechaAlta = FechaAlta;
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

    /**
     * @return the Saldo
     */
    public String getSaldo() {
        return Saldo;
    }

    /**
     * @param Saldo the Saldo to set
     */
    public void setSaldo(String Saldo) {
        this.Saldo = Saldo;
    }

    /**
     * @return the NroContrato
     */
    public String getNroContrato() {
        return NroContrato;
    }

    /**
     * @param NroContrato the NroContrato to set
     */
    public void setNroContrato(String NroContrato) {
        this.NroContrato = NroContrato;
    }

    /**
     * @return the CostoMantenimiento
     */
    public String getCostoMantenimiento() {
        return CostoMantenimiento;
    }

    /**
     * @param CostoMantenimiento the CostoMantenimiento to set
     */
    public void setCostoMantenimiento(String CostoMantenimiento) {
        this.CostoMantenimiento = CostoMantenimiento;
    }

    /**
     * @return the PromedioAcreditacion
     */
    public String getPromedioAcreditacion() {
        return PromedioAcreditacion;
    }

    /**
     * @param PromedioAcreditacion the PromedioAcreditacion to set
     */
    public void setPromedioAcreditacion(String PromedioAcreditacion) {
        this.PromedioAcreditacion = PromedioAcreditacion;
    }

    /**
     * @return the Moneda
     */
    public String getMoneda() {
        return Moneda;
    }

    /**
     * @param Moneda the Moneda to set
     */
    public void setMoneda(String Moneda) {
        this.Moneda = Moneda;
    }
    
}
