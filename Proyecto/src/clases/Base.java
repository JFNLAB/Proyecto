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
                    + " SALARIO TEXT NOT NULL,"
                    + " H_ENTRADA INTEGER NOT NULL,"
                    + " M_ENTRADA INTEGER NOT NULL,"
                    + " H_SALIDA INTEGER NOT NULL,"
                    + " M_SALIDA TEXT NOT NULL,"
                    + " REGISTRADO INTEGER NOT NULL,"
                    + " LLEGADAS_TARDE INTEGER NOT NULL)";
            stmt.executeUpdate(sql);

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public boolean guardar(String codigo, String nombre, String apellido, String edad, String email, String direccion, String salario, int h_entrada, int m_entrada, int h_salida, int m_salida) {
        boolean ret = false;
        try {
            stmt.execute("INSERT INTO empleado (CODIGO,NOMBRE,APELLIDO,EDAD,EMAIL,DIRECCION,SALARIO,H_ENTRADA,M_ENTRADA,H_SALIDA,M_SALIDA,REGISTRADO,LLEGADAS_TARDE) VALUES('" + codigo + "', '" + nombre + "', '" + apellido + "', '" + edad + "', '" + email + "', '" + direccion + "', '" + salario + "' , '" + h_entrada + "' , '" + m_entrada + "' , '" + h_salida + "', '" + m_salida + "','" + 0 + "' , '" + 0 + "')");
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
                while (nombre.length() < 10) {
                    nombre += " ";
                }
                String apellido = rs.getString("APELLIDO");
                while (apellido.length() < 15) {
                    apellido += " ";
                }
                String edad = rs.getString("EDAD");
                while (edad.length() < 7) {
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
                    int h_entrada = (rs.getInt("H_ENTRADA"));
                    int m_entrada = (rs.getInt("M_ENTRADA"));
                    Date hora = new java.util.Date();
                    int hora_actual = hora.getHours();
                    int min_actuales = hora.getMinutes();

                    if ((hora_actual > h_entrada)) {
                        empleado_tiempo = "Estas tarde";
                        stmt.executeUpdate("UPDATE EMPLEADO SET REGISTRADO = 1 LLEGADAS_TARDE = " + (rs.getInt("LLEGADAS_TARDE") + 1) + "WHERE CODIGO =  " + num);
                    } else if (hora_actual == h_entrada) {
                        if (min_actuales > m_entrada) {
                            empleado_tiempo = "Llegaste tarde";
                            stmt.executeUpdate("UPDATE EMPLEADO SET REGISTRADO = 1 LLEGADAS_TARDE = " + (rs.getInt("LLEGADAS_TARDE") + 1) + "WHERE CODIGO =  " + num);
                        } else {
                            empleado_tiempo = "Llegaste bien";
                            stmt.executeUpdate("UPDATE EMPLEADO SET REGISTRADO = 1 WHERE CODIGO =  " + num);
                        }
                    }

                    break;
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
