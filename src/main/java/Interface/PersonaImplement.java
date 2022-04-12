/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import static Conexion.conexion.*;
import EntidadPersona.EntidadPersona;
import java.sql.*;

/**
 *
 * @author marti
 */
public class PersonaImplement implements InterfacePersona {
    
    
    private static final String SQL_SELECT = "SELECT cedula, nombre, edad,cargo FROM persona where cedula =?";
    private static final String SQL_INSERT = "INSERT INTO persona VALUES(?, ?, ?,?)";
    private static final String SQL_UPDATE = "UPDATE cargo SET  codigo_cargo=?, nombre_cargo = ?, sueldo = ? WHERE codigo_cargo = ?";
   private static final String SQL_DELETE = "DELETE FROM persona WHERE cedula = ?";

    @Override
    public void Insertar(EntidadPersona persona) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {

            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, persona.getCedula());
            stmt.setString(2, persona.getNombre());
            stmt.setInt(3, persona.getEdad());
            stmt.setString(4, persona.getCargo());
            stmt.executeUpdate(); // actualizo el registro
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                // cierro las conexiones

                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

    }

    @Override
    public void modificar(EntidadPersona persona) {

    }

    @Override
    public void buscar(EntidadPersona persona) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {

            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            stmt.setInt(1, persona.getCedula());

            ResultSet consulta = stmt.executeQuery(); // actualizo el registro

            if (consulta.next()) {
                persona.setCedula(Integer.parseInt(consulta.getString("cedula")));
                persona.setNombre(consulta.getString("nombre"));
                persona.setEdad(Integer.parseInt(consulta.getString("edad")));
                persona.setCargo(consulta.getString("cargo"));

            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                // cierro las conexiones

                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }

    @Override
    public void Eliminar(EntidadPersona persona) {
        Connection conn = null;
        PreparedStatement eliminar = null;
        try {
            conn = getConnection();
            eliminar = conn.prepareStatement(SQL_DELETE);
            eliminar.setInt(1, persona.getCedula());
            eliminar.executeUpdate(); // actualizo el registro
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                // cierro las conexiones

                close(eliminar);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

    }
}
