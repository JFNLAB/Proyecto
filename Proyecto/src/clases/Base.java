/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author julian - nico
 */
public class Base {

    Connection c = null;
    Statement stmt = null;

    public Base() {
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:basesita.db");
            stmt = c.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS EMPLEADO "
                    + "(ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"
                    + " CODIGO TEXT NOT NULL, "
                    + " NOMBRE TEXT NOT NULL, "
                    + " APELLIDO TEXT NOT NULL, "
                    + " EDAD TEXT NOT NULL,"
                    + " EMAIL TEXT NOT NULL, "
                    + " DIRECCION TEXT NOT NULL, "
                    + " SALARIO TEXT NOT NULL)";
            stmt.executeUpdate(sql);

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public boolean Guardar(String codigo, String nombre, String apellido, String edad, String email, String direccion, String salario) {
        boolean ret = false;
        try {
            stmt.execute("INSERT INTO empleado (CODIGO,NOMBRE,APELLIDO,EDAD,EMAIL,DIRECCION,SALARIO) VALUES('" + codigo + "', '" + nombre + "', '" + apellido + "', '" + edad + "', '" + email + "', '" + direccion + "', '" + salario + "')");
            ret = true;
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            ret = false;
        }
        return ret;
    }

    public ArrayList MostrarLista() {
        String auxlista = null;
        ArrayList<String> lista=new ArrayList();
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLEADO");
            while (rs.next()) {
                auxlista = (rs.getString("CODIGO") +" - " + rs.getString("NOMBRE")+" - "+rs.getString("APELLIDO")+" - "+rs.getString("EDAD")+" - "+rs.getString("EMAIL")+" - "+rs.getString("DIRECCION")+" - "+rs.getString("SALARIO"));
                lista.add(auxlista);
            }
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return lista;
    } 

    public String Entrar(String num) {
        String EmpleadoLogN;
        String EmpleadoLogA;
        String EmpleadoLog = null;
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLEADO");
            while (rs.next()) {
                if (rs.getString("CODIGO").equals(num)) {
                    EmpleadoLogN = rs.getString("NOMBRE");
                    EmpleadoLogA = rs.getString("APELLIDO");
                    EmpleadoLog = EmpleadoLogN + " " + EmpleadoLogA;
                }else{
                    EmpleadoLog = ("No se encontro el empleado");
                }
            }
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return EmpleadoLog;
    }
    

public boolean Eliminar(String eliminar) {
   boolean ret = false;
        try {
            ResultSet rs = stmt.executeQuery("SELECT CODIGO FROM EMPLEADO");
            while (rs.next()) {
                    stmt.execute("DELETE FROM EMPLEADO WHERE CODIGO = " + eliminar);
            }
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }          
   return ret;
}

}