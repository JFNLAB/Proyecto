/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.*;
import java.util.ArrayList;
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
                    + " EDAD INTEGER NOT NULL,"
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

    public boolean guardar(Empleado auxEmpleado,Horario auxHorario) {
        boolean ret = false;
        String codigo = auxEmpleado.getCodigo();
        String nombre = auxEmpleado.getNombre();
        String apellido = auxEmpleado.getApellido();
        int edad = auxEmpleado.getEdad();
        String email = auxEmpleado.getEmail();
        String direccion = auxEmpleado.getDireccion();
        String salario = auxEmpleado.getSalario();
        int h_entrada = auxHorario.getHora_inicio();
        int m_entrada = auxHorario.getMin_inicio();
        int h_salida = auxHorario.getHora_fin();
        int m_salida = auxHorario.getMin_fin();
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
                String llegadastarde = rs.getString("LLEGADAS_TARDE");
                while (llegadastarde.length() < 6) {
                    llegadastarde += " ";
                }

                auxlista = (codigo + nombre + apellido + edad + email + direccion + salario + llegadastarde);
                lista.add(auxlista);
            }

        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return lista;
    }

    public ArrayList mostrarListaReg() {
        String auxlista = null;
        ArrayList<String> lista3 = new ArrayList();
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLEADO WHERE REGISTRADO = 1");
            while (rs.next()) {

                String nombre = rs.getString("NOMBRE");
                while (nombre.length() < 10) {
                    nombre += " ";
                }
                String apellido = rs.getString("APELLIDO");
                while (apellido.length() < 15) {
                    apellido += " ";
                }
                auxlista = (nombre + apellido);
                lista3.add(auxlista);
            }

        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return lista3;
    }

    public ArrayList mostrarListaNoReg() {
        String auxlista = null;
        ArrayList<String> lista2 = new ArrayList();
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLEADO WHERE REGISTRADO = 0");
            while (rs.next()) {

                String nombre = rs.getString("NOMBRE");
                while (nombre.length() < 10) {
                    nombre += " ";
                }
                String apellido = rs.getString("APELLIDO");
                while (apellido.length() < 15) {
                    apellido += " ";
                }
                auxlista = (nombre + apellido);
                lista2.add(auxlista);
            }

        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return lista2;
    }

    public String entrar(String num) {
        String empleadoLogN;
        String empleadoLogA;
        String empleadoLog = null;
        String empleado_tiempo = null;
        String llegadasTarde = null;

        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLEADO");
            while (rs.next()) {
                if (rs.getString("CODIGO").equals(num) && (rs.getInt("REGISTRADO") == 0)) {
                    empleadoLogN = rs.getString("NOMBRE");
                    empleadoLogA = rs.getString("APELLIDO");
                    empleadoLog = empleadoLogN + " " + empleadoLogA;
                    int h_entrada = (rs.getInt("H_ENTRADA"));
                    int m_entrada = (rs.getInt("M_ENTRADA"));
                    Date hora = new java.util.Date();
                    int hora_actual = hora.getHours();
                    int min_actual = hora.getMinutes();
                    int llegadas_tarde = rs.getInt("LLEGADAS_TARDE");

                    System.out.println(llegadas_tarde);
                    if ((hora_actual > h_entrada)) {
                        stmt.executeUpdate("UPDATE EMPLEADO SET REGISTRADO = 1, LLEGADAS_TARDE = " + (llegadas_tarde + 1) + " WHERE CODIGO =  " + num);
                        empleado_tiempo = "\nEstas tarde";
                    } else {
                        if (hora_actual >= h_entrada) {
                            if (min_actual > m_entrada) {
                                stmt.executeUpdate("UPDATE EMPLEADO SET REGISTRADO = 1, LLEGADAS_TARDE = " + (llegadas_tarde + 1) + " WHERE CODIGO =  " + num);
                                empleado_tiempo = "\nEstas tarde";
                            } else {
                                empleado_tiempo = "\nLlegaste bien";
                                llegadasTarde= "";
                                stmt.executeUpdate("UPDATE EMPLEADO SET REGISTRADO = 1 WHERE CODIGO =  " + num);
                            }
                        } else {
                            empleado_tiempo = "\nLlegaste bien";
                            llegadasTarde= "";  
                            stmt.executeUpdate("UPDATE EMPLEADO SET REGISTRADO = 1 WHERE CODIGO =  " + num);
                        }

                        break;
                    }
                    llegadasTarde = "\nN° de llegadas tarde: " + (llegadas_tarde + 1);

                } else if (rs.getInt("REGISTRADO") == 1) {
                    empleadoLog = ("Empleado ya registrado");
                    empleado_tiempo = "";
                    llegadasTarde = "";
                } else {
                    empleadoLog = ("No se encontro el empleado");
                    empleado_tiempo = "";
                    llegadasTarde = "";
                }
            }
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        if ((empleadoLog == null && (empleado_tiempo == null && (llegadasTarde == null)))) {
            empleadoLog = "No hay empleados cargados";
            empleado_tiempo = "";
            llegadasTarde = "";
        }
        String a = empleadoLog + empleado_tiempo + llegadasTarde;
        return a;

    }

    public String salir(String num) {
        String empleadoLogN;
        String empleadoLogA;
        String empleadoLog = null;
        String empleado_tiempo = null;
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLEADO");
            while (rs.next()) {
                if (rs.getString("CODIGO").equals(num) && (rs.getInt("REGISTRADO") == 1)) {
                    empleadoLogN = rs.getString("NOMBRE");
                    empleadoLogA = rs.getString("APELLIDO");
                    empleadoLog = empleadoLogN + " " + empleadoLogA;
                    int h_salida = (rs.getInt("H_SALIDA"));
                    int m_salida = (rs.getInt("M_SALIDA"));
                    Date hora = new java.util.Date();
                    int hora_actual = hora.getHours();
                    int min_actual = hora.getMinutes();
                    if (hora_actual < h_salida) {
                        empleadoLog = "La jornada laboral no finalizo";
                        empleado_tiempo = "\nTu hora de salida es: " + h_salida + ":" + m_salida;
                    } else if (hora_actual >= h_salida) {
                        if (min_actual >= m_salida) {
                            stmt.executeUpdate("UPDATE EMPLEADO SET REGISTRADO = 0 WHERE CODIGO =  " + num);
                            empleadoLog = "Adios";
                            empleado_tiempo = "";
                        } else {
                            empleadoLog = "La jornada laboral no finalizo";
                            empleado_tiempo = "\nTu hora de salida es: " + h_salida + ":" + m_salida;
                        }
                    }
                } else if (rs.getInt("REGISTRADO") == 0){
                    empleadoLog = "El empleado no ha llegado aun";
                    empleado_tiempo = "";
                }else{
                    empleadoLog = ("No se encontro el empleado");
                    empleado_tiempo = "";
                }
            }
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        if ((empleadoLog == null && (empleado_tiempo == null ))) {
            empleadoLog = "No hay empleados cargados";
            empleado_tiempo = "";
        }
        String b = empleadoLog+empleado_tiempo;
        return b;
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
