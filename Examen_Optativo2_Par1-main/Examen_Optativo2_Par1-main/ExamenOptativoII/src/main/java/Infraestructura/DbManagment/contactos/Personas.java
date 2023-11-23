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


    private  ConeccionDB conexion;

    public Personas(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        conexion = new ConeccionDB(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarPersona(Persona_modelo persona){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("INSERT INTO personas("+
                    "id_personas,"+
                  
                    "id_ciudad, "+
                    "nombre, " +
                    "apellido, " +
                    "tipo_documento, " +
                    "nro_documento, " +
                    "direccion," +
                    "celular, " +
                    "email, " +
                    "estado, " +
                    "fechanacimiento ) " +
                    "values('" +
                    persona.getIdPersona()+"','"+
                    persona.getIdCiudad() +"','" +
                    persona.getNombre() + "', '" +
                    persona.getApellido() + "', '" +
                    persona.getTipoDocumento() + "', '" +
                    persona.getNroDocumento() + "', '" +
                    persona.getDireccion ()+ "', '" +
                    persona.getCelular ()+ "', '" +
                    persona.getEmail() + "', '" +
                    persona.getEstado() + "', '"+
                    persona.getFecha () +"')");
            conexion.conexionDB().close();
            return "La persona " + persona.getNombre() + " fue registrada exitosamente";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String modificarPersona(Persona_modelo persona){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE personas SET " +
                   
                    " nombre = '" + persona.getNombre() + "', " +
                    " apellido = '" + persona.getApellido() + "'," +
                    " tipo_documento = '" + persona.getTipoDocumento() + "', " +
                    " nro_documento = " + persona.getNroDocumento() + ", " +
                    " direccion = '" + persona.getDireccion() + "', " +
                    " celular = '" + persona.getCelular() + "', " +
                    " email = '" + persona.getEmail() + "', "+
                    " estado = '" + persona.getEstado() + "',"+
                    " fechanacimiento = '" + persona.getFecha() + "'"
                    + " Where personas.id_personas = " + persona.getIdPersona());
            conexion.conexionDB().close();
            return "Los datos de la persona " + persona.getNombre() + " fue modificado exitosamente";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Persona_modelo consultarPersona(int id){
        Persona_modelo persona = new Persona_modelo();
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("Select * from personas where id_personas = " + id ));
            if(conexion.getResultadoQuery().next()){
                persona.setIdPersona(conexion.getResultadoQuery().getString("id_personas"));
                persona.setIdCiudad( conexion.getResultadoQuery().getString("id_ciudad"));
                persona.setNombre (conexion.getResultadoQuery().getString("nombre"));
                persona.setApellido(conexion.getResultadoQuery().getString("apellido"));
                persona.setTipoDocumento( conexion.getResultadoQuery().getString("tipo_documento"));
                persona.setNroDocumento(conexion.getResultadoQuery().getString("nro_documento"));
                persona.setDireccion(conexion.getResultadoQuery().getString("direccion"));
                persona.setCelular(conexion.getResultadoQuery().getString("celular"));
                persona.setEmail(conexion.getResultadoQuery().getString("email"));
                persona.setEstado( conexion.getResultadoQuery().getString("estado"));
                persona.setFecha(conexion.getResultadoQuery().getDate("fechanacimiento"));

                return persona;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;

    }
    public Persona_modelo consultarPersonaPorDocumento(int documento){
        Persona_modelo persona = new Persona_modelo();
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("Select * from persona where nro_documento = " + documento));
            if(conexion.getResultadoQuery().next()){
                persona.setIdCiudad(conexion.getResultadoQuery().getString("id_ciudad"));
                persona.setNombre(conexion.getResultadoQuery().getString("nombre"));
                persona.setApellido(conexion.getResultadoQuery().getString("apellido"));
                persona.setTipoDocumento(conexion.getResultadoQuery().getString("tipo_documento"));
                persona.setNroDocumento(conexion.getResultadoQuery().getString("nro_documento"));
                persona.setDireccion(conexion.getResultadoQuery().getString("direccion"));
                persona.setCelular(conexion.getResultadoQuery().getString("celular"));
                persona.setEmail(conexion.getResultadoQuery().getString("email"));
                persona.setEstado(conexion.getResultadoQuery().getString("estado"));
                persona.setFecha(conexion.getResultadoQuery().getDate("fechanacimiento"));


                return persona;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
     public String eliminarpersona(int id){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("DELETE FROM personas" +
                    " Where id_personas = '" + id+ "'");
            conexion.conexionDB().close();
            return "Los datos de la persona fueron eliminados correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }}}
    

