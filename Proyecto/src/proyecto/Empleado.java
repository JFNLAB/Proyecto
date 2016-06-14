/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author julian
 */
public class Empleado {
    private String nombre = "";
    private String apellido = "";
    private String direccion = "";
    private int edad = 0;
    private String email = "";
    private Double codigo = 0.0;
    
    public Empleado (){
        
    }
    
    public Empleado(String nombre, String apellido, String direccion, int edad, String email, Double codigo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
        this.email = email;
        this.codigo = codigo;
        
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

    public Double getCodigo() {
        return codigo;
    }

    public void setCodigo(Double codigo) {
        this.codigo = codigo;
    }
    
    
}
