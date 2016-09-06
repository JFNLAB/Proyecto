/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author julian
 */
public class Empleado {
    private String nombre ;
    private String apellido;
    private String direccion;
    private int edad;
    private String email;
    private String salario;
    private String codigo;
    private int llegadas_tarde;

    
    public Empleado(String nombre, String apellido, String direccion, int edad, String email,String salario, String codigo,int llegadas_tarde){
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
        this.email = email;
        this.salario = salario;
        this.codigo = codigo;
        this.llegadas_tarde = llegadas_tarde;

        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public int getLlegadas_tarde() {
        return llegadas_tarde;
    }

    public void setLlegadas_tarde(int llegadas_tarde) {
        this.llegadas_tarde = llegadas_tarde;
    }

    
}
