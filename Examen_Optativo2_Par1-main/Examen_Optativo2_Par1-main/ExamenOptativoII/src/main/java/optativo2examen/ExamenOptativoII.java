/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package optativo2examen;

import Infraestructura.DbManagment.contactos.Cliente;
import Infraestructura.Modelos.*;
import Presentaciones.contactos.Login.Login1;
import Presentaciones.contactos.Login.MenuPrincipal;
import Servicios.Ciudad_servicios;
import Servicios.Cliente_servicios;
import Servicios.Cuentas_servicios;
import Servicios.Movimientos_servicios;
import Servicios.Personas_servicios;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author User
 */
public class ExamenOptativoII {
    

     public static void main(String[] args) {
         new MenuPrincipal().setVisible(true);

        Calendar calendario = Calendar.getInstance();
        calendario.set(2023, Calendar.SEPTEMBER, 21);


/*      Personas

        Personas_servicios personaService = new Personas_servicios("postgres", "0000", "localhost", "5432", "BaseDatos_Examen_OptativoII");

        Persona_modelo persona = new Persona_modelo();
        persona.Nombre = "Juan";
        persona.Apellido = "Perez";


        personaService.registrarPersona(persona);

        personaService.consultarPersonaPorId(1);

        personaService.modificarPersona(persona);
        */


       /*  Clientes

       Cliente_servicios clienteService =new Cliente_servicios("postgres", "0000", "localhost", "5432", "BaseDatos_Examen_OptativoII");



        Cliente_modelo cliente = new Cliente_modelo();
        cliente.IdCliente=1;
        cliente.IdPersona=1;
        cliente.FechaIngreso=calendario.getTime();
        cliente.Estado="Activo";
        cliente.Calificacion="Exelente";

        clienteService.registrarCliente(cliente);

        clienteService.consultarClientePorId(1);

        clienteService.modificarCliente(cliente);

         */

        /*   Ciudad

        Ciudad_servicios ciudadService = new Ciudad_servicios("postgres", "0000", "localhost", "5432", "BaseDatos_Examen_OptativoII");

        Ciudad_modelo ciudad = new Ciudad_modelo();
        ciudad.Nombre_ciudad="Asuncion";
        ciudad.Idciudad=2;
        ciudad.Departamento="Central";


        ciudadService.registrarCiudad(ciudad);

        ciudadService.consultarCiudadPorId(2);

        ciudadService.modificarCiudad(ciudad);

        */

        /*    Cuentas

        Cuentas_servicios cuentaService =new Cuentas_servicios("postgres", "0000", "localhost", "5432", "BaseDatos_Examen_OptativoII");

        Cuentas_modelo cuentas =new Cuentas_modelo();
        cuentas.IdCuenta=1;
        cuentas.IdCliente=1;
        cuentas.NroCuenta="1233";
        cuentas.TipoCuenta="Ahorro";
        cuentas.CostoMantenimiento= Float.valueOf(950000);
        cuentas.FechaAlta=calendario.getTime();
        cuentas.Moneda="Guaranies";
        cuentas.Saldo=Float.valueOf(50000);
        cuentas.PromedioAcreditacion= "30";
        cuentas.NroContrato="123";
        cuentas.Estado="Activo";

        cuentaService.registrarCuenta(cuentas);

        cuentaService.consultarCuentaPorId(1);

        cuentaService.modificarCuenta(cuentas);

        */
        /*   Movimientos

        Movimientos_servicios movimientoService =new Movimientos_servicios("postgres", "0000", "localhost", "5432", "BaseDatos_Examen_OptativoII");

        Movimientos_models movimiento = new Movimientos_models();
        movimiento.IdMovimiento=1;
        movimiento.IdCuenta=1;
        movimiento.TipoMovimiento="Extraccion";
        movimiento.FechaMovimiento=calendario.getTime();
        movimiento.Saldoanterior=Float.valueOf(450000);
        movimiento.Saldoactual=Float.valueOf(440000);
        movimiento.Montomovimiento=Float.valueOf(10000);
        movimiento.CuentaOrigen=Float.valueOf(123);
        movimiento.CuentaDestino=Float.valueOf(456);
        movimiento.Canal= Float.valueOf(1);

        movimientoService.registrarMovimientos(movimiento);
        movimientoService.modificarCuenta(movimiento);
        movimientoService.consultarMovimientoPorId(1);

 */





     }
     
}
