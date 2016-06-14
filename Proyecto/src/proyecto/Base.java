/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.sql.*;

/**
 *
 * @author nico
 */
public class Base {

    Connection c = null;
    Statement stmt = null;

    public Base() {
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:basesita.db");
            stmt = c.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS EMPLEADOS " +
                         "(ID INT PRIMARY KEY NOT NULL," +
                         " CODIGO INTEGER NOT NULL, " +
                         " NOMBRE TEXT NOT NULL, " + 
                         " APELLIDO TEXT NOT NULL, " +
                         " EMAIL TEXT NOT NULL, " +
                         " DIRECCION CHAR(50), " + 
                         " SALARIO REAL NOT NULL)"; 
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
            
        }catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
  }
}


