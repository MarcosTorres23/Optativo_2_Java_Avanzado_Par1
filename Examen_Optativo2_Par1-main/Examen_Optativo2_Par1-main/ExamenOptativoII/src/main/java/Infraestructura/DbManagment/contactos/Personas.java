/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Infraestructura.DbManagment.contactos;
import Infraestructura.Coneciones.ConeccionDB;
import Infraestructura.Modelos.Persona_modelo;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class Personas {


    private final ConeccionDB conexion;

    public Personas(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        conexion = new ConeccionDB(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarPersona(Persona_modelo persona){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("INSERT INTO personas("+"'id_ciudad'," +"'id_ciudad', "+
                    "'nombre', " +
                    "'apellido', " +
                    "'tipo_documento', " +
                    "'nro_documento', " +
                    "'direccion'," +
                    "'celular', " +
                    "'email', " +
                    "'estado') " +
                    "values('" +
                    persona.IdCiudad +"','" +
                    persona.Nombre + "', '" +
                    persona.Apellido + "', '" +
                    persona.TipoDocumento + "', '" +
                    persona.NroDocumento + "', '" +
                    persona.Direccion + "', '" +
                    persona.Celular + "', '" +
                    persona.Email + "', '" +
                    persona.estado + "'))");
            conexion.conexionDB().close();
            return "La persona " + persona.Nombre + " fue registrada exitosamente";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String modificarPersona(Persona_modelo persona){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE personas SET " +
                    "'id_ciudad = '" + persona.IdCiudad + "','" +
                    "'nombre = '" + persona.Nombre + "',' " +
                    "'apellido = '" + persona.Apellido + "','" +
                    "'tipo_documento = '" + persona.TipoDocumento + "', '" +
                    "'nro_documento = '" + persona.NroDocumento + "', '" +
                    "'direccion = '" + persona.Direccion + "', '" +
                    "'celular = '" + persona.Celular + "', '" +
                    "'email = '" + persona.Email + "',' "
                    + "' Where personas.idPersona = '" + persona.IdPersona);
            conexion.conexionDB().close();
            return "Los datos de la persona " + persona.Nombre + " fue modificado exitosamente";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Persona_modelo consultarPersona(int id){
        Persona_modelo persona = new Persona_modelo();
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("Select * from personas where id_personas = " + id));
            if(conexion.getResultadoQuery().next()){
                persona.IdCiudad= conexion.getResultadoQuery().getInt("id_ciudad");
                persona.Nombre = conexion.getResultadoQuery().getString("nombre");
                persona.Apellido = conexion.getResultadoQuery().getString("apellido");
                persona.TipoDocumento= conexion.getResultadoQuery().getString("tipo_documento");
                persona.NroDocumento= conexion.getResultadoQuery().getString("nro_documento");
                persona.Direccion= conexion.getResultadoQuery().getString("direccion");
                persona.Celular= conexion.getResultadoQuery().getString("celular");
                persona.Email= conexion.getResultadoQuery().getString("email");
                persona.estado= conexion.getResultadoQuery().getString("estado");

                return persona;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    
    
    
}
    

