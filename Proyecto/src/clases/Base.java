/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Date;

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

    public boolean guardar(String codigo, String nombre, String apellido, String edad, String email, String direccion, String salario) {
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

    public ArrayList mostrarLista() {
        String auxlista = null;
        ArrayList<String> lista = new ArrayList();
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLEADO");
            while (rs.next()) {

                String codigo = rs.getString("CODIGO");
                while (codigo.length() < 10) {
                    codigo += " ";
                }
                String nombre = rs.getString("NOMBRE");
                while (nombre.length() <10) {
                    nombre += " ";
                }
                String apellido = rs.getString("APELLIDO");
                while (apellido.length() < 20) {
                    apellido += " ";
                }
                    String edad = rs.getString("EDAD");
                    while (edad.length() < 5) {
                        edad += " ";
                }
                    String email = rs.getString("EMAIL");
                    while (email.length() < 28) {
                        email += " ";
                }
                    String direccion = rs.getString("DIRECCION");
                    while (direccion.length() < 17) {
                        direccion += " ";
                }
                    String salario = rs.getString("SALARIO");
                    while (salario.length() < 11) {
                        salario += " ";
                }
                auxlista = (codigo + nombre + apellido + edad + email + direccion + salario);
                lista.add(auxlista);
            }

            
            
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return lista;
    }

    public String[] entrar(String num) {
        String empleadoLogN;
        String empleadoLogA;
        String empleadoLog = null;
        String empleado_tiempo = null;
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLEADO");
            while (rs.next()) {
                if (rs.getString("CODIGO").equals(num)) {
                    empleadoLogN = rs.getString("NOMBRE");
                    empleadoLogA = rs.getString("APELLIDO");
                    empleadoLog = empleadoLogN + " " + empleadoLogA;
                    int hora_entrada = 8;
                    Date ingreso = new java.util.Date();
                    int hora_empleado = ingreso.getHours();
                    int minuto_empleado = ingreso.getMinutes();
                    if ((hora_empleado > hora_entrada)) {
                        empleado_tiempo = "Estas tarde wey";
                    } else if (hora_empleado < hora_entrada) {
                        empleado_tiempo = "Llegaste a tiempo wey";
                    } else if (minuto_empleado > 0) {
                        empleado_tiempo = "por los pelos wey";
                    } else {
                        empleado_tiempo = "casi llegas wn";
                    }
                } else {
                    empleadoLog = ("No se encontro el empleado");
                }
            }
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        String[] a = {empleadoLog, empleado_tiempo};
        return a;

    }

    public boolean eliminar(String eliminar) {
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
